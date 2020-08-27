import { Component, OnInit } from '@angular/core';
import { GeneralService } from '../../../../shared/service/general.service';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  technologies:any;
  technologySelected:any;

  constructor(private generalService: GeneralService) { }

  ngOnInit(): void {
    this.technologies = [];
    this.technologySelected = {};
    this.getTechnologies();
  }

  public getTechnologies() {
    this.generalService.get('technologies').subscribe(result => {
      this.technologies = result.technologies;
      this.technologySelected = this.technologies[0];
    })
  }

  public selectTechnology(technologySelected:any){
    this.technologySelected = technologySelected;
  }
}
