import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AshwiniComponent } from './ashwini/ashwini.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SourcesComponent } from './sources/sources.component';
import { SearchComponent } from './search/search.component';
import { RouterModule } from '@angular/router';
import { NavComponent } from './nav/nav.component';
import { HttpClientModule } from '@angular/common/http';
import { InComponent } from './in/in.component';
import { UsComponent } from './us/us.component';

@NgModule({
  declarations: [
    AppComponent,
    AshwiniComponent,
    CountriesComponent,
    CategoriesComponent,
    SourcesComponent,
    SearchComponent,
    NavComponent,
    InComponent,
    UsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path :'as', component : AshwiniComponent},
      {path : 'c', component: CountriesComponent},
      {path : 'ct', component : CategoriesComponent },
      {path : 's', component : SourcesComponent},
      {path : 'sn', component : SearchComponent},
      {path : 'a1', component : InComponent},
      {path: 'us1', component: UsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
