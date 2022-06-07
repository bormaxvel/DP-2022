import { Component, OnInit } from '@angular/core';
import { Gamepads } from '../gamepads';
import { Rest1 } from '../rest1';
import { MainLogicService } from '../main-logic.service';

@Component({
  selector: 'app-section2-cards',
  templateUrl: './section2-cards.component.html',
  styleUrls: ['./section2-cards.component.sass']
})
export class Section2CardsComponent implements OnInit {

  title:string="List of Items";

  itemsList:Gamepads[]=[];

  showAddForm:boolean=false;
  selectedItem?:Gamepads;

  id:number = 1;

  constructor(private service:MainLogicService) { }

  ngOnInit(): void {
    this.updateItems();
  }

  updateItems(){
    this.service.getItems().subscribe(
      (Rest1)=>{
        this.itemsList=Rest1._embedded.gamepads;
        //this.service.setList(items);
      }
    );
  }

  addItem(item:Gamepads){
    this.service.postItem(item).subscribe(
      (item)=>{
        // console.log(item);
        this.updateItems();
      }
    );
  }

  updateItem(item:Gamepads){
    
    console.log(item);
    item._links =this.selectedItem?._links!;
    
      this.service.putItem(item).subscribe(
      ()=>{
        this.updateItems();      
      }
    );
    this.onSelect(item);
  }

  onSelect(item:Gamepads){
    console.log(item);
    if(this.selectedItem && item._links.gamepad==this.selectedItem._links.gamepad){
      this.selectedItem=undefined;
    } else {
      this.selectedItem=item;
    }
  }

  deleteItem(item:Gamepads){
    this.service.deleteItem(item).subscribe(
      ()=>{
        this.updateItems();

      }
    );
  }
  }


  
  

