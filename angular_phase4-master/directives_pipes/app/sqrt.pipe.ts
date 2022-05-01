import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sqrt'
})
export class SqrtPipe implements PipeTransform {

  transform(value:number , input:number): unknown {
    return  value*input;
  }

}


