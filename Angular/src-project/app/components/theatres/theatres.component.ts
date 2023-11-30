// theatres.component.ts
import { Component } from '@angular/core';
import { Theatre } from 'src/app/models/theatre';

@Component({
  selector: 'app-theatres',
  templateUrl: './theatres.component.html',
  styleUrls: ['./theatres.component.css'],
})
export class TheatresComponent {

  
  theatres: Theatre[] = [
    // Your theatre data...
  ];

  newTheatre: Theatre = { theatreName: '', location: '' };
  showAddTheatreForm: boolean = false;

  addTheatre(): void {
    this.theatres.push({ ...this.newTheatre });
    this.resetNewTheatre();
    this.showAddTheatreForm = false;
  }

  removeTheatre(index: number): void {
    this.theatres.splice(index, 1);
  }

  toggleAddTheatreForm(): void {
    this.showAddTheatreForm = !this.showAddTheatreForm;
  }

  cancelAddTheatre(): void {
    this.resetNewTheatre();
    this.showAddTheatreForm = false;
  }

  private resetNewTheatre(): void {
    this.newTheatre = { theatreName: '', location: '' };
  }
}
