import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import { Gamepads } from './gamepads';
import { Rest1 } from './rest1';

@Injectable({
  providedIn: 'root'
})
export class MainLogicService {
  list = new BehaviorSubject<Gamepads[]>([])
  // url:string="http://localhost:3000/users"
  //url:string="http://localhost:8080/users/Servlet1"
  url:string="http://localhost:1155/gamepads"
  // USERS:Gamepads[]=[{id:1,name:"Roman", age:49},{id:2,name:"Olena", age:29}]

  constructor(private http:HttpClient) { }

  getItems():Observable<Rest1>{
    return this.http.get<Rest1>(this.url);
  }

  postItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.post<Gamepads[]>(this.url,user);
  }

  putItem(user:Gamepads):Observable<Gamepads[]>{
    // return this.http.put<Gamepads[]>(this.url+"/"+user,user);
    return this.http.put<Gamepads[]>(this.url+"/"+user._links.gamepad,user);
  }

  deleteItem(user:Gamepads):Observable<Gamepads[]>{
    // return this.http.delete<Gamepads[]>(this.url+"/"+user);
    return this.http.delete<Gamepads[]>(this.url+"/"+user._links.gamepad);
  }

  setList(list:Gamepads[]){
    this.list.next(list);
  }


  public inputs:string[] = ["", "", ""]
}
