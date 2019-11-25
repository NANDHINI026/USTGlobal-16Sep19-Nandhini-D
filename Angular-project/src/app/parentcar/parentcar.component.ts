import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentcar',
  templateUrl: './parentcar.component.html',
  styleUrls: ['./parentcar.component.css']
})
export class ParentcarComponent implements OnInit {
  selectedCar;
  cars = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name : 'Audi',
      price : 5000000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'No pressur,Not rush,Banner Ford of Monroe provides a selection of Feature Inventory.representing new and popular items at competitive prices.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930_960_720.jpg',
      name : 'Ford',
      price : 100000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'No pressur,Not rush,Banner Ford of Monroe provides a selection of Feature Inventory.representing new and popular items at competitive prices.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
      name : 'Mercedes',
      price :  1500000,
      // tslint:disable-next-line: max-line-length
      Description : 'No pressur,Not rush,Banner Ford of Monroe provides a selection of Feature Inventory.representing new and popular items at competitive prices.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2019/09/01/12/59/traffic-4445171__340.jpg',
      name : 'jaguar',
      price : 2000000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'No pressur,Not rush,Banner Ford of Monroe provides a selection of Feature Inventory.representing new and popular items at competitive prices.',
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    console.log(car);
    this.selectedCar = car;
  }

}
