import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { SocieteComponent } from './societe/societe.component'
import { OpportuniteComponent } from './opportunite/opportunite.component';
import{SocieteRegService} from './societe-reg.service'
import { ListsocieteComponent } from './listsociete/listsociete.component';

import { TemplateComponent } from './template/template.component';

const routes: Routes = [
  { path: 'opportunite', component: OpportuniteComponent },
  { path: 'addsociete', component: SocieteComponent },
  
  { path: 'listesociete', component: ListsocieteComponent },
  { path: 'template', component: TemplateComponent }

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[OpportuniteComponent, SocieteComponent ]