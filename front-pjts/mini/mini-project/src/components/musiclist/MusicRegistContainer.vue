<template>
  <div class="container" style="max-width: 50%">
    <br />
    <br />
    <div class="mb-3">
      <label for="id" class="form-label" style="color: black">ID</label>
      <input type="text" class="form-control" id="id" v-model="id" />
    </div>

    <div class="mb-3">
      <label for="title" class="form-label" style="color: black">제목</label>
      <input type="text" class="form-control" id="title" v-model="title" />
    </div>
    <div class="mb-3">
      <label for="genre" class="form-label" style="color: black">장르</label>
      <input type="text" class="form-control" id="genre" v-model="genre" />
    </div>
    <div class="mb-3">
      <label for="artist" class="form-label" style="color: black">가수</label>
      <input type="text" class="form-control" id="artist" v-model="artist" />
    </div>
    <div class="mb-3">
      <label for="date" class="form-label" style="color: black">발매일</label>
      <input type="text" class="form-control" id="date" v-model="date" />
    </div>
    <div class="mb-3">
      <label for="runningTime" class="form-label" style="color: black"
        >곡 시간</label
      >
      <input
        type="number"
        class="form-control"
        id="runningTime"
        v-model="runningTime"
      />
    </div>
    <div class="mb-5">
      <button class="btn btn-primary" v-on:click="registMusic">등록</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "MusicRegistContainer",
  data() {
    return {
      id: "",
      title: "",
      genre: "",
      artist: "",
      date: "",
      runningTime: "",
    };
  },
  methods: {
    registMusic() {
      const musicList = localStorage.getItem("musicList");
      let temp = [];
      if (musicList) {
        temp = JSON.parse(musicList);
      }

      let musicObj = {
        id: this.id,
        title: this.title,
        genre: this.genre,
        artist: this.artist,
        date: this.date,
        runningTime: this.runningTime,
      };

      temp.push(musicObj);

      localStorage.setItem("musicList", JSON.stringify(temp));

      this.$router.push("/");
    },
  },
};
</script>

<style></style>
