import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  users:any;
  

  constructor(private http:HttpClient) {
    //this.users=http.get("http://localhost:8080/exttrainees").subscribe(data=>this.users=data);
   }
   getusers(){
    return this.http.get("https://jsonplaceholder.typicode.com/users");
   }
   getUsersById(userId:any){
    return this.http.get(`https://jsonplaceholder.typicode.com/users/${userId}`);

   }
}
