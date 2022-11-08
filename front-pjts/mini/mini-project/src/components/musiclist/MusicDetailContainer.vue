<template>
  <div class="container">
    <br />
    <h2 style="color: black">Music Info</h2>
    <fieldset class="text-center">
      <label for="id" style="color: black">아이디</label>
      <input
        type="id"
        id="id"
        v-model="music.id"
        class="form-control"
        readonly
        disabled
      /><br />
      <label for="title" style="color: black">제목</label>
      <input
        type="text"
        id="title"
        v-model="music.title"
        class="form-control"
      /><br />
      <label for="genre" style="color: black">장르</label>
      <input
        type="text"
        id="gerne"
        v-model="music.genre"
        class="form-control"
      /><br />
      <label for="artist" style="color: black">가수</label>
      <input
        type="text"
        id="artist"
        v-model="music.artist"
        class="form-control"
      /><br />
      <label for="date" style="color: black">발매일</label>
      <input
        type="text"
        id="date"
        v-model="music.date"
        class="form-control"
      /><br />
      <label for="runningTime" style="color: black">곡 시간</label>
      <input
        type="number"
        id="runningTime"
        v-model="music.runningTime"
        class="form-control"
      /><br />
      <button class="btn btn-primary" @click="updateMusic">수정</button>
      <button class="btn btn-danger" @click="deleteMusic">삭제</button>
    </fieldset>
  </div>
</template>
<script>
export default {
  name: "MusicDetailContainer",
  data() {
    return {
      music: {
        id: "",
        title: "",
        genre: "",
        artist: "",
        date: "",
        runningTime: 0,
      },
    };
  },
  methods: {
    updateMusic() {
      let musicList = JSON.parse(localStorage.getItem("musicList"));
      console.log(musicList);

      for (let i = 0; i < musicList.length; i++) {
        if (musicList[i].id === this.music.id) {
          this.$set(musicList, i, this.music);
          alert("수정 완료");
          break;
        }
      }
      localStorage.setItem("musicList", JSON.stringify(musicList));

      console.log(musicList);
      this.$router.push("/list");
    },
    deleteMusic() {
      let musicList = JSON.parse(localStorage.getItem("musicList"));
      console.log(this.music.id);
      console.log(this);

      for (let i = 0; i < musicList.length; i++) {
        if (musicList[i].id === this.music.id) {
          musicList.splice(i, 1);
          alert("삭제 완료");
          break;
        }
      }

      localStorage.setItem("musicList", JSON.stringify(musicList));
      this.$router.push("/list");
      console.log(musicList);
    },
  },
  created() {
    const pathName = new URL(document.location).pathname.split(":");
    const id = pathName[pathName.length - 1];
    let musicList = JSON.parse(localStorage.getItem("musicList"));
    if (musicList != null) {
      for (let i = 0; i < musicList.length; i++) {
        if (musicList[i].id === id) {
          this.music = musicList[i];
        }
      }
    }
  },
};
</script>
