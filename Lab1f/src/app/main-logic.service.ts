import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import { Gamepads } from './gamepads';
import { Rest1 } from './rest1';
import { Table2 } from './table2';
import { Rest2 } from './rest2';

@Injectable({
  providedIn: 'root'
})
export class MainLogicService {
  list = new BehaviorSubject<Gamepads[]>([])
  list2 = new BehaviorSubject<Table2[]>([])
  // url:string="http://localhost:3000/users"
  //url:string="http://localhost:8080/users/Servlet1"
  url:string="http://localhost:1155/gamepads"
  url2:string="http://localhost:1155/table2s"
  // USERS:Gamepads[]=[{id:1,name:"Roman", age:49},{id:2,name:"Olena", age:29}]

  constructor(private http:HttpClient) { }
// --------------------- 1 TABLE ---------------------------
  getItems():Observable<Rest1>{
    return this.http.get<Rest1>(this.url);
  }

  postItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.post<Gamepads[]>(this.url,user);
  }

  putItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.put<Gamepads[]>(user._links.gamepad.href,user);
  }

  deleteItem(user:Gamepads):Observable<Gamepads[]>{
    return this.http.delete<Gamepads[]>(user._links.gamepad.href);
  }

  // setList(list:Gamepads[]){
  //   this.list.next(list);
  // }
 // --------------------- 2 TABLE ---------------------------
  getItems2():Observable<Rest2>{
    return this.http.get<Rest2>(this.url2);
    
    
  }

  postItem2(user:Table2):Observable<Table2[]>{
    return this.http.post<Table2[]>(this.url2,user);
  }

  putItem2(user:Table2):Observable<Table2[]>{
    return this.http.put<Table2[]>(user._links.table2.href,user);
  }

  deleteItem2(user:Table2):Observable<Table2[]>{
    return this.http.delete<Table2[]>(user._links.table2.href);
  }

  // setList2(list2:Table2[]){
  //   this.list2.next(list2);
  // }


}
