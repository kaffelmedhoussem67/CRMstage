import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders  } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { User} from '../user';

import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private currentUserSubject: BehaviorSubject<User>;
  public currentUser: Observable<User>;


  public get currentUserValue(): User {
      return this.currentUserSubject.value;
  }
  constructor(private http: HttpClient ) { }
  /*login(user: User): Observable<any>{
    return this.http.post<any>('http://localhost:8085/login', user);

  }*/
  login(email: string, password: string): any {
    return  this.http.get<User>(`http://localhost:8086/login/${email}/${password}`)
      .pipe(map(user => {

        //           user.authdata = window.btoa(email + ':' + password);
          localStorage.setItem('currentUser', JSON.stringify(user));
          this.currentUserSubject.next(user);
          return user;
        })

      );


  }
  }


