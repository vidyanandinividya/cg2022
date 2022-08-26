import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient,private router:Router) { }
  url="http://localhost:3000/users"
  getUserDetails()
  {
    return this.http.get("http://localhost:3000/users");
  }
  addUserDetails(user:User)
  {
    return this.http.post("http://localhost:3000/users",user);
  }
  updateUserDetails(id:any,user:User)
  {
    let url=`http://localhost:3000/users/${id}`;
    return this.http.put(url,user);
    //this.router.navigate()
  }
  deleteUserDetails(id:any)
  {
    let url=`http://localhost:3000/users/${id}`;
    return this.http.delete(url);
  }
}
