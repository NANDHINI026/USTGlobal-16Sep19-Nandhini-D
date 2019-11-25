import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'Nandhini';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/03/09/flower-4504952__340.jpg';
  address = '1/3a,Road Street,Vadamathimangalam,Thiruvannamalai.';
  colorName = 'aqua';
  isActive = false;
  colSpanValue = 2;

  constructor(){}

  ngOnInit() {
    setInterval(() => {
      this.colorName ='blue';
      this.isActive = !this.isActive;
    }, 1000);
  }
}
