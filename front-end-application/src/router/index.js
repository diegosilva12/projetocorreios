import Vue from 'vue'
import Router from 'vue-router'
import Login from '../pages/login/'
import SignUp from '../pages/sign-up/'
import Home from '../pages/home/'
import MeusDados from '../pages/meus-dados/'
import CadastraCodigo from '../pages/cadastra-codigo/'

Vue.use(Router)

const router = new Router({
    routes: [
        {
            path: '/',
            name: 'Login',
            component: Login 
        },
        {
            path: '/sign-up',
            name: 'SingUp',
            component: SignUp
        },
        {
            path: '/home',
            name: 'Home',
            component: Home
        },
        {
            path: '/meus-dados',
            name: 'MeusDados',
            component: MeusDados
        },
        {
            path: '/cadastra-codigo',
            name: 'CadastraCodigo',
            component: CadastraCodigo
        },
    ]
})

export default router;