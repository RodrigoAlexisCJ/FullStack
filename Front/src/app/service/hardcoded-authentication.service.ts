import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthenticationService {

  constructor() { }

  authenticate(username:string, password:string) {
      if (username === 'pashu' && password === '123' || username === 'ringo' && password === '123' 
      || username === 'cuquito' && password === '123') {
        sessionStorage.setItem('autheticatedUser', username);
        return true;
      } else {
        return false;
      }
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('autheticatedUser');
    return !(user === null);
  }

  logout() {
    sessionStorage.removeItem('autheticatedUser');
  }
}
