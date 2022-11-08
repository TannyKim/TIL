<template>
  <div>
    <music-nav-bar></music-nav-bar>
    <music-regist-container></music-regist-container>
  </div>
</template>

<script>
import MusicNavBar from "@/components/musiclist/MusicNavBar.vue";
import MusicRegistContainer from "@/components/musiclist/MusicRegistContainer.vue";
export default {
  name: "MusicRegistView",
  components: {
    MusicNavBar,
    MusicRegistContainer,
  },
};
</script>

<style></style>
