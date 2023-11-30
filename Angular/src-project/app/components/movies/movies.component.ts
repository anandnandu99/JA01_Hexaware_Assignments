// movies.component.ts
import { Component } from '@angular/core';
import { Movie } from 'src/app/models/movie';


@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css'],
})

export class MoviesComponent {
  movies: Movie[] = [
    // Your movie data...
  ];

  newMovie: Movie = { title: '', director: '', genre: '', language: '', rating: 0, imageUrl: '' };
  showAddMovieForm: boolean = false;

  addMovie(): void {
    // Add your logic to add a new movie to the movies array
    this.movies.push({ ...this.newMovie });
    this.resetNewMovie();
    this.showAddMovieForm = false;
  }

  cancelAddMovie(): void {
    this.resetNewMovie();
    this.showAddMovieForm = false;
  }

  toggleAddMovieForm(): void {
    this.showAddMovieForm = !this.showAddMovieForm;
  }

  private resetNewMovie(): void {
    this.newMovie = { title: '', director: '', genre: '', language: '', rating: 0, imageUrl: '' };
  }

  removeMovie(index: number): void {
    this.movies.splice(index, 1);
  }
}
