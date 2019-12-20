import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  products: any;
  selectedUser;

  constructor(private service: AuthService,private http :HttpClient) { 
    this.getData();
  }

  getData() {
    this.http.get<any>('http://localhost:8080/get-all').subscribe(data => {
        console.log(data);
        this.products = data.product;
    });
    
  }

  updateData(form) {
    console.log(form.value);
    this.service.updateProduct(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated sucessfully');
    });
  }

  selectUser(product) {
    console.log(product);
    this.selectedUser = product;
  }

  ngOnInit() {
  }

}
