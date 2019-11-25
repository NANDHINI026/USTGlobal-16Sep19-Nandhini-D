import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
inputdata;
entr;
  constructor(private http :HttpClient) {this.getNews() }
 
  ngOnInit() {
  }

  getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>('https://newsapi.org/v2/top-headlines?apiKey=549532693dbb4bcbbad5c4c657a49e64&sources='+this.inputdata).subscribe(data => {
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
   
   getNews(){
     this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=549532693dbb4bcbbad5c4c657a49e64').subscribe(data =>{
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
}
