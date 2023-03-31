import { Component } from '@angular/core';
import { FormControl,FormGroup,Validators} from '@angular/forms'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'fourthproject';
  value:string|any;
  name:any='';
  disable=false;
  registerform=new FormGroup({
    name:new FormControl(''),
    email : new FormControl(''),
    password: new FormControl('',[
      Validators.required,
      Validators.maxLength(12),
      Validators.minLength(6)
    ])
  })
  getData(){
    if(this.registerform.status=='VALID'){
    console.log(this.registerform.value);
    this.value=this.registerform.value;
    this.name=this.registerform.get('name')?.value;
    }
  }
}
