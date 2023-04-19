import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataSenderService {

  mess:any;

  constructor() { }

  get data(): any{
    return this.mess;
  }

  set data(val: any){
    this.mess = val;
  }
}
