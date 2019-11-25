import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentmobileComponent } from './parentmobile.component';

describe('ParentmobileComponent', () => {
  let component: ParentmobileComponent;
  let fixture: ComponentFixture<ParentmobileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentmobileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentmobileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
