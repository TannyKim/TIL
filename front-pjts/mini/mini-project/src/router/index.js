import Vue from "vue";
import VueRouter from "vue-router";
import HomeView from "@/views/HomeView.vue";
import MusicListView from "@/views/MusicListView.vue";
import MusicRegistView from "@/views/MusicRegistView.vue";
import MusicDetailView from "@/views/MusicDetailView.vue";
import UserLogin from "@/components/user/UserLogin.vue";
import UserSignin from "@/components/user/UserSignin.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: HomeView,
  },
  {
    path: "/list",
    name: "list",
    component: MusicListView,
  },
  {
    path: "/regist",
    name: "regist",
    component: MusicRegistView,
  },
  {
    path: "/detail:id",
    name: "detail",
    component: MusicDetailView,
  },
  {
    path: "/login",
    name: "login",
    component: UserLogin,
  },
  {
    path: "/signin",
    name: "signin",
    component: UserSignin,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
