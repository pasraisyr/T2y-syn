import { Routes } from '@angular/router';
import { HomepageComponent } from './components/homepage/homepage.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { RegistrationFormComponent } from './components/registration-form/registration-form.component';
import { ContactComponent } from './components/contact/contact.component';
import { AboutComponent } from './components/about/about.component';
import { SignupComponent } from './components/auth/signup/signup.component'
import { SigninComponent } from './components/auth/signin/signin.component'
export const routes: Routes = [
    {
        path: '',
        component: HomepageComponent
    },

    {
        path: '',
        component: NavbarComponent
    },

    {
        path: 'Registration-form',
        component: RegistrationFormComponent
    },

    {
        path: 'Contact',
        component: ContactComponent
    },

    {
        path: 'About',
        component: AboutComponent
    },

    {
        path: 'Signup',
        component: SignupComponent
    },

    {
        path: 'Signin',
        component: SigninComponent
    }


   

];
