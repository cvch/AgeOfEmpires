import { Component, OnInit } from '@angular/core';
import { GeneralService } from '../../../../shared/service/general.service';

@Component({
  selector: 'app-unit',
  templateUrl: './unit.component.html',
  styleUrls: ['./unit.component.css']
})
export class UnitComponent implements OnInit {

  units:any;
  unitSelected:any;
  constructor(private generalService: GeneralService) { }

  ngOnInit(): void {
    this.unitSelected = {};
    this.units = [];
    this.getUnits();
  }

  public getUnits() {
    this.generalService.get('units').subscribe(result => {
      this.units = result.units;
      this.unitSelected = this.units[0];
    })
  }

  public selectUnit(unitSelected:any){
    this.unitSelected = unitSelected;
  }

}
