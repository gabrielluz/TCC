import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { RouterModule }   from '@angular/router';

import { MenubarModule } from 'primeng/primeng';
import { ButtonModule } from 'primeng/primeng';
import { DropdownModule } from 'primeng/primeng';
import { InputTextModule } from 'primeng/primeng';
import { MenuModule } from "primeng/components/menu/menu";

import { AppComponent } from './app.component';
import { HomeAdministrativoComponent } from './home-administrativo/home-administrativo.component';
import { TelaLoginComponent } from './tela-login/tela-login.component';
import { HomeRestauranteComponent } from './home-restaurante/home-restaurante.component';
import { HomeEmpresaComponent } from './home-empresa/home-empresa.component';
import { DashboardEmpresarialComponent } from './dashboard-empresarial/dashboard-empresarial.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeAdministrativoComponent,
    TelaLoginComponent,
    HomeRestauranteComponent,
    HomeEmpresaComponent,
    DashboardEmpresarialComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    ButtonModule,
    DropdownModule,
    InputTextModule,
    MenubarModule,
    MenuModule,
    RouterModule.forRoot([
      {
        path: 'login',
        component: TelaLoginComponent
      }, {
        path: 'administrativo',
        component: HomeAdministrativoComponent
      }, {
        //Voce coloca o componente em uma rota, e os filhos dele herdarao o layout. Saindo no router-outlet
        path: 'empresarial',
        component: HomeEmpresaComponent,
        children: [{ path: 'dashboard', component: DashboardEmpresarialComponent}]
      }, {
        path: 'restaurante',
        component: HomeRestauranteComponent
      }, {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full'
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
