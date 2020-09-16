import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginnComponent} from './loginn/loginn.component';
import { RegistrationComponent } from './registration/registration.component';
import { SerachDeleteComponent } from './serach-delete/serach-delete.component';
import { SocieteComponent } from './societe/societe.component';


const routes: Routes = [
  {
    path: '',
    redirectTo: 'loginn',
    pathMatch: 'full',
  },
  {path: 'register', component: RegistrationComponent, pathMatch: 'full'},
  {path: 'search', component: SerachDeleteComponent},
  {path: 'loginn', component: LoginnComponent},
  {path: 'find', component: SocieteComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
