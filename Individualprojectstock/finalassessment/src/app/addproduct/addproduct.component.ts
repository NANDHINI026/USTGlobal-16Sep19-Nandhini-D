import { Component, OnInit, OnDestroy } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit,OnDestroy {
error : string;
  constructor(private auth : AuthService,private router : Router) { }

  ngOnInit() {
  }
  addProduct(form: NgForm) {
    this.error = null;
    this.auth.addProduct(form.value).subscribe(data => {
      console.log(data);
      if(data && data.message === 'success') {
        localStorage.setItem('userDetails',JSON.stringify(data));
        this.router.navigateByUrl('/search');
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
