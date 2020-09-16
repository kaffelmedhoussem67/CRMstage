import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
import { TemplateComponent } from './template/template.component';

import{SocieteRegService} from './societe-reg.service'
import { ReactiveFormsModule } from '@angular/forms';
import {AppRoutingModule, routingComponents} from './app-routing.module';
import { ListsocieteComponent } from './listsociete/listsociete.component';

@NgModule({
  declarations: [
    AppComponent, 
    TemplateComponent,
    routingComponents,
    ListsocieteComponent  
  ],
  
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [SocieteRegService],
  bootstrap: [AppComponent]
})
export class AppModule { }
