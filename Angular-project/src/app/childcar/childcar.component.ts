import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childcar',
  templateUrl: './childcar.component.html',
  styleUrls: ['./childcar.component.css']
})
export class ChildcarComponent implements OnInit {
  @Input() car;

  constructor () { }

  ngOnInit() {
  }

}
