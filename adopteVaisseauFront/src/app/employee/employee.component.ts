import {Component, Input, OnInit} from '@angular/core';
import {RestService} from "../rest.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  @Input() employe = { lastName: '', firstName: '', mail: '',password: ''};

  employes: any = [];

  url : any;

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }

  addEmploye() {
    this.rest.addEmploye(this.employe).subscribe((result) => {
      console.log(result);
      this.employe = { lastName: '', firstName: '', mail: '',password: ''};
    }, (err) => {
      console.log(err);
    });
  }

  getEmploye() {
    this.employes= [];
    this.rest.getEmployes().subscribe((data: {}) => {
      console.log(data);
      this.url="http://localhost:8080/api/employee";
      this.employes = data;
    });
  }

  getEmployeApi2() {
    this.employes= [];
    this.rest.getEmployesApi2().subscribe((data: {}) => {
      console.log(data);
      this.url="http://localhost:8081/api/employee";
      this.employes = data;
    });
  }

}
