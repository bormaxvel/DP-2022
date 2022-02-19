import { Component, OnInit } from '@angular/core';
import { Gamepads } from '../gamepads';

import { MainLogicService } from '../main-logic.service';

@Component({
  selector: 'app-section2-cards',
  templateUrl: './section2-cards.component.html',
  styleUrls: ['./section2-cards.component.sass']
})
export class Section2CardsComponent implements OnInit {

  title:string="List of Users";
  usersList:Gamepads[]=[];
  showAddForm:boolean=false;
  selectedUser?:Gamepads;

  id:number = 1;

  constructor(private service:MainLogicService) { }

  ngOnInit(): void {
    this.updateUsers();
  }

  updateUsers(){
    this.service.getUsers().subscribe(
      (users)=>{
        this.usersList=users;
        this.service.setList(users);
      }
    );
  }

  addUser(user:Gamepads){
    this.service.postUser(user).subscribe(
      (user)=>{
        // console.log(user);
        this.updateUsers();
      }
    );
  }

  updateUser(user:Gamepads){
    
      this.service.putUser(user).subscribe(
      ()=>{
        this.updateUsers();      
      }
    );

  }

  onSelect(user:Gamepads){
    console.log(user);
    if(this.selectedUser && user.id==this.selectedUser.id){
      this.selectedUser=undefined;
    } else {
      this.selectedUser=user;
    }
  }

  deleteUser(user:Gamepads){
    this.service.deleteUser(user).subscribe(
      ()=>{
        this.updateUsers();
      }
    );
  }




  // ngOnInit(): void {
  //   this.changeVisibility(0);
  //   this.changeVisibility(1);
  //   this.changeVisibility(2);
  //   this.getGamepads();
  // }

  // visibility:string[] = ["","",""];

  // gamepadsList:Gamepads[]=[];



  // getGamepads():void{
  //   this.service.getUsers().subscribe(
  //     (gmpds)=>{
  //       this.gamepadsList=gmpds;
  //     }
  //   )
  // }



  
  // changeVisibility(n:number){
  //   if (this.visibility[n] == ""){
  //     this.visibility[n] = "invisible"
  //     console.log(this.visibility[n])
  //   }
  //   else{
  //     this.visibility[n] = ""
  //     console.log(this.visibility[n])
  //   }
  }


  
  

