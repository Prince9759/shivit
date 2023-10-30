import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CompanyserviceService } from '../companyservice.service';
@Component({
  selector: 'app-getcompany',
  templateUrl: './getcompany.component.html',
  styleUrls: ['./getcompany.component.css']
})
export class GetcompanyComponent {
constructor(private cs:CompanyserviceService,private router:Router){}
ans:any=[]
id:any
ngOnInit(): void {
  this.cs.getAllCompany().subscribe({
    next:(result:any)=>{
      this.ans=result
     
    },
    error:(error:any)=>console.log(error),
      complete:()=>console.log("complete")
  })
}
AddCompany()
{
  this.router.navigate(['/addcompany'])
}

updateCompany(id:any)
{
//  this.id=id; 
//  console.log(this.id);
 this.router.navigate([`/updatecompany/${id}`])
}
}
