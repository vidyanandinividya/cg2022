import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Recieve data from child to parent';
  /*data:number=20;
  updatechild()
  {
    this.data=Math.floor(Math.random()*10)
  }*/
  data:string="x";
  updateData(item:string)
  {
    this.data=item;
  }
}
