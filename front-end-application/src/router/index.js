import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/pages/login/'
import SignUp from '@/pages/sign-up/'
import Home from '@/pages/home/'
import MeusDados from '@/pages/meus-dados/'
import CadastrarCodigo from '@/pages/cadastrar-codigo/'

Vue.use(Router)

const router = new Router({
    routes: [
        {
            path: '/',
            name: 'Login',
            component: Login,
            
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
            path: '/cadastrar-codigo',
            name: 'CadastrarCodigo',
            component: CadastrarCodigo
        },
    ]
})

export default router;