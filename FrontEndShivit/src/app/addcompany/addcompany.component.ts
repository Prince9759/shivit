import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { CompanyserviceService } from '../companyservice.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-addcompany',
  templateUrl: './addcompany.component.html',
  styleUrls: ['./addcompany.component.css']
})
export class AddcompanyComponent {
  CompanyRef = new FormGroup({
  
    cname: new FormControl(),
    caddress:new FormControl(),
    cemail:new FormControl()

    
   })

  constructor(private cs:CompanyserviceService,private router:Router){}

  storeCompany()
  {
    let Company = this.CompanyRef.value;
    this.cs.addCompany(Company).subscribe({
      next:(result:any)=>
      {console.log(result)},
      error:(error:any)=>console.log(error),
      complete:()=>console.log("complete")
    })
    this.router.navigate(['/getcompany'])

  }
}
