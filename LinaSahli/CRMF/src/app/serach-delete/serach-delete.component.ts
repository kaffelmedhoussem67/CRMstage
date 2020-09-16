import { Component, OnInit } from '@angular/core';
import { UserRegistationService } from '../user-registation.service';
import {ActivatedRoute, Router} from '@angular/router';
import { FormGroup, FormBuilder, Validators} from '@angular/forms';
import { Contact} from '../Contact';

@Component({
  selector: 'app-serach-delete',
  templateUrl: './serach-delete.component.html',
  styleUrls: ['./serach-delete.component.css']
})
export class SerachDeleteComponent implements OnInit {
  currentTutorial = Contact;
  message = '';

  constructor(
    private service: UserRegistationService,
    private route: ActivatedRoute,
    private router: Router) { }


  email: string;

 /* constructor(private service: UserRegistationService) {
  }
*/
  Contac: Contact;
 /* constructor(private service: UserRegistationService, private fb: FormBuilder, private route: ActivatedRoute ){
    this.createForm();
  }*/
  ngOnInit(): void {
    this.retrieveTutorials();
  }

  retrieveTutorials(): void {
    this.service.getCon()
      .subscribe(data => {
        this.Contac = data;
        console.log(data);
      });
  }

/*
  loaduser(): void{
    this.service.getCon().subscribe(
      data => {this.Contac = data; },
      error => { console.log('An error was'); },
      () => { console.log('loading was done'); }
    );
  }


  createForm(): void{
    this.userForm = this.fb.group({
      username: ['', Validators.required],
    });
  }

  initUser(): void{
    this.selectedUser = new Contact('', ' ' , '',   0, 8, '', '');
    this.createForm();
  }
  update(): void {
    this.service.update(this.selectedUser).subscribe(
      re => {
        this.initUser();
        this.loaduser() ; }
    );
  }*/

  update(): void {
    this.service.update(this.currentTutorial.id, this.currentTutorial)
      .subscribe(
        response => {
          console.log(response);
          this.message = 'The tutorial was updated successfully!';
        },
        error => {
          console.log(error);
        });
  }

  public deleteCon = (id: number) => {
    const resp = this.service.deleteUser(id);
    resp.subscribe((data) => this.Contac = data);
  }}

