import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childlaptop',
  templateUrl: './childlaptop.component.html',
  styleUrls: ['./childlaptop.component.css']
})
export class ChildlaptopComponent implements OnInit {
  @Input() laptop;
  constructor() { }

  ngOnInit() {
  }

}
