import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  users:any;
  userId='';
  errorMessage='';
  constructor(private us:UserserviceService){
   this.users=us.getusers().subscribe(data=>this.users=data);
  }
  onSubmit(){
    console.log(this.userId);
    this.us.getUsersById(this.userId).subscribe(data=>{this.users=[data]},
      error=>{
        if(error.status===404){
          this.errorMessage=`User with id ${this.userId} is not found`;
        }

      });
  }

}
