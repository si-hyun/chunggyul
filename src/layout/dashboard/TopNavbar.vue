<template>
  <nav
    class="navbar navbar-expand-lg navbar-light"
    style="height: 115px; background-color: white"
  >
    <div style="width: 100%">
      <div style="float: left; margin-top: 10px">
        <a
          class="navbar-brand"
          href="dashboard"
          style="color: black; font-weight: 100"
        >
          {{ this.$route.name }}
        </a>
        <p style="padding-left: 15px; width: 500px">
          {{ this.$route.matched[1].meta.description }}
        </p>
      </div>
      <div style="float: right">
        <button
          class="login-btn"
          style="float: right; margin-top: 35%"
          v-on:click="goLoginPage()"
          v-if="customerInfo === null"
        >
          로그인
        </button>
        <div v-else>
          {{ customerInfo.customer_name }}님 환영합니다!
          <button>로그아웃</button>
        </div>
      </div>
    </div>
  </nav>
</template>
<script>
import DashboardLayout from "./DashboardLayout.vue";
import { mapState } from "vuex";

export default {
  components: {
    DashboardLayout,
  },
  data() {
    return {
      // pagename: currentRouteName(),
      description: "페이지 설명",
    };
  },
  computed: {
    ...mapState("customerStore", ["customerInfo"]),
  },
  methods: {
    goLoginPage() {
      console.log(this.$route.matched[1].meta.description);
      this.$router.push({ name: "login" });
    },
  },
};
</script>
<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Black+Han+Sans&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@700&display=swap");
.navbar .navbar-brand {
  font-size: 30px;
}
.login-btn {
  border: none;
  background-color: transparent;
  width: 70px;
  margin-right: 2pc;
  font-family: "IBM Plex Sans KR", sans-serif;
  font-weight: 200;
  color: gray;
}
.login-btn:hover {
  color: black;
}
</style>
