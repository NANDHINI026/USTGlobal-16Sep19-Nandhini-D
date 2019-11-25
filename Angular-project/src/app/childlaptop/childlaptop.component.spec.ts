import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildlaptopComponent } from './childlaptop.component';

describe('ChildlaptopComponent', () => {
  let component: ChildlaptopComponent;
  let fixture: ComponentFixture<ChildlaptopComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildlaptopComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildlaptopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
