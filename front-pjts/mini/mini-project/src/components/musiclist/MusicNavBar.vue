<template>
  <nav class="navbar fixed-top navbar-expand-lg bg-dark navar-dark">
    <div class="container-fluid" style="margin: 5px 0px 5px 5px">
      <router-link to="/" class="nav-link"
        ><img
          src="@/assets/Apple_logo.png"
          alt="Logo"
          width="40"
          height="40"
          class="d-inline-block"
        /><strong style="margin: 10px 10px 10px 10px"
          ><font size="5px">SSAFY MUSIC</font></strong
        >
      </router-link>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarTogglerDemo02"
        aria-controls="navbarTogglerDemo02"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <router-link to="/list" class="nav-link" style="color: white"
              >Music List</router-link
            >
          </li>
          <li class="nav-item">
            <router-link to="/regist" class="nav-link" style="color: white"
              >Add Music</router-link
            >
          </li>
          <li class="nav-item">
            <router-link to="/login" class="nav-link" style="color: white"
              >Login</router-link
            >
          </li>
          <!-- <li class="nav-item">
            <a href="#" class="nav-link" v-if="getUser" @click="logout"
              >Logout</a
            >
          </li> -->
        </ul>
        <form class="d-flex" role="search">
          <input
            class="form-control me-2"
            type="search"
            placeholder="Search"
            aria-label="Search"
          />
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  name: "MusicNavBar",
  data() {
    return {
      imgSrc: "./img/Spotify_logo.png",
    };
  },
  method: {
    logout() {
      this.$emit("logout");
    },
  },
  computed: {
    getUser() {
      if (localStorage.getItem("loginUser")) {
        return true;
      } else {
        return false;
      }
    },
  },
};
</script>

<style></style>
