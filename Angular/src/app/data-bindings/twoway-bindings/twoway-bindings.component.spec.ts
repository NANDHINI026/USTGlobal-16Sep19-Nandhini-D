import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TwowayBindingsComponent } from './twoway-bindings.component';

describe('TwowayBindingsComponent', () => {
  let component: TwowayBindingsComponent;
  let fixture: ComponentFixture<TwowayBindingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TwowayBindingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TwowayBindingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
