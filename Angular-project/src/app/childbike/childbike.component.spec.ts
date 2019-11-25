import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildbikeComponent } from './childbike.component';

describe('ChildbikeComponent', () => {
  let component: ChildbikeComponent;
  let fixture: ComponentFixture<ChildbikeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildbikeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildbikeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
