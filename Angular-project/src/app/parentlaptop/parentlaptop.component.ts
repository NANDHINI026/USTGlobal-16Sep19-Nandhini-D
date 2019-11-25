import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentlaptop',
  templateUrl: './parentlaptop.component.html',
  styleUrls: ['./parentlaptop.component.css']
})
export class ParentlaptopComponent implements OnInit {
  selectedLaptop;
  laptops = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
      name : 'Asus',
      price : 53000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://image.shutterstock.com/image-vector/desktop-pc-blank-screen-perspective-260nw-778939729.jpg',
      name : 'Dell',
      price : 50000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Dell Desktop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2018/09/07/05/41/surface-book-3660000__340.jpg',
      name : 'Motrola',
      price :  15000,
      // tslint:disable-next-line: max-line-length
      Description : 'Motorola Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2018/09/07/05/41/surface-book-3659999__340.jpg',
      name : 'Sony',
      price : 46666 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Sony Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2014/11/12/15/48/tablet-pc-528464__340.jpg',
      name : 'Lenovo',
      price : 23000,
      // tslint:disable-next-line: max-line-length
      Description : 'Lenovo Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2019/06/15/09/26/laptop-4275110__340.jpg',
      name : 'Microsoft',
      price : 74000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'CPU: 2.4GHz Intel Core i5-6300U (dual-core, 3MB cache, up to 3GHz with Turbo Boost) Graphics: Intel HD Graphics 520. RAM: 8GB LPDDR3. Screen: 12.3-inch, 2,736 x 1,824 PixelSense display (Contrast ratio: 1,300:1, 100% sRGB color, 10-point multi-touch, 3:2 aspect ratio) Storage: 256GB SSD (PCIe 3.0)',
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/05/31/10/51/acer-791027__340.jpg',
      name : 'Acer',
      price : 25000 ,
      // tslint:disable-next-line: max-line-length
      Description : 'Comes W/ Infinity Edge IPS Display. Laptops W/ Intel® Core™ Processor, Buy Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium Support. Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional Headset, Accidental Damage Service',
    },
    {
      imageUrl : 'https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/TOSHIBA_Satellite_Pro_L850/TOSHIBA_Satellite_Pro_L850_L_1.jpg',
      name : 'Toshiba',
      price : 45453 ,
      // tslint:disable-next-line: max-line-length
      Description : 'This item 2015 Toshiba Satellite 15.6-inch Laptop- 5th Gen Intel Core i7-5500U Processor 3.0GHz, 4MB Cache, 8GB Memory, 1TB HDD, HDMI, Bluetooth, Webcam, WIFI, AMD R7 M260, Windows 8.1/Windows 10.',
    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendLaptop(laptop) {
    console.log(laptop);
    this.selectedLaptop = laptop;
  }
}
