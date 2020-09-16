import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-opportunite',
  templateUrl: './opportunite.component.html',
  styleUrls: ['./opportunite.component.css']
})
export class OpportuniteComponent implements OnInit {

  opportunite:any;
  constructor( private http:HttpClient) { }

  ngOnInit(): void {
    let response=this.http.get("http://localhost:8081/SpringMVC/servlet/AllOpportunity");
    response.subscribe((data)=>this.opportunite=data);
  }

}
