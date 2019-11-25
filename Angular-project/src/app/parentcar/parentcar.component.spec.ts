import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParentcarComponent } from './parentcar.component';

describe('ParentcarComponent', () => {
  let component: ParentcarComponent;
  let fixture: ComponentFixture<ParentcarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParentcarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParentcarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
