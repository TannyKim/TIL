<template>
  <div>
    <body class="text-center">
      <main class="form-signin w-100 m-auto">
        <form>
          <img
            class="mb-4"
            src="@/assets/Spotify_logo.png"
            alt=""
            width="72"
            height="72"
          />
          <h1 class="h3 mb-3 fw-normal">Please Log in</h1>
          <div class="container" style="max-width: 20%">
            <div class="form-floating">
              <input
                type="text"
                class="form-control"
                id="floatingInput"
                placeholder="ID"
                v-model="id"
              />
              <label for="floatingInput">ID</label>
            </div>
            <div class="form-floating mb-3">
              <input
                type="password"
                class="form-control"
                id="floatingPassword"
                placeholder="Password"
                v-model="password"
              />
              <label for="floatingPassword">Password</label>
            </div>

            <button
              class="w-100 btn btn-lg btn-primary mb-3"
              @keyup.enter="login"
              @click="login"
            >
              Log in
            </button>
            <router-link :to="`/signin`"
              ><button class="w-100 btn btn-lg btn-primary mb-3">
                Sign in
              </button></router-link
            >
          </div>
        </form>
      </main>
    </body>
  </div>
</template>

<script type="module">
export default {
  name: "UserLogin",
  data() {
    return {
      id: "",
      password: "",
    };
  },
  methods: {
    login() {
      let userList = JSON.parse(localStorage.getItem("userList"));
      let found = false;
      for (let i = 0; i < userList.length; i++) {
        if (
          userList[i].id === this.id &&
          userList[i].password === this.password
        ) {
          found = true;
        }
      }

      if (found) {
        localStorage.setItem("loginUser", {
          id: this.id,
          password: this.password,
        });
        alert("로그인성공");
        this.$router.push("/");
      } else {
        alert("로그인실패");
      }
    },
    logout() {
      localStorage.removeItem("loginUser");
      this.$router.push("/");
    },
  },
};
</script>

<style>
.bd-placeholder-img {
  font-size: 1.125rem;
  text-anchor: middle;
  -webkit-user-select: none;
  -moz-user-select: none;
  user-select: none;
}

@media (min-width: 768px) {
  .bd-placeholder-img-lg {
    font-size: 3.5rem;
  }
}

.b-example-divider {
  height: 3rem;
  background-color: rgba(0, 0, 0, 0.1);
  border: solid rgba(0, 0, 0, 0.15);
  border-width: 1px 0;
  box-shadow: inset 0 0.5em 1.5em rgba(0, 0, 0, 0.1),
    inset 0 0.125em 0.5em rgba(0, 0, 0, 0.15);
}

.b-example-vr {
  flex-shrink: 0;
  width: 1.5rem;
  height: 100vh;
}

.bi {
  vertical-align: -0.125em;
  fill: currentColor;
}

.nav-scroller {
  position: relative;
  z-index: 2;
  height: 2.75rem;
  overflow-y: hidden;
}

.nav-scroller .nav {
  display: flex;
  flex-wrap: nowrap;
  padding-bottom: 1rem;
  margin-top: -1px;
  overflow-x: auto;
  text-align: center;
  white-space: nowrap;
  -webkit-overflow-scrolling: touch;
}
</style>
