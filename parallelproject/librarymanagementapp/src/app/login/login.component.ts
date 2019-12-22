import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  

  constructor(private auth: AuthService ,private router: Router,private http:HttpClient) { }
  // login(form: NgForm) {
  //   console.log(form.value);
  //   this.auth.loginUser(form.value).subscribe(data => {
  //     console.log('Response of login',data);
  //     if(data && data.message === 'Success') {
  //       localStorage.setItem('userDetails',JSON.stringify(data));
  //       this.router.navigateByUrl('/home');
  //     }
  //     form.reset();
  //   }, err => {
  //     console.log(err);
  //   });
  // }
  login(form) {
    console.log(form);
    this.http.post<any>(`${this.auth.baseURL}/librarymanagement/login`,form.value)
      .subscribe(response => {
        console.log('Response of login',response);
        if (response != null && response.users.type === 'librarian') {
          // window.confirm(' Welcome  ' + response.name);
          this.router.navigateByUrl('/home');
          this.auth.isLLoggedIn = true;
        } else if(response != null && response.users.type === 'student') {
          // window.confirm(' Welcome  ' + response.name);
          this.router.navigateByUrl('/home');
          this.auth.isSLoggedIn = true;
        } else {
          window.confirm('Login Failed');
        }
      });
  }
  ngOnInit() {
  }
  

}
