import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardEmpresarialComponent } from './dashboard-empresarial.component';

describe('DashboardEmpresarialComponent', () => {
  let component: DashboardEmpresarialComponent;
  let fixture: ComponentFixture<DashboardEmpresarialComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DashboardEmpresarialComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DashboardEmpresarialComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
