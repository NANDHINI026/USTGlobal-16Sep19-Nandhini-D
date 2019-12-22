import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLLoggedIn = false;
  isSLoggedIn = false;
  
  constructor(private http : HttpClient) { }
  baseURL = 'http://localhost:8080';
  registerUser (user) : Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/register',user);
  }
  // loginUser (user) : Observable<any> {
  //   return this.http.post('http://localhost:8080/librarymanagement/login',user);
  // }
  addBookUser (user) : Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/addbooks',user);
  }
  updateUser(user) : Observable<any> {
    return this.http.post('http://localhost:8080/librarymanagement/update',user);
  }
  isLibrarianLoggedIn() {
    if (this.isLLoggedIn) {
      return true;
    }
    return false;
  }

  isStudentLoggedIn() {
    if (this.isSLoggedIn) {
      return true;
    }
    return false;
  }
 }
