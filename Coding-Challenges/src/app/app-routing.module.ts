import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlayersComponent } from './components/players/players.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [



  { path: '', redirectTo: '/home', pathMatch: 'full' },
  {path:'home', component: HomeComponent},

    {path:'players', component: PlayersComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
