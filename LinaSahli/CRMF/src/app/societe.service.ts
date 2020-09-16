import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SocieteService {

  constructor(private http: HttpClient) { }


  public ajouterSociete = Societe => this.http.post('http://localhost:8085/addSociete', Societe, {responseType: 'text' as 'json'});

  public getAllSoc = () => this.http.get('http://localhost:8085//show-socall');

  public deleteSoc = id => this.http.delete('http://localhost:8085/deleteSoc/' + id);
  public update(id, data): Observable<any> {
    return this.http.put('http://localhost:8085/modify/' + id , data);
  }



}
