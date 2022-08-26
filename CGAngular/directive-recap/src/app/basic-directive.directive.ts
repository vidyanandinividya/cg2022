import { Directive, ElementRef, OnInit } from '@angular/core';

@Directive({
  selector: '[appBasicDirective]'
})
export class BasicDirectiveDirective implements OnInit {

  constructor(private elemntRef:ElementRef) { }
ngOnInit(): void {
  this.elemntRef.nativeElement.style.backgroundColor='blue'
}

}
