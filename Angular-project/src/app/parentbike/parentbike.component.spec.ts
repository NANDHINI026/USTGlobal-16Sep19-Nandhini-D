import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentbikeComponent } from './parentbike.component';

describe('ParentbikeComponent', () => {
  let component: ParentbikeComponent;
  let fixture: ComponentFixture<ParentbikeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentbikeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentbikeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
