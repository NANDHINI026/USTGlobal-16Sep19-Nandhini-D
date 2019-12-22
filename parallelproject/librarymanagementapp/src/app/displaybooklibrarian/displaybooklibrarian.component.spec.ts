import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaybooklibrarianComponent } from './displaybooklibrarian.component';

describe('DisplaybooklibrarianComponent', () => {
  let component: DisplaybooklibrarianComponent;
  let fixture: ComponentFixture<DisplaybooklibrarianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplaybooklibrarianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplaybooklibrarianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
