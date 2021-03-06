import { Component, OnInit, DoCheck, AfterViewChecked, AfterViewInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy {
  Users;
  selectedUser;
  today = new Date();
  
  constructor(public service : UserService) {
    console.log(" Constructor is executed");
    this.getData();
   }

  ngOnInit() {
    console.log("ngoninit is executed");
  }
  ngDoCheck() {
    console.log("ngDoCheck is executed");
  }
  ngAfterViewInit() {
    console.log("ngAfterViewInit is executed");

  }
  ngAfterViewChecked() {
    console.log("ngAfterViewChecked function is executed");

  }
  ngOnDestroy() {
    console.log("ngDestroy function is destroed");
  }

  loginData(form: NgForm){
    console.log(form.value);
    this.service.postUser(form.value).subscribe(data =>{
      console.log(data);
    } ,err => {
      console.log(err);
    },() => {
      console.log('data posted successfully');
    });
  }
  getData() {
    this.service.getUsers().subscribe(data =>{
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfull');
    });
  }

  deleteData(user){
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log("data deleted Successfully");
    })
  }
  selectUser(user){
    console.log(user);
    this.selectedUser= user;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id , form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log("data updated Successfully");
    })
}
}
