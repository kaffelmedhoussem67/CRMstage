import { Component, OnInit } from '@angular/core';
import { Societe } from '../Societe';
import { SocieteService} from '../societe.service';
import {ActivatedRoute, Router} from '@angular/router';


@Component({
  selector: 'app-societe',
  templateUrl: './societe.component.html',
  styleUrls: ['./societe.component.css']
})
export class SocieteComponent implements OnInit {
  message: any;
  Societe: Societe = new Societe('', '', 0, 0, '');
  constructor(
    private service: SocieteService,
    private route: ActivatedRoute,
    private router: Router) { }

  Society: Societe;
  public ajouterSociete(): void{
    const resp = this.service.ajouterSociete(this.Societe);
    resp.subscribe((data) => this.message = data);
  }

  ngOnInit(): void {
    this.retrieveTutorials();
  }

  retrieveTutorials(): void {
    this.service.getAllSoc()
      .subscribe(data => {
        this.Society = data;
        console.log(data);
      });
  }
  public deleteSoc = (id: number) => {
    const resp = this.service.deleteSoc(id);
    resp.subscribe((data) => this.Society = data);
  }
}


