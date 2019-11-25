import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { HomeComponent } from './home/home.component';
import { ParentcarComponent } from './parentcar/parentcar.component';
import { ChildcarComponent } from './childcar/childcar.component';
import { ParentbikeComponent } from './parentbike/parentbike.component';
import { ChildbikeComponent } from './childbike/childbike.component';
import { ParentlaptopComponent } from './parentlaptop/parentlaptop.component';
import { ChildlaptopComponent } from './childlaptop/childlaptop.component';
import { ParentmobileComponent } from './parentmobile/parentmobile.component';
import { ChildmobileComponent } from './childmobile/childmobile.component';
import { ParentmovieComponent } from './parentmovie/parentmovie.component';
import { ChildmovieComponent } from './childmovie/childmovie.component';
import { BindingComponent } from './binding/binding.component';
import { PropertyBindingComponent } from './binding/property-binding/property-binding.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
@NgModule({
  declarations: [
    AppComponent,
    TechElevateComponent,
    HomeComponent,
    ParentcarComponent,
    ChildcarComponent,
    ParentbikeComponent,
    ChildbikeComponent,
    ParentlaptopComponent,
    ChildlaptopComponent,
    ParentmobileComponent,
    ChildmobileComponent,
    ParentmovieComponent,
    ChildmovieComponent,
    BindingComponent,
    PropertyBindingComponent,
    ReactiveformComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'tech-elevate' , component : TechElevateComponent},
      {path : 'home' , component : HomeComponent},
      {path : 'car' , component : ParentcarComponent},
      {path : 'bike' , component : ParentbikeComponent},
      {path : 'laptop' , component : ParentlaptopComponent},
      {path : 'mobile' , component : ParentmobileComponent},
      {path : 'movie' , component : ParentmovieComponent},
      {path : 'binding' , component : PropertyBindingComponent},
      {path : 'form' , component : ReactiveformComponent},

  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
