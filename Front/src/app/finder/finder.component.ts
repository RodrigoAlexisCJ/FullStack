import { Component, OnInit } from '@angular/core';
import { ProductDataService } from '../service/data/product-data.service';

export class product{
  constructor (
    public id: number,
    public name:string,
    public category:string,
    public color:string,
    public price: number
  ){}
}

@Component({
  selector: 'app-finder',
  templateUrl: './finder.component.html',
  styleUrls: ['./finder.component.css']
})
export class FinderComponent implements OnInit{

  list:string[]=[" ","electronics","clothes"];
  products: product[] = [];
  selected:string = ' ';

  constructor(private service: ProductDataService){
  }

  ngOnInit(): void {
    this.getArticles();
  }

  getArticles(){
    this.service.retrieveAllProducts(this.selected).subscribe(
      {
        next: (n) => this.products = n
      }
    );
  }

  getArticlesByCategory(){
    this.getArticles();
  }

}
