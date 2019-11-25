import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildmovieComponent } from './childmovie.component';

describe('ChildmovieComponent', () => {
  let component: ChildmovieComponent;
  let fixture: ComponentFixture<ChildmovieComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildmovieComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildmovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
