import { Component, OnInit } from '@angular/core';
import { Gamepads } from '../gamepads';
import { InfoForCard } from '../info-for-card';
import { MainLogicService } from '../main-logic.service';

@Component({
  selector: 'app-section2-cards',
  templateUrl: './section2-cards.component.html',
  styleUrls: ['./section2-cards.component.sass']
})
export class Section2CardsComponent implements OnInit {

  constructor(private service:MainLogicService) { 
}



  ngOnInit(): void {
    this.changeVisibility(0);
    this.changeVisibility(1);
    this.changeVisibility(2);
    this.getGamepads();
  }

  visibility:string[] = ["","",""];

  gamepadsList:Gamepads[]=[];



  getGamepads():void{
    this.service.getGamepads().subscribe(
      (gmpds)=>{
        this.gamepadsList=gmpds;
      }
    )
  }



  
  changeVisibility(n:number){
    if (this.visibility[n] == ""){
      this.visibility[n] = "invisible"
      console.log(this.visibility[n])
    }
    else{
      this.visibility[n] = ""
      console.log(this.visibility[n])
    }
  }


  
  
}
