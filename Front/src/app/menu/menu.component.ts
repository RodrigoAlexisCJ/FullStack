import { Component, OnInit } from '@angular/core';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';
import { DataSenderService } from '../service/data-sender.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  isUserLogged: boolean = false;

  constructor(public hardcodedAuthnetication:HardcodedAuthenticationService, 
    public dataSender:DataSenderService){

  }

  ngOnInit(): void {
    this.isUserLogged = this.hardcodedAuthnetication.isUserLoggedIn();
  }

}
