import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { CustomResponse } from '../interface/custom.response';
import { catchError, throwError, Observable } from 'rxjs';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ServerService {
  private readonly apiUrl = 'any';

  constructor(private http: HttpClient) { }

  servers$ = <Observable<CustomResponse>>
  this.http.get<CustomResponse>(`${this.apiUrl}/server/list`)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  );

  handleError(handleError: any): Observable<never> {
   // return throwError("Method not implemented");
    return throwError(() => new Error('Method not implemented'))
  }
}
