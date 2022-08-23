import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddContactComponent } from './contacts/add-contact/add-contact.component';
import { ChildComponent } from './child/child.component';
import { CustomStyleDirective } from './custom-style.directive';


@NgModule({
  declarations: [
    AppComponent,
    AddContactComponent,
    ChildComponent,
    CustomStyleDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
