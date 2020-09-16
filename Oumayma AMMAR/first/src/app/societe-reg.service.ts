import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import{Societe} from './societe';

import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SocieteRegService {
  societe: Societe;
  constructor( private http: HttpClient) { }

/**
  * doRegistration
societe  */
public doRegistration(societe: Societe) {
   
  return this.http.post("http://localhost:8081/SpringMVC/servlet/addsociete",societe);
 }

 
 public deleteSociete(id: number) :  Observable<any>  {
  return this.http.delete ("http://localhost:8081/SpringMVC/servlet/deleteSociete" + "/"+   id );
  alert('SUCCESS!! :-)\n\n' );
}
 
public getSociete (){
   return this.http.get("http://localhost:8081/SpringMVC/servlet/AllSociete");
}

}
 