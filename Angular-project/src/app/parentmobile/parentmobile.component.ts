import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmobile',
  templateUrl: './parentmobile.component.html',
  styleUrls: ['./parentmobile.component.css']
})
export class ParentmobileComponent implements OnInit {
  selectedMobile;
  mobiles = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/11/29/12/30/android-1869510__340.jpg',
      name : 'Redmi',
      price : 15000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Redmi 4A X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
      name : 'Samsung S6',
      price : 10000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Samsung s6 edge X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2018/05/01/13/04/sport-3365503__340.jpg',
      name : 'iPhone8',
      price :  50000,
      // tslint:disable-next-line: max-line-length
      Description : 'Iphone * X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      name : 'Sony',
      price : 20000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Iphone * X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile;
  }
}
