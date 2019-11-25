import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  entr;
    bis;
    sport;
  constructor(private http: HttpClient) {
    this.getEnt();
    this.getBis();
    this.getSport();
    
    }
    

  ngOnInit() {
  }
  getEnt() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(data => {
    this.entr = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  getBis() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(d => {
    this.bis = d.articles;
    console.log(d);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  getSport() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(d1 => {
    this.sport = d1.articles;
    console.log(d1);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
}
