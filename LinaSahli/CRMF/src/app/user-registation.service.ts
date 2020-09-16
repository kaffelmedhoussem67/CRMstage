import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Contact} from './Contact';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserRegistationService {

  constructor(private http: HttpClient) { }


  public doRegistration = contact => this.http.post('http://localhost:8085/addContact', contact, {responseType: 'text' as 'json'});

 public getCon = () => this.http.get('http://localhost:8085/showall');

 public deleteUser = id => this.http.delete('http://localhost:8085/Cancel/' + id);
  public update(id, data): Observable<any> {
    return this.http.put('http://localhost:8085/modify/' + id , data);
  }

}
