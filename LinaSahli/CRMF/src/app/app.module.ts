import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { LoginComponent } from './loginn/loginn.component';
import { RegistrationComponent } from './registration/registration.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { SerachDeleteComponent } from './serach-delete/serach-delete.component';

import {HttpClient, HttpClientModule} from '@angular/common/http';
import { UserRegistationService } from './user-registation.service';
import { SocieteService} from './societe.service';
import { SocieteComponent } from './societe/societe.component';
import {LoginnComponent} from './loginn/loginn.component';


@NgModule({
  declarations: [
    AppComponent,
   LoginnComponent,
    RegistrationComponent,
    SerachDeleteComponent,
    SocieteComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [UserRegistationService, SocieteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
