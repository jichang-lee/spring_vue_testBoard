import { createRouter, createWebHistory } from 'vue-router'

import boardList from '/src/components/boardList.vue'
import boardRegister from '/src/components/boardRegister.vue'

const routes = [
 
  {
    path: '/api/board/list',
    name: 'boardList',
   component : boardList,
  },
  {
    path: '/board/register',
    name: 'register',
   component : boardRegister,
  }

  
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router