import { Component, OnInit } from '@angular/core';
import { Contact } from '../Contact';
import { UserRegistationService } from '../user-registation.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {


 // user: User = new User('', '', 0, '');

  contact: Contact = new Contact('', '', '', 0 , 0, '', '', 1);
  message: Contact;


  constructor(private service: UserRegistationService) { }

  ngOnInit(): void {
  }


  public registerNow(): void{
const resp = this.service.doRegistration(this.contact);
resp.subscribe((data) => this.message = data);
  }

  public getId(societeco: any): void {

  }
}
