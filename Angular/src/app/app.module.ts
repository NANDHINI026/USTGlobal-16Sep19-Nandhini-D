import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { EventBindingComponent } from './data-bindings/event-binding/event-binding.component';
import { TwowayBindingsComponent } from './data-bindings/twoway-bindings/twoway-bindings.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralComponent } from './directive/structural/structural.component';
import { NgifComponent } from './directive/structural/ngif/ngif.component';
import { NgforComponent } from './directive/structural/ngfor/ngfor.component';
import { NgswitchComponent } from './directive/structural/ngswitch/ngswitch.component';
import { CustomDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormComponent } from './form/form.component';
import { FormsComponent } from './forms/forms.component';
import { FormvalidationComponent } from './formvalidation/formvalidation.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { HttpClientModule } from '@angular/common/http';
import { DollorPipe } from './dollor.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DataBindingsComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwowayBindingsComponent,
    DirectiveComponent,
    StructuralComponent,
    NgifComponent,
    NgforComponent,
    NgswitchComponent,
    CustomDirective,
    RegisterComponent,
    FormComponent,
    FormsComponent,
    FormvalidationComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollorPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '' , component : AboutComponent},
      {path : 'help' , component : HelpComponent},
      {path : 'login' , component : LoginComponent},
      {path : 'home' , component : HomeComponent},
      {path : 'property-binding' , component : PropertyBindingComponent},
      {path : 'event-binding' , component : EventBindingComponent},
      {path : 'two-way' , component : TwowayBindingsComponent},
      {path : 'ngif' , component : NgifComponent},
      {path : 'ngfor' , component : NgforComponent},
      {path : 'ngswitch' , component : NgswitchComponent},
      {path : 'reg' , component : RegisterComponent},
      {path : 'form' , component : FormComponent},
      {path : 'form1' , component : FormsComponent},
      {path : 'form2' , component : FormvalidationComponent},
      {path : 'reactiveform' , component : ReactiveFormComponent},
      {path : 'parent' , component : ParentComponent},
      {path : 'comment-details' , component : CommentDetailsComponent},







    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
