import { Component, OnInit, Input } from '@angular/core';
import { RestService } from '../rest.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.css']
})
export class ClientComponent implements OnInit {

  @Input() client = { lastName: '', firstName: '', tel: '', mail: '',isPermissionPilot: false };

  clients: any = [];

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
    this.getClients();
  }

  addClient() {
    this.rest.addClient(this.client).subscribe((result) => {
      console.log(result);
      this.clients.push(this.client);
      this.client = { lastName: '', firstName: '', tel: '', mail: '',isPermissionPilot: false };
    }, (err) => {
      console.log(err);
    });
  }

  getClients() {
    this.clients = [];
    this.rest.getClients().subscribe((data: {}) => {
      console.log(data);
      this.clients = data;
    });
  }
}
