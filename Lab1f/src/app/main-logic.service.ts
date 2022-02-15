import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { InfoForCard } from './info-for-card';
import { Gamepads } from './gamepads';

@Injectable({
  providedIn: 'root'
})
export class MainLogicService {

  url:string = "http://localhost:8080/Lab1/Servlet1"

  constructor(private http:HttpClient) {}

  getGamepads():Observable<Gamepads[]>{
    return this.http.get<Gamepads[]>(this.url);
  }

  // putGamepads(hero: Hero): Observable<Hero> {
  //   return this.http.put<Hero>(this.heroesUrl, hero, httpOptions)
  //     .pipe(
  //       catchError(this.handleError('updateHero', hero))
  //     );
  // }




  public inputs:string[] = ["", "", ""]
}
