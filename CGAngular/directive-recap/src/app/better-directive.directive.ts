import { Directive, ElementRef, OnInit, Renderer2 } from '@angular/core';
import { HostListener } from '@angular/core';
import { HostBinding } from '@angular/core';
import { Input } from '@angular/core';

@Directive({
  selector: '[appBetterDirective]'
})
export class BetterDirectiveDirective implements OnInit{
@Input() defaultColor:string='pink';
@Input() highlightColor:string='blue';
  constructor(private elRef:ElementRef,private render:Renderer2) { }
ngOnInit(): void {
  
}
@HostBinding('style.backgroundColor') backgroundColor:string=this.defaultColor
@HostListener('mouseenter') mouseover(eventData:Event)
{
  //this.render.setStyle(this.elRef.nativeElement,'background-color','pink');
  this.backgroundColor=this.highlightColor;
}
@HostListener('mouseleave') mouseleave(eventData:Event)
{
 // this.render.setStyle(this.elRef.nativeElement,'background-color','grey');
 this.backgroundColor=this.defaultColor;
}
}
