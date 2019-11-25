import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildcarComponent } from './childcar.component';

describe('ChildcarComponent', () => {
  let component: ChildcarComponent;
  let fixture: ComponentFixture<ChildcarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildcarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildcarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
