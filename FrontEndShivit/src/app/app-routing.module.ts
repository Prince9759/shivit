import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetcompanyComponent } from './getcompany/getcompany.component';
import { AddcompanyComponent } from './addcompany/addcompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';

const routes: Routes = [
{path:"getcompany", component:GetcompanyComponent},
{path:"",redirectTo:"getcompany",pathMatch:"full"},
{path:"addcompany", component:AddcompanyComponent},
{path:"updatecompany/:id",component:UpdatecompanyComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
