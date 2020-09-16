import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import { LoginService } from './login.service';
import {User} from '../user';
import {RegistrationSService} from '../registration-s.service';

@Component({ templateUrl: 'login.component.html' })
export class LoginnComponent implements OnInit {
  user = new User('', '');

  loginForm: FormGroup;
  loading = false;
  submitted = false;
  returnUrl: string;
  error = '';
   constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private service: LoginService,
  ) {

}

ngOnInit(): void{
    this.loginForm = this.formBuilder.group({
      email: ['', Validators.required],
      password: ['', Validators.required]
    });
    this.returnUrl = this.route.snapshot.queryParams['/loginn'] || '/';
  }
   get f(): any {
   return this.loginForm.controls; }


  onSubmit(): void{

    this.submitted = true;

    // stop here if form is invalid
    if (this.loginForm.invalid) {
      return;
    }

    this.loading = true;
    this.service.login(this.f.email.value, this.f.password.value)

      .subscribe(
        data => {
          console.log(data);
          if (data != null){
            this.router.navigate(['loginn']);  }
          else{
            this.error = 'verifier votre email et password';
            this.loading = false;
            this.router.navigate(['loginn']); }
        },
        error => {
          console.log(this.f.email.value);
          console.log(this.f.password.value);
          this.error = 'verifier votre email et password svp';
          this.loading = false;

        });
  }
}

