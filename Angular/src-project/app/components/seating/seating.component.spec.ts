import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeatingComponent } from './seating.component';

describe('SeatingComponent', () => {
  let component: SeatingComponent;
  let fixture: ComponentFixture<SeatingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SeatingComponent]
    });
    fixture = TestBed.createComponent(SeatingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
