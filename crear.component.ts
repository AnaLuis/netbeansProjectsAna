import { Component, OnInit, Output, ViewChild, ElementRef } from '@angular/core';
import { SDocumento } from '../servicio/SDocumento';
@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.css']
})
export class CrearComponent implements OnInit {
  @ViewChild('nombre') nombre:ElementRef;
  @ViewChild('Apellido') apellido: ElementRef;
  @ViewChild('Carrera') carrera: ElementRef;
  @ViewChild('Materia') materia: ElementRef;
 constructor(private Docum: SDocumento)  {
   }
   
  GuardarDatos(){
    if(this.nombre.nativeElement.value == ''
    || this.apellido.nativeElement.value == '' || 
    this.carrera.nativeElement.value == '' ){
      alert("Los campos deben estar llenos")
    }else{
      this.Docum.setDocumento(this.nombre.nativeElement.value,this.apellido.nativeElement.value,this.carrera.nativeElement.value,this.materia.nativeElement.value);
      this.Docum.actlist.emit();
      this.limpiar();
    }
  }
 
limpiar(){
  this.nombre.nativeElement.value = "";
  this.apellido.nativeElement.value = "";
  this.carrera.nativeElement.value = "";
  this.materia.nativeElement.value = "";
}


  ngOnInit() {
  }

}
