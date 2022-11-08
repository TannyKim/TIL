<template>
  <div>
    <music-nav-bar></music-nav-bar>
    <music-list-container></music-list-container>
  </div>
</template>
<script>
import MusicNavBar from "@/components/musiclist/MusicNavBar.vue";
import MusicListContainer from "@/components/musiclist/MusicListContainer.vue";

export default {
  name: "MusicListView",
  components: {
    MusicNavBar,
    MusicListContainer,
  },
};
</script>
