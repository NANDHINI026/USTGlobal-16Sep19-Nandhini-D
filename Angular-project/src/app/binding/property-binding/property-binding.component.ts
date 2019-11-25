import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = "Nandhini";
  address = '1/3A,Road Street,Vadamathimanagalam,polur taluk,Thiruvannamalai Dt.';
  Color = 'aqua';

  constructor() { }

  ngOnInit() {
    
  }

}
