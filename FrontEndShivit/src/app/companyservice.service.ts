import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';

import { Company } from './company';

@Injectable({
  providedIn: 'root'
})
export class CompanyserviceService {

  constructor(private http:HttpClient) { }

  addCompany(Company:any):Observable<string>
  {
    return this.http.post("http://localhost:8081/addcompany",Company,{responseType:"text"})
  }


  getAllCompany():Observable<Company[]>
  {
    return this.http.get<Company[]>("http://localhost:8081/allcompany")
  }

  updatecompany(id:number,Company:any):Observable<string>
  {
    return this.http.put(`http://localhost:8081/updatecompany/${id}`,Company,{responseType:"text"})
  }

  getCompanyByid(id:number):Observable<any>
  {
    return this.http.get(`http://localhost:8081/findByid/${id}`)
  }
}
