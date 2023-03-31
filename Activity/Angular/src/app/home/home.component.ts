import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  name="jimmy";
  persons=["Jimmy","Dhrumi","Mihir"];
  person=[{"name":"Jimmy","age":"22","location":"Ahmedabad"},
  {"name":"Dhrumi","age":"19","location":"Ahmedabad"}];
  getMessage(){
    return "This is method in home component";
  }

}
