import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childmobile',
  templateUrl: './childmobile.component.html',
  styleUrls: ['./childmobile.component.css']
})
export class ChildmobileComponent implements OnInit {
  @Input() mobile;

  constructor() { }

  ngOnInit() {
  }

}
