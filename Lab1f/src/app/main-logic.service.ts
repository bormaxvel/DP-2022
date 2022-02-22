import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import { Gamepads } from './gamepads';

@Injectable({
  providedIn: 'root'
})
export class MainLogicService {
  list = new BehaviorSubject<Gamepads[]>([])
  // url:string="http://localhost:3000/users"
  url:string="http://localhost:8080/users/Servlet1"
  // USERS:Gamepads[]=[{id:1,name:"Roman", age:49},{id:2,name:"Olena", age:29}]

  constructor(private http:HttpClient) { }

  getItems():Observable<Gamepads[]>{
    return this.http.get<Gamepads[]>(this.url);
  }

  postItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.post<Gamepads[]>(this.url,user);
  }

  putItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.put<Gamepads[]>(this.url+"/"+user.id,user);
  }

  deleteItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.delete<Gamepads[]>(this.url+"/"+user.id);
  }

  setList(list:Gamepads[]){
    this.list.next(list);
  }


  public inputs:string[] = ["", "", ""]
}
