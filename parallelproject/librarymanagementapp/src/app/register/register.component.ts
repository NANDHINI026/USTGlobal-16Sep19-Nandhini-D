import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy {
  error: string;
  constructor(private auth: AuthService,private router : Router) { }

  ngOnInit() {
  }
  register(form: NgForm) {
    this.error = null;
    this.auth.registerUser(form.value).subscribe(data => {
      console.log(data);
      if (data && data.message === 'User is successfully registered') {
        localStorage.setItem('userDetails', JSON.stringify(data));
        this.router.navigateByUrl('/login');
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

