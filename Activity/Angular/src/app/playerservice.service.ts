import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlayerserviceService {

  constructor() { }
  getPlayers(){
    return [{"Name":"Virat Kohli","Skill":"Batsman","Team":"RCB"},
    {"Name":"MS Dhoni","Skill":"Wicket-Keeper","Team":"CSK"},
    {"Name":"Rohit Sharma","Skill":"Batsman","Team":"MI"},
    {"Name":"Ruturaj Gaikwad","Skill":"Batsman","Team":"CSK"},
    {"Name":"AB Devilliers","Skill":"Batsman","Team":"RCB"}];
  }
}
