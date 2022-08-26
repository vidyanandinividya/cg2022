import { Component } from '@angular/core';
import { User } from './user';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-forms';
  topics=['Angular','Java','Web Basics','Bootstrap','JSON server']
  userModel=new User();
  userList : any= [];
  constructor(private user:UserService){}
  onSubmit()
  {
    this.user.addUserDetails(this.userModel).subscribe({
      next: (data)=>{
      let msg=data?"user registered successfully":"OOPs!!! some error occured!";
      console.log(data);
      alert(msg)
    },
    error:
    (error)=>{
      console.log(error);
      alert("OOPs!!! some error occured")
    }
   });
  }

  getUser()
  {
    this.user.getUserDetails().subscribe(data=>{
      console.log(data);
      this.userList=data
    });
  }
  deleteUser(id:any)
  {
this.user.deleteUserDetails(id).subscribe((data)=>{
  console.log(data)
})
  }
  updateUser()
  {

  }
}
