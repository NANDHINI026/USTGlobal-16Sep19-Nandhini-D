import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  inputdata;
entr;
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>('http://www.omdbapi.com/?apikey=e7c58f36&s='+this.inputdata).subscribe(data => {
     this.entr = data.Search;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('movies got successfully');
     } );
   }
}
