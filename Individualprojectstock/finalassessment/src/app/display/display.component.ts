import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {
products : any;
  constructor(private http : HttpClient) { 
    this.getData();
  }

getData() {
  this.http.get<any>('http://localhost:8080/get-all').subscribe(data => {
      console.log(data);
      this.products = data.product;
  });
  
}
  ngOnInit() {
  }

}
