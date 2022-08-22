import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-server',
  templateUrl: './server.component.html',
  styleUrls: ['./server.component.css']
})
export class ServerComponent implements OnInit {
serverId:number=10;
serverStatus:string='online'
getServerStatus()
{
  return this.serverStatus
}
server={
  id:20,
  status:'online'
}
servers=[11,12,13,14,15]
serverUlr=window.location.href;
disableBox=false
enableBox()
{
  this.disableBox=false
}
serverCreationStatus='No server was created'
serverName:string='Test Server';
onCreateServer()
{
  this.serverCreationStatus='server was created name is:'+this.serverName
}
onUpdateServerName(event:Event)
{
  this.serverName=(<HTMLInputElement>event.target).value;
}
  constructor() { 
    setTimeout(()=>{
      this.disableBox=true;
    },2000);
  }

  ngOnInit(): void {
  }

}
