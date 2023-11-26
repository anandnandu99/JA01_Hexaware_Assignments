import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularall';

  movieName:string='';
  director:string='';
  genre:string='';
  rating:number=0;
  language:string='';
  censorrating=false;
  morningshow=false;
  matnieehow=false;
  firstshow=false;
  secondhow=false;
  description:string='';

readMovieData(data:any){
  console.log(data.form.value);
  

}


}
