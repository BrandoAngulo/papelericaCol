<template>
  <div class="home">
    <img class="imagen" alt="Vue logo" src="../assets/papeleriaCol.png">
    <HelloWorld/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
export default {
  name: 'HomeView',
  components: {
    HelloWorld,
  }
}
</script>
<style>
.imagen{
  width: 100%;
}

</style>
