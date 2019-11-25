import { Component } from "@angular/core";
import { HttpClient } from '@angular/common/http';




@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})



export class HomeComponent {
    news;
    constructor(private http: HttpClient) {
    this.getNews();
    }
    getNews(){
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=549532693dbb4bcbbad5c4c657a49e64').subscribe(data => {
            this.news = data.articles;
    },err => {
        console.log(err);
    },() => {
        console.log("news got successfully");
    });
}
}