import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentbike',
  templateUrl: './parentbike.component.html',
  styleUrls: ['./parentbike.component.css']
})
export class ParentbikeComponent implements OnInit {
  selectedBike;
  bikes = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      name : 'BMW',
      price : 500000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg',
      name : 'Suzuki',
      price : 100000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
      name : 'Kawasaki',
      price :  1500000,
      // tslint:disable-next-line: max-line-length
      Description : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      name : 'Royal Enfield',
      price : 2000000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.',
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    console.log(bike);
    this.selectedBike = bike;
  }
}
