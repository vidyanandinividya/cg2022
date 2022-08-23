import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddLoansComponent } from './add-loans/add-loans.component';

import { LoanTypesComponent } from './loan-types/loan-types.component';
import { LoansComponent } from './loans/loans.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';


const routes: Routes = [
  {
    path:'loans',
    component:LoansComponent
  },
  {
    path:'loan-types',
    component:LoanTypesComponent
  },
  {
    path:'add-loans',
    component:AddLoansComponent,
  },
  {
    path:'',
    redirectTo:'loans',
    pathMatch:'full'
  },
  {
    path:'**',
    component:PagenotfoundComponent
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
