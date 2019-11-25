import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'dollor'
})
export class DollorPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return value + '$';
  }

}
