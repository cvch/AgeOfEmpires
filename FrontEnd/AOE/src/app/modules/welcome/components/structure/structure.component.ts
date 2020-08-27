import { Component, OnInit } from '@angular/core';
import { GeneralService } from '../../../../shared/service/general.service';

@Component({
  selector: 'app-structure',
  templateUrl: './structure.component.html',
  styleUrls: ['./structure.component.css']
})
export class StructureComponent implements OnInit {

  structures:any;
  structureSelected:any;

  constructor(private generalService: GeneralService) { }

  ngOnInit(): void {
    this.structures = [];
    this.structureSelected = {};
    this.getStructures();
  }

  public getStructures() {
    this.generalService.get('structures').subscribe(result => {
      this.structures = result.structures;
      this.structureSelected = this.structures[0];
    })
  }

  public selectStructure(structurSelected:any){
    this.structureSelected = structurSelected;
  }

}
