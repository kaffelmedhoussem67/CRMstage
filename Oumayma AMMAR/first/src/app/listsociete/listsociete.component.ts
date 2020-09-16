import { Component, OnInit  , Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import{Societe}from '../societe';
import { SocieteRegService } from '../societe-reg.service';
import { filter } from 'rxjs/operators';

@Component({
  selector: 'app-listsociete',
  templateUrl: './listsociete.component.html',
  styleUrls: ['./listsociete.component.css']
})
export class ListsocieteComponent implements OnInit {
  
  listeSociete : any
  societes: Societe[];
  constructor(private http:HttpClient, private service: SocieteRegService ) { }

  ngOnInit(): void {
    this.service.getSociete()
    .subscribe((data)=>this.listeSociete=data);
  }




  deleteSoc(societe: Societe): void {
     
    this.service.deleteSociete(societe.id)
      .subscribe( data => {this.societes=this.societes.filter(u => u !== societe);  })

      alert('La societe a été supprimé!! \n\n' );     
      this.ngOnInit();
  };
}
