import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminLogin } from './admin-login';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminSignupComponent } from './admin-signup/admin-signup.component';
import { LoginComponent } from './login/login.component';
import { MainPageComponent } from './main-page/main-page.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {path:"login", component:LoginComponent},
  {path:"signUp", component:SignupComponent},
  {path:"",redirectTo:"main", pathMatch:"full"},
  {path:"main", component:MainPageComponent},
  {path:"admin-login", component:AdminLoginComponent},
  {path:"admin-signup", component:AdminSignupComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


