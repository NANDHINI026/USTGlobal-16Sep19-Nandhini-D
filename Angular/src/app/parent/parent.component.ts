import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  cars = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/01/20/11/09/lamborghini-605334__340.jpg',
      name : 'Lamborghini'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      name : 'BMW'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name : 'Audi'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
      name : 'Amg Mercedes'
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    console.log(car);
    this.selectedCar = car;
  }
}
