import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CrearComponent } from './crear/crear.component';
import { ListaProyectosComponent } from './lista-proyectos/lista-proyectos.component';
import { DetalleProyectoComponent } from './detalle-proyecto/detalle-proyecto.component';
import { SDocumento } from './servicio/SDocumento';
import { MenuComponent } from './menu/menu.component';
import { VGuiadasComponent } from './v-guiadas/v-guiadas.component';
import { AcercaDeComponent } from './acerca-de/acerca-de.component';

@NgModule({
  declarations: [
    AppComponent,
    CrearComponent,
    ListaProyectosComponent,
    DetalleProyectoComponent,
    MenuComponent,
    VGuiadasComponent,
    AcercaDeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [SDocumento],
  bootstrap: [AppComponent]
})
export class AppModule { }
