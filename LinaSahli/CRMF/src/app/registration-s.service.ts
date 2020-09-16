import { Injectable } from '@angular/core';
import {observableToBeFn} from 'rxjs/internal/testing/TestScheduler';
import { HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { User} from './user';

@Injectable({
  providedIn: 'root'
})
export class RegistrationSService {

  constructor(private http: HttpClient ) { }
  public loginUserFormRemote(user: User): Observable<any>{
    return this.http.post<any>('http://localhost:8085/login', user);



  }
}
