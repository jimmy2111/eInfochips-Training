import { Component } from '@angular/core';
import { PlayerserviceService } from '../playerservice.service';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent {
players:any
constructor(private ps:PlayerserviceService){
  this.players=ps.getPlayers()
}

}
