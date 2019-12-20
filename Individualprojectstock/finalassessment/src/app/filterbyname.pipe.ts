import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterbyname'
})
export class FilterbynamePipe implements PipeTransform {

  transform(products: any, search: any): any[] {

    if (search === undefined) {
      return products;
    } else {
      return products.filter((value, index, array) => {
        return value.name.toLowerCase().includes(search.toLowerCase());
      });
    }
  }

}
