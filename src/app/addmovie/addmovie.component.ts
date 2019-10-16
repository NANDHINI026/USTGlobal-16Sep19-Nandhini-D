import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidation } from './customvalidation';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {
  get text() {
    return this.form.get('text')
  }
  get title() {
    return this.form.get('title')
  }
  get url() {
    return this.form.get('url')
  }
  get desc() {
    return this.form.get('desc')
  }
  form = new FormGroup({
    text : new FormControl('' , [Validators.required, CustomValidation.unique]),
    title : new FormControl('' ,[Validators.required]),
    url : new FormControl('' ,[Validators.required]),
    desc : new FormControl('' ,[Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  loginData(form){
    console.log(form);
  }
}
