import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule} from '@angular/forms';
import { DisplayComponent } from './display/display.component';
import { FilterbynamePipe } from './filterbyname.pipe';
import { UpdateComponent } from './update/update.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AddproductComponent,
    DisplayComponent,
    FilterbynamePipe,
    UpdateComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'header', component : HeaderComponent},
      {path : 'add', component : AddproductComponent},
      {path : 'home', component : HomeComponent},
      {path : 'search', component : DisplayComponent},
      {path : 'update', component : UpdateComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
