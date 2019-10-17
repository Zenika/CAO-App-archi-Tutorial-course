import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ClientComponent } from './client/client.component';


const appRoutes: Routes = [
  {
    path: 'client',
    component: ClientComponent,
    data: { title: 'Client' }
  },
  { path: '',
    redirectTo: '/client',
    pathMatch: 'full'
  }
];
@NgModule({
  declarations: [
    AppComponent,
    ClientComponent
  ],
  imports: [
    RouterModule.forRoot(appRoutes),
    FormsModule,
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
