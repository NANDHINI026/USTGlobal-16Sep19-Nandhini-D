import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }
  addProduct (user) : Observable<any> {
    return this.http.post('http://localhost:8080/add',user);
  }
  updateProduct (user) : Observable<any> {
    return this.http.post('http://localhost:8080/update',user);
  }
}
