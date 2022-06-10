import { Component, OnInit } from '@angular/core';
import { Gamepads } from '../gamepads';
import { Rest1 } from '../rest1';
import { MainLogicService } from '../main-logic.service';
import { Table2 } from '../table2';

@Component({
  selector: 'app-section2-cards',
  templateUrl: './section2-cards.component.html',
  styleUrls: ['./section2-cards.component.sass']
})
export class Section2CardsComponent implements OnInit {

  title:string="List of Items";

  itemsList:Gamepads[]=[];
  itemsList2:Table2[]=[];

  showAddForm:boolean=false;
  selectedItem?:Gamepads;
  selectedItem2?:Table2;
  selectedTable:number = 1;

  id:number = 1;

  constructor(private service:MainLogicService) { }

  ngOnInit(): void {
    this.updateItems();
    this.updateItems2();
    console.log(this.service.url);
  }

  changeTableLink1(){
    this.selectedTable = 1;
    this.updateItems();
  }
  changeTableLink2(){
    this.selectedTable = 2;
    this.updateItems();
  }
// --------------------- 1 TABLE ---------------------------
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
  
  // --------------------- 2 TABLE ---------------------------
  updateItems2(){
    this.service.getItems2().subscribe(
      (Rest2)=>{
        this.itemsList2=Rest2._embedded.table2s;
        console.log(this.itemsList2);

      }
    );
  }

  addItem2(item:Table2){
    this.service.postItem2(item).subscribe(
      (item)=>{
        // console.log(item);
        this.updateItems2();
      }
    );
  }

  updateItem2(item:Table2){
    
    console.log(item);
    item._links =this.selectedItem2?._links!;
    
      this.service.putItem2(item).subscribe(
      ()=>{
        this.updateItems2();      
      }
    );
    this.onSelect2(item);
  }

  onSelect2(item:Table2){
    console.log(item);
    if(this.selectedItem2 && item._links.table2==this.selectedItem2._links.table2){
      this.selectedItem2=undefined;
    } else {
      this.selectedItem2=item;
    }
  }

  deleteItem2(item:Table2){
    this.service.deleteItem2(item).subscribe(
      ()=>{
        this.updateItems2();

      }
    );
  }
  


}
  

