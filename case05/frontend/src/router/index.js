import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
/* import Counter from '@/components/Counter'
import Backend from '../components/Backend' */

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    }/* ,
    {
      path: '/counter',
      name: 'Counter',
      component: Counter
    },
    {
      path: '/backend',
      name: 'Backend',
      component: Backend
    } */
  ]
})
