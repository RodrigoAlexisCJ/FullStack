import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';
import { DataSenderService } from '../service/data-sender.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  password:string = '';
  username:string = 'pashu';
  errorMessage:string = 'Invalid Credentials';
  invalidLogin:boolean = false;

  constructor(private router:Router, private hardcodedAuthentication:HardcodedAuthenticationService, 
    public dataSender:DataSenderService){
  }

  ngOnInit(): void {
  }

  handleLogin(){
    if (this.hardcodedAuthentication.authenticate(this.username,this.password)) {
        this.invalidLogin = false;
        this.dataSender.data = this.username;
        console.log(this.dataSender.data);
        this.router.navigate(['welcome',this.username]);
    } else {
      this.invalidLogin = true;
    }
    console.log(this.username + ' & ' + this.password + ' & '+ this.invalidLogin);
  }

}
