import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CrudService {
  private baseUrl='http://localhost:8081/SpringMVC/servlet/deleteOpportunitebyid';

  constructor(private http:HttpClient) { }
  
  public Add(opportunity:Object) :Observable<Object>{
    return this.http.post("http://localhost:8081/SpringMVC/servlet/Addopportunite",opportunity)
  }

    public devises():Observable<any>{
    return this.http.get("http://localhost:8081/SpringMVC/servlet/devises")
    }

     public deleteOpportunity(id: number): Observable<any> {
      return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
    }

    public allopportuninty(): Observable<any>{
      return this.http.get("http://localhost:8081/SpringMVC/servlet/AllOpportunity")
      }
}
