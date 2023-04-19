import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { product } from 'src/app/finder/finder.component';

@Injectable({
  providedIn: 'root'
})
export class ProductDataService {

  constructor(private http: HttpClient) { }

  retrieveAllProducts(category:string ){
    return this.http.get<product[]>(`http://localhost:8765/user-service/displayOrders?category=${category}`);
  }
}
