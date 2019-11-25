import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentmovieComponent } from './parentmovie.component';

describe('ParentmovieComponent', () => {
  let component: ParentmovieComponent;
  let fixture: ComponentFixture<ParentmovieComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentmovieComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentmovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
