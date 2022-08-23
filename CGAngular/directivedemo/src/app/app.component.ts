import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'directivedemo';
  show:boolean=false;
  value="yes";
  color:string='blue'
  users=['john','jack','tom','harry','james'];
  userDetails=[
    {name:'john',email:'john@gmail.com',age:32},
    {name:'jack',email:'jack@gmail.com',age:32},
    {name:'james',email:'james@gmail.com',age:32},
    {name:'tom',email:'tom@gmail.com',age:32},
  ]
}
