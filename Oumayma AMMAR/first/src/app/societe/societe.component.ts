import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import{Societe}from '../societe';
import { SocieteRegService } from '../societe-reg.service';
import{GroupeSociete} from '../groupesociete';
import{Statut} from '../statut';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from "@angular/forms";


@Component({
  selector: 'app-societe',
  templateUrl: './societe.component.html',
  styleUrls: ['./societe.component.css']
})



export class SocieteComponent implements OnInit {
  //data = [];
  societe: Societe;
  groupesociete :GroupeSociete;
  message :any;
  statuts :Statut[] =[
       {id:1 , statut :"Procpect"},
       {id:2 , statut :"Client"}
           ];
           
  constructor(private service: SocieteRegService , private router: Router) {
    this.societe=new Societe();
  }
  
  ngOnInit(): void {
  
  }
  
  /**
   * RegisterNow
   */
  public onSubmit() {
  
   let resp=this.service.doRegistration(this.societe);
    resp.subscribe((data)=>this.gotoUserList());

    alert('SUCCESS!! :-)\n\n' )
  
  }
  gotoUserList() {
    this.router.navigate(['/listesociete']);
  }
  
}
