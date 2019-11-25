import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  Products = [
    {
      img : 'https://cdn.pixabay.com/photo/2019/02/18/11/23/salmon-baked-4004282_960_720.jpg',
      name : 'CupCakes',
      price : 300
    },
    {
      img : 'https://image.shutterstock.com/image-photo/burger-fast-food-items-materials-260nw-140030899.jpg',
      name : 'Sandwich',
      price : 400 
    }
  ]

  constructor() { }

  ngOnInit() {
  }

}
