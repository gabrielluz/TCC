import { Router } from '@angular/router';
import { MenuItem } from 'primeng/primeng';
import { Component, Input, OnInit, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-home-empresa',
  templateUrl: './home-empresa.component.html',
  styleUrls: ['./home-empresa.component.css'], 
  encapsulation: ViewEncapsulation.None,
})
export class HomeEmpresaComponent implements OnInit {

  public itensMenuSuperior: Array<MenuItem>;
  public itensMenuLateral: Array<MenuItem>;
  private router: Router;

  constructor(router: Router) {
    this.router = router;
  }

  ngOnInit() {
    this.inicializarMenuSuperior();
  }

  inicializarMenuSuperior() {
    this.itensMenuSuperior = [
      { label: 'Dashboard', routerLink: 'dashboard', routerLinkActiveOptions: 'active' }, 
      { label: 'Funcionários', routerLink: 'funcionarios' }, 
      { label: 'Restaurantes', routerLink: 'restaurantes' },
      { label: 'Dados cadastrais', routerLink: 'dados-cadastrais' }
    ];
  }

  sair() {
    this.router.navigateByUrl('login');
  }

}
