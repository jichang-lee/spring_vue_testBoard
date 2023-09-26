import { createRouter, createWebHistory } from 'vue-router'

import boardList from '/src/components/boardList.vue'

const routes = [
 
  {
    path: '/board',
    name: 'board',
   component : boardList
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router