import { Component, OnInit } from '@angular/core';
import { CrudService } from '../crud.service'
import { Observable } from 'rxjs';
import { Opportunity } from '../opportunity';
import { Router } from '@angular/router';



@Component({
  selector: 'app-opportunite',
  templateUrl: './opportunite.component.html',
  styleUrls: ['./opportunite.component.css']
})
export class OpportuniteComponent implements OnInit {

  opportunite:Observable<Opportunity[]>;
  constructor( private service:CrudService, private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }
  
 reloadData() {
    this.opportunite = this.service.allopportuninty();

  
 }
  deleteOpportunite(id: number) {
    this.service.deleteOpportunity(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();

        },
        error => console.log(error));
  }
  GoAdd(){
    this.router.navigate(['AddOpportunite']);
  }
}
