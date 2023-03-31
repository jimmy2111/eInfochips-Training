import { Component } from '@angular/core';
import { PlayerserviceService } from '../playerservice.service';

@Component({
  selector: 'app-csk-players',
  templateUrl: './csk-players.component.html',
  styleUrls: ['./csk-players.component.css']
})
export class CskPlayersComponent {
  players:any;
  constructor(private ps:PlayerserviceService){
    this.players=ps.getPlayers();
  }

}
