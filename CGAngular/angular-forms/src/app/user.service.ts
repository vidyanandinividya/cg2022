import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
  url="http://localhost:3000/users"
  getUserDetails()
  {
    return this.http.get("http://localhost:3000/users");
  }
  addUserDetails(user:User)
  {
    return this.http.post("http://localhost:3000/users",user);
  }
}
