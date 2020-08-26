import { Component, OnInit } from '@angular/core';
import { GeneralService } from '../../../../shared/service/general.service';

@Component({
  selector: 'app-civilization',
  templateUrl: './civilization.component.html',
  styleUrls: ['./civilization.component.css']
})
export class CivilizationComponent implements OnInit {

  civilizations: any;
  civilizationSelect: any;
  constructor(private generalService: GeneralService) { }

  ngOnInit(): void {
    this.civilizationSelect = {};
    this.civilizations = [];
    this.getCivilizations();
    this.getCivilizationById('1');
  }

  public getCivilizations() {
    this.generalService.get('civilizations').subscribe(result => {
      this.civilizations = result.civilizations;
      this.civilizationSelect = this.civilizations[0];
      console.log(this.civilizationSelect);
    })

  }

  public getCivilizationById(id: string) {
    this.generalService.get(`civilization/${id}`).subscribe(result => {
      console.log(result);
    })
  }

  public selectCivilization(civilizationSelect: any) {
    this.civilizationSelect = civilizationSelect;
  }

}
