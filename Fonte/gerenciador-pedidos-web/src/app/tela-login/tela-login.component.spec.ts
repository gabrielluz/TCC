import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TelaLoginComponent } from './tela-login.component';

describe('TelaLoginComponent', () => {
  let component: TelaLoginComponent;
  let fixture: ComponentFixture<TelaLoginComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TelaLoginComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TelaLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
