import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-requestbook',
  templateUrl: './requestbook.component.html',
  styleUrls: ['./requestbook.component.css']
})
export class RequestbookComponent implements OnInit {

  constructor(private http: HttpClient, private service: AuthService) { }

  request(form) {
    console.log(form.value);
    this.http.get(`${this.service.baseURL}/librarymanagement/request/${form.value.id}/${form.value.bookId}`).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
