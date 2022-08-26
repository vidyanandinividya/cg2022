import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BasicDirectiveDirective } from './basic-directive.directive';
import { BetterDirectiveDirective } from './better-directive.directive';

@NgModule({
  declarations: [
    AppComponent,
    BasicDirectiveDirective,
    BetterDirectiveDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
