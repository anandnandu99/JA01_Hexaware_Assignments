
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Player } from '../models/Player';

@Injectable({
  providedIn: 'root',
})
export class PlayersService {
  private apiUrl = 'http://localhost:8484/players';

  constructor(private http: HttpClient) {}

  getAllPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(`${this.apiUrl}/getAllPlayers`);
  }

  addPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(`${this.apiUrl}/addPlayer`, player);
  }
  removePlayerByName(playerName: string): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/removePlayerByName/${playerName}`);
  }
}
