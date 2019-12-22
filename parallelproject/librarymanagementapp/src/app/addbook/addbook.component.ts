import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit,OnDestroy {
  error: string;

  constructor(private auth : AuthService,private router : Router) { }

  ngOnInit() {
  }
  addBook(form: NgForm) {
    this.error = null;
    this.auth.addBookUser(form.value).subscribe(data => {
      console.log(data);
      if(data && data.message === 'Book added successfully') {
        localStorage.setItem('userDetails',JSON.stringify(data));
        this.router.navigateByUrl('/displaybooklib');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnDestroy() {
    this.error = null;
  }
}
