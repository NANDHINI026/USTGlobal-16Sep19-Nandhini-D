import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TechElevateComponent } from './tech-elevate.component';

describe('TechElevateComponent', () => {
  let component: TechElevateComponent;
  let fixture: ComponentFixture<TechElevateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TechElevateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TechElevateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
