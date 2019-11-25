import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childbike',
  templateUrl: './childbike.component.html',
  styleUrls: ['./childbike.component.css']
})
export class ChildbikeComponent implements OnInit {
  @Input() bike;
  constructor() { }

  ngOnInit() {
  }

}
