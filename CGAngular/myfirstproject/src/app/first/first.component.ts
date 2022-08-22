import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  /*template:`
  <h1>Welcome to Inline Template</h1>
  <p>Inline template works</p>
  <app-second></app-second>
  `,*/
  styleUrls: ['./first.component.css']
  /*styles:[
    `
    p{
      color:green;
    }
    `
  ]*/
})
export class FirstComponent implements OnInit {
  title:string="MyFirstComponent";

  constructor() { }

  ngOnInit(): void {

  }

}
