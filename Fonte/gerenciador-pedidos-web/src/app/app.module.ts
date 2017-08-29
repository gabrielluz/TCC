import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { ButtonModule } from 'primeng/primeng';
import {DropdownModule} from 'primeng/primeng';
import {InputTextModule} from 'primeng/primeng';

import { AppComponent } from './app.component';
import { HomeAdministrativoComponent } from './home-administrativo/home-administrativo.component';
import { RouterModule }   from '@angular/router';
import { TelaLoginComponent } from './tela-login/tela-login.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeAdministrativoComponent,
    TelaLoginComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    ButtonModule,
    DropdownModule,
    InputTextModule,
    RouterModule.forRoot([
      {
        path: 'login',
        component: TelaLoginComponent
      }, 
      {
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
