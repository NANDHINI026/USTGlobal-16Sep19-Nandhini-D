import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-headercomponent',
  templateUrl: './headercomponent.component.html',
  styleUrls: ['./headercomponent.component.css']
})
export class HeadercomponentComponent implements OnInit {
users:any;
  constructor(private service: AuthService,private router: Router) { }
  get isLLoggedIn() {
    return this.service.isLibrarianLoggedIn();
  }

  get isSLoggedIn() {
    return this.service.isStudentLoggedIn();
  }
  logout() {
    this.service.isLLoggedIn = false;
    this.service.isSLoggedIn = false;
    this.router.navigateByUrl('/login');
  }

 ngOnInit() {
  }
  
}
