import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Gamepads } from './gamepads';
@Injectable({
  providedIn: 'root'
})
export class Service1Service {
  url:string = "http://localhost:8080/Lab1/Servlet1"

  constructor(private http:HttpClient) {}

  getGamepads():Observable<Gamepads[]>{
    return this.http.get<Gamepads[]>(this.url);
  }
}
