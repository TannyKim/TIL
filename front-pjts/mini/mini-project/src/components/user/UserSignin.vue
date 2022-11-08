<template>
  <div>
    <link href="@/css/signin.css" rel="stylesheet" />
    <main class="form-signin w-100 m-auto">
      <form>
        <img
          class="mb-4"
          src="@/assets/Spotify_logo.png"
          alt=""
          width="72"
          height="72"
        />
        <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
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
            type="submit"
            @click="regist"
          >
            Sign in
          </button>
        </div>
      </form>
    </main>
  </div>
</template>

<script>
export default {
  name: "UserSignin",
  data() {
    return {
      id: "",
      password: "",
    };
  },
  methods: {
    regist() {
      if (this.id === "" || this.password === "") {
        alert("모든 내용을 입력해주세요");
        return;
      }

      let user = {
        id: this.id,
        password: this.password,
      };

      const userList = localStorage.getItem("userList");

      let newUserList = [];
      if (userList) {
        newUserList = JSON.parse(userList);
      }
      newUserList.push(user);

      localStorage.setItem("userList", JSON.stringify(newUserList));
      alert("회원가입이 완료되었습니다.");
      this.$router.push("/login");
    },
  },

  computed: {
    getUser() {
      return localStorage.getItem("loginUser") ? true : false;
    },
  },
};
</script>

<style></style>
