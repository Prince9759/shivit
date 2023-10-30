import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GetcompanyComponent } from './getcompany/getcompany.component';
import { HttpClientModule } from '@angular/common/http';
import { AddcompanyComponent } from './addcompany/addcompany.component';
import { UpdatecompanyComponent } from './updatecompany/updatecompany.component';
@NgModule({
  declarations: [
    AppComponent,
    GetcompanyComponent,
    AddcompanyComponent,
    UpdatecompanyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
