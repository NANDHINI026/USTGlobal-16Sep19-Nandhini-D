import { ElementRef, Directive, HostBinding, HostListener } from "@angular/core";

@Directive({
    selector : '[custDir]'
})


export class CustomDirective{
    constructor(private el :ElementRef){
        this.el.nativeElement.style.backgroundcolor = 'red';
    }
    @HostBinding('style.backgroundColor') backgroundColor = 'hotpink';
    @HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.backgroundColor = 'cyan';
    }
    @HostListener('mouseleave') mouseLeaveEvent() {
        this.el.nativeElement.style.backgroundColor = 'yellow';
    }
}