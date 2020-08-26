import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { WelcomeModule } from './welcome.module';

const routes: Routes = [{ path: 'welcome', component: HomeComponent }, { path: '', redirectTo: 'welcome' }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class WelcomeRoutingModule { }
