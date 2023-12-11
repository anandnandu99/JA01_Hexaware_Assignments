
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Player } from 'src/app/models/Player';
import { PlayersService } from 'src/app/services/players.service';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css'],
})
export class PlayersComponent implements OnInit {
  players: Player[] = [];
  newPlayer: Player = {
    playerId: 0,
    playerName: '',
    jerseyNumber: 0,
    role: '',
    totalMatches: 0,
    teamName: '',
    country: '',
    description: '',
  };
  


  constructor(private playerService: PlayersService) {}

  ngOnInit(): void {
    this.getAllPlayers();
  }


  getAllPlayers() {
    this.playerService.getAllPlayers().subscribe(
      (players: Player[]) => {
        this.players = players;
      },
    );
  }

  addPlayer(playerForm: NgForm) {

    this.playerService.addPlayer(this.newPlayer).subscribe(
      (addedPlayer) => {
        this.players.push(addedPlayer);
      },
      
    );
  }


  
  removePlayer(playerName: string) {
    this.playerService.removePlayerByName(playerName).subscribe(() => {
      console.log('deleted successfully');
      
      this.getAllPlayers();
    });
  }
}
