import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { HeadercomponentComponent } from './headercomponent/headercomponent.component';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LibrarypageComponent } from './librarypage/librarypage.component';
import { RegisterComponent } from './register/register.component';
import { AddbookComponent } from './addbook/addbook.component';
import { DisplayBookComponent } from './display-book/display-book.component';
import { HomeComponent } from './home/home.component';
import { FilterPipe } from './filter.pipe';
import { DisplaybooklibrarianComponent } from './displaybooklibrarian/displaybooklibrarian.component';
import { RequestbookComponent } from './requestbook/requestbook.component';

@NgModule({
  declarations: [
    AppComponent,
    HeadercomponentComponent,
    LoginComponent,
    LibrarypageComponent,
    RegisterComponent,
    AddbookComponent,
    HomeComponent,
    DisplayBookComponent,
    FilterPipe,
    DisplaybooklibrarianComponent,
    RequestbookComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'header', component : HeadercomponentComponent},
      {path : 'library', component : LibrarypageComponent},
      {path : 'login', component : LoginComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'addbook', component : AddbookComponent },
      {path : 'home', component : HomeComponent},
      {path : 'display', component : DisplayBookComponent},
      {path : 'displaybooklib', component : DisplaybooklibrarianComponent},
      {path : 'request', component : RequestbookComponent}
       ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
