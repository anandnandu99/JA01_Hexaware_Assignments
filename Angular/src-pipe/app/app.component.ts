import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{
  title = 'webapps';
  salary=9900;
  mydate=new Date;
  message='hello!';
  productList:any=[];
  constructor(private service:AppService){

  }
  ngOnInit(): void {
this.getAllProducts();  }
  

getAllProducts(){
  this.productList=this.service.getAllData();
}
}
