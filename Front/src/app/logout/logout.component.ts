import { Component, OnInit } from '@angular/core';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private harcodedAuthentication: HardcodedAuthenticationService){

  }

  ngOnInit(): void {
    this.harcodedAuthentication.logout();
  }

}
