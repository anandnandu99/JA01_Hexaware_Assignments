// seating.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-seating',
  templateUrl: './seating.component.html',
  styleUrls: ['./seating.component.css']
})
export class SeatingComponent {
  rows = ['A', 'B', 'C', 'D', 'E'];
  seatsPerRow = 6;
  selectedSeats: string[] = [];

  generateSeatsArray(size: number): number[] {
    return Array.from({ length: size }, (_, index) => index + 1);
  }

  toggleSeat(row: string, seatNumber: number) {
    const seat = `${row}${seatNumber}`;
    const index = this.selectedSeats.indexOf(seat);

    if (index === -1) {
      this.selectedSeats.push(seat);
    } else {
      this.selectedSeats.splice(index, 1);
    }
  }

  isSeatSelected(row: string, seatNumber: number): boolean {
    return this.selectedSeats.includes(`${row}${seatNumber}`);
  }
}
