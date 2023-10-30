import { OnInit,Component } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { __param } from 'tslib';
import { CompanyserviceService } from '../companyservice.service';
import {FormGroup,FormControl} from '@angular/forms';

import { Router } from '@angular/router';
@Component({
  selector: 'app-updatecompany',
  templateUrl: './updatecompany.component.html',
  styleUrls: ['./updatecompany.component.css']
})
export class UpdatecompanyComponent implements OnInit{
constructor(private route:ActivatedRoute,private cs:CompanyserviceService,private router:Router){}
id:any
 name:any
email:any
address:any
CompanyRef = new FormGroup({
  
  cname: new FormControl(),
  caddress:new FormControl(),
  cemail:new FormControl()

  
 })
ngOnInit() 
{
  this.route.params.subscribe(params => {
  
      this.id=params['id']

   });

   this.cs.getCompanyByid(this.id).subscribe({
    next:(result)=>
    {
          console.log(result)
          this.name=result.cname
           this.address=result.caddress
           this.email=result.cemail
    },
    error:(error:any)=>console.log(error),
    complete:()=>console.log("complete")
   })

  

  



}


updateCompany()
{
  let Company = this.CompanyRef.value;
  this.cs.updatecompany(this.id,Company).subscribe({
    next:(result:any)=>
    {console.log(result)},
    error:(error:any)=>console.log(error),
    complete:()=>console.log("complete")
  })
  this.router.navigate(['/getcompany'])

}

}