import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

const endpoint = 'http://localhost:8080/api/';
const endpoint2 = 'http://localhost:8081/api/';
const httpOptions = {
  headers: new HttpHeaders({
    'content-type':  'application/json',
    'Access-Control-Allow-Credentials': 'true'
  })
};

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) {}

  private extractData(res: Response) {
    let body = res;
    return body || { };
  }
  
  addClient(client): Observable<any> {
    console.log(client);
    return this.http.post<any>(endpoint + 'add-client', client, httpOptions).pipe(
      tap((product) => console.log(`added client`)),
      catchError(this.handleError<any>('addProduct'))
    );
  }

  addEmploye(employe): Observable<any> {
    console.log(employe);
    return this.http.post<any>(endpoint + 'add-employee', employe, httpOptions).pipe(
      tap((product) => console.log(`added employe`)),
      catchError(this.handleError<any>('addEmploye'))
    );
  }

  getClients(): Observable<any> {
    return this.http.get(endpoint + 'client').pipe(
      map(this.extractData));
  }

  getEmployes(): Observable<any> {
    return this.http.get(endpoint + 'employee').pipe(
      map(this.extractData));
  }

  getEmployesApi2(): Observable<any> {
    return this.http.get(endpoint2 + 'employee').pipe(
      map(this.extractData));
  }
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
