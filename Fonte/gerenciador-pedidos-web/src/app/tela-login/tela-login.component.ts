import { NavigationExtras, Router } from '@angular/router';
import { SelectItem } from 'primeng/primeng';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tela-login',
  templateUrl: './tela-login.component.html',
  styleUrls: ['./tela-login.component.css']
})
export class TelaLoginComponent implements OnInit {

  public modulos: Array<SelectItem>;  
  public moduloSelecionado: string;
  private router: Router;

  constructor(router: Router) {
    this.router = router;
  }
  
  ngOnInit() {
    this.modulos = new Array();
    this.modulos.push({label: 'Selecione um modulo', value: null});
    this.modulos.push({label: 'Restaurante', value: 'restaurante'});
    this.modulos.push({label: 'Administrador', value: 'administrativo'});
    this.modulos.push({label: 'Empresa', value: 'empresarial'});
  }

  entrar() {
    console.log(this.moduloSelecionado);
    this.router.navigateByUrl(this.moduloSelecionado);
  }

}
