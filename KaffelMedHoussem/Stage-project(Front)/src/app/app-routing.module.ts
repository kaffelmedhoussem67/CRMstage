import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CrudComponent } from './crud/crud.component';

const routes: Routes = [
  { path: '', redirectTo: 'opportunite', pathMatch: 'full' },
  { path: 'AddOpportunite', component: CrudComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
