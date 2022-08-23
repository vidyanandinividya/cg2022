import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddContactComponent } from './add-contact/add-contact.component';
import { ViewContactComponent } from './view-contact/view-contact.component';



@NgModule({
  declarations: [
    AddContactComponent,
    ViewContactComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[AddContactComponent]

})
export class ContactsModule { }
