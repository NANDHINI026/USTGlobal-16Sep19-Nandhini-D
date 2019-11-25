import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { CategoriesComponent } from './categories/categories.component';
import { CountriesComponent } from './countries/countries.component';
import { SearchComponent } from './search/search.component';
import { SourcesComponent } from './sources/sources.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CategoriesComponent,
    CountriesComponent,
    SearchComponent,
    SourcesComponent
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home' , component : HomeComponent},
      {path : 'categories' , component : CategoriesComponent},
      {path : 'country' , component : CountriesComponent},
      {path : 'source' , component : SourcesComponent},
      {path : 'search' , component : SearchComponent},
      
      

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
