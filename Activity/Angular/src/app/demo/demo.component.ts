import { Component } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent {
  demo="two";
  ischeck=true;
  cnt:number=0;
  getMessage(){
    this.demo="one";
  }
  getCount(){
    this.ischeck=false;
    return this.cnt++;
  }
  getCountMinus(){
    this.cnt=this.cnt-1;
    if(this.cnt==0){
      this.ischeck=true;
    }
  }
}
