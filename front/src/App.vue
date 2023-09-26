<template>

<div class="app-container">
    <navbarMenu></navbarMenu>
    <router-view></router-view>
  </div>
</template>

<script setup>
import navbarMenu from './components/navbarMenu.vue'


</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

</style>
