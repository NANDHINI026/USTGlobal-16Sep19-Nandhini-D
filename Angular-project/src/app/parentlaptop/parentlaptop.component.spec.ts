import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentlaptopComponent } from './parentlaptop.component';

describe('ParentlaptopComponent', () => {
  let component: ParentlaptopComponent;
  let fixture: ComponentFixture<ParentlaptopComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentlaptopComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentlaptopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
