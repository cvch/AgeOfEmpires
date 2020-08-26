import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WelcomeRoutingModule } from './welcome-routing.module';
import { HomeComponent } from './components/home/home.component';
import { CivilizationComponent } from './components/civilization/civilization.component';
import { UnitComponent } from './components/unit/unit.component';
import { StructureComponent } from './components/structure/structure.component';
import { TechnologyComponent } from './components/technology/technology.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [HomeComponent, CivilizationComponent, UnitComponent, StructureComponent, TechnologyComponent],
  imports: [
    CommonModule,
    WelcomeRoutingModule,
    HttpClientModule
  ]
})
export class WelcomeModule { }
