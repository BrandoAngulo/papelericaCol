import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  },

  {
    path:'/proveedor',
    name:'proveedor',
    component:()=>import('@/views/ProveedorView.vue')
  },
  {
    path:'/categoria',
    name:'cate-goria',
    component:()=>import('@/views/CategoriaView.vue')
  },

  {
    
    path: '/usuario',
    name: 'usuario',
    component: () => import('../views/UsuarioView.vue')
  },
  {
    
    path: '/ventas',
    name: 'ventas',
    component: () => import('../views/VentasView.vue')
  },
/*   {
    
    path: '/roles',
    name: 'roles',
    component: () => import('../views/UsuarioView.vue')
  } */
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
