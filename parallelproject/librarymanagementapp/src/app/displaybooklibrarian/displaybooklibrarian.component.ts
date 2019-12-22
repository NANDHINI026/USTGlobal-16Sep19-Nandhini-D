import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthService } from '../auth.service';
import { BookResponse } from '../display-book/bookresponse';

@Component({
  selector: 'app-displaybooklibrarian',
  templateUrl: './displaybooklibrarian.component.html',
  styleUrls: ['./displaybooklibrarian.component.css']
})
export class DisplaybooklibrarianComponent implements OnInit {
  books: any;
  selectedUser;
  constructor(private http: HttpClient,private service: AuthService) { 
    this.getData();
  }
getData() {
  this.http.get<any>(`${this.service.baseURL}/librarymanagement/get-all-books`).subscribe(data => {
      console.log(data);
      this.books = data.bean;
  });
  }
  deleteBook(book) {
    this.http.delete(`${this.service.baseURL}/librarymanagement/delete-book/${book.bookId}`).subscribe(data => {
        console.log(data);
        this.getData();
      } , err => {
      console.log(err);
    });
  }
  selectUser(book){
    console.log(book);
    this.selectedUser= book;
  }
  updateData(form){
    console.log(form.value);
    this.service.updateUser(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated sucessfully');
    });
  }
  ngOnInit() {
  }
}
