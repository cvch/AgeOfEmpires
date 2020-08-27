import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GeneralService {

  ENDPOINT_API = '/api/v1/';

  constructor(private http: HttpClient) { }

  public get(url): Observable<any> {
    return this.http.get(`${this.ENDPOINT_API}${url}`);
  }

  public post(url, data): Observable<any> {
    return this.http.post(`${this.ENDPOINT_API}${url}`, data);
  }

  public put(url, data): Observable<any> {
    return this.http.put(`${this.ENDPOINT_API}${url}`, data);
  }

  public delete(url, data): Observable<any> {
    return this.http.delete(`${this.ENDPOINT_API}${url}`, data);
  }

}
