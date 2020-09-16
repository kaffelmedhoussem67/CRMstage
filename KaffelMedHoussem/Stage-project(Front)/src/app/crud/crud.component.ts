import { Component, OnInit } from '@angular/core'
import { Opportunity } from '../opportunity'
import { CrudService } from '../crud.service'
import {devises} from '../devises'
import { Observable } from 'rxjs';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styleUrls: ['./crud.component.css']
})
export class CrudComponent implements OnInit {

  opportunity: Opportunity=new Opportunity();
  devices:Observable<devises[]>;
  message:any;
  submitted = false;


  constructor(private service:CrudService
    ) { }

  ngOnInit(): void {
    this.service.devises().subscribe(
      res => {
        console.log(JSON.parse(JSON.stringify(res)));
        this.devices = JSON.parse(JSON.stringify(res));
      },
      error => {
        console.log(error['error']);
      }
    );

    
  }

  save() {
    this.service.Add(this.opportunity)
      .subscribe(data => console.log(data), error => console.log(error));
    this.opportunity = new Opportunity(
      );
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }


 /* public Addopportunity (){
   let resp=this.service.Add(this.opportunity)
   resp.subscribe((data)=>this.message=data)
  }*/
}
