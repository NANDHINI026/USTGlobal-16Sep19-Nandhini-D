import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.css']
})
export class CountriesComponent implements OnInit {
 entr;
 inputdata;
  constructor(private http:HttpClient) {
    this.getNews();
  }
    
  ngOnInit() {
  }
  getEnt(event) {
   this.inputdata =event.target.value;
    this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=549532693dbb4bcbbad5c4c657a49e64&country='+this.inputdata).subscribe(data => {
    this.entr = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  
  getNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=549532693dbb4bcbbad5c4c657a49e64').subscribe(data =>{
    this.entr = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  
}
