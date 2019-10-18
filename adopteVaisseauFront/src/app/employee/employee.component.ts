import {Component, Input, OnInit} from '@angular/core';
import {RestService} from "../rest.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  @Input() employe = { id: '',lastName: '', firstName: '', mail: '',password: ''};

  employes: any = [];

  url : any;

  constructor(public rest: RestService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
  }

  addEmploye() {
    this.rest.addEmploye(this.employe).subscribe((result) => {
      console.log(result);
      this.url = "http://localhost:8080/api/add-employee"
      this.employe = {id: '', lastName: '', firstName: '', mail: '',password: ''};
      this.getEmploye(this.url);
    }, (err) => {
      console.log(err);
    });
  }

  getEmploye(urlParam :any) {
    this.employes= [];
    this.rest.getEmployes().subscribe((data: {}) => {
      console.log(data);

      if (urlParam){
        this.url=urlParam;
      } else {
        this.url="http://localhost:8080/api/employee";
      }
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

  findEmploye(id :any) {
    this.rest.findEmploye(id).subscribe((result) => {
      console.log(result);
      this.url = "http://localhost:8080/api/find-employee/"+id
      this.employe = result;
      this.getEmploye(this.url);
    }, (err) => {
      console.log(err);
    });
  }

  deleteEmploye(id :any){
    this.rest.deleteEmploye(id).subscribe((data: {}) => {
      console.log(data);
      this.url = "http://localhost:8081/api/delete-employee/" + id;

      //On a pas fais les interfaces angular
      this.getEmploye(this.url);
    });
  }

}
