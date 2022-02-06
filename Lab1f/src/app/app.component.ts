import { Component } from '@angular/core';
import { Gamepads } from './gamepads';
import { Service1Service } from './service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  title = 'Lab1f';
  gamepadsList:Gamepads[]=[];

  constructor(private service:Service1Service){}

  getGamepads():void{
    this.service.getGamepads().subscribe(
      (gmpds)=>{
        this.gamepadsList=gmpds;
      }
    )
  }
}
