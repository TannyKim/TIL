<template>
  <div class="container">
    <br />
    <br />
    <h2 style="color: black">MusicList</h2>
    <div class="mb-3" v-if="musics.length">
      <table class="table">
        <thead>
          <tr>
            <th>제목</th>
            <th>장르</th>
            <th>가수</th>
            <th>발매일</th>
            <th>곡 시간</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(music, index) in musics" :key="index">
            <td>
              <router-link class="music-link" :to="`/detail:${music.id}`">{{
                music.title
              }}</router-link>
            </td>
            <td>{{ music.genre }}</td>
            <td>{{ music.artist }}</td>
            <td>{{ music.date }}</td>
            <td>{{ music.runningTime }}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
export default {
  name: "MusicListContainer",
  created() {
    const musicList = localStorage.getItem("musicList");
    if (musicList) {
      this.musics = JSON.parse(musicList);
    }
  },
  data() {
    return {
      musics: [],
    };
  },
};
</script>

<style></style>
