import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PlayersComponent } from './players/players.component';
import { CskPlayersComponent } from './csk-players/csk-players.component';
import { PlayerserviceService } from './playerservice.service';
import { UserComponent } from './user/user.component';
import {FormsModule} from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactusComponent,
    PlayersComponent,
    CskPlayersComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [PlayerserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
