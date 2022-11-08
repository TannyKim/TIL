<template>
  <div>
    <music-nav-bar></music-nav-bar>
    <music-detail-container></music-detail-container>
    <router-view />
  </div>
</template>
<script>
import MusicNavBar from "@/components/musiclist/MusicNavBar.vue";
import MusicDetailContainer from "@/components/musiclist/MusicDetailContainer.vue";

export default {
  name: "MusicDetailView",
  components: {
    MusicNavBar,
    MusicDetailContainer,
  },
};
</script>
