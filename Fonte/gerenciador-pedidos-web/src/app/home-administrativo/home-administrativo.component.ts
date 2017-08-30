import { Router } from '@angular/router';
import { MenuItem } from 'primeng/primeng';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-administrativo',
  templateUrl: './home-administrativo.component.html',
  styleUrls: ['./home-administrativo.component.css']
})
export class HomeAdministrativoComponent implements OnInit {
  
  public itensMenuSuperior: Array<MenuItem>;
  private router: Router;

  constructor(router: Router) {
    this.router = router;
  }

  ngOnInit() {
    this.itensMenuSuperior = [{
      label: 'File',
      items: [{
        label: 'New',
        icon: 'fa-plus',
        items: [
          { label: 'Project' },
          { label: 'Other' },
        ]
      },
      { label: 'Open' },
      { label: 'Quit' }
      ]
    },
    {
      label: 'Edit',
      icon: 'fa-edit',
      items: [
        { label: 'Undo', icon: 'fa-mail-forward' },
        { label: 'Redo', icon: 'fa-mail-reply' }
      ]
    }];
  }

  sair() {
    this.router.navigateByUrl('login');
  }
}
