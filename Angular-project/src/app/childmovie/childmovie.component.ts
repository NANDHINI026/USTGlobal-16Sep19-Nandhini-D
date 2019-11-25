import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-childmovie',
  templateUrl: './childmovie.component.html',
  styleUrls: ['./childmovie.component.css']
})
export class ChildmovieComponent implements OnInit {
  @Input() movie;

  constructor() { }

  ngOnInit() {
  }

}
