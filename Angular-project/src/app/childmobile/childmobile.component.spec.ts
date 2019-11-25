import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildmobileComponent } from './childmobile.component';

describe('ChildmobileComponent', () => {
  let component: ChildmobileComponent;
  let fixture: ComponentFixture<ChildmobileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildmobileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildmobileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
