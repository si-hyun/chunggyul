<template>
  <container class="bv-example-row mt-3">
    <h3>로그인</h3>
    <form class="text-left">
      <show variant="danger" v-if="isLoginError"
        >아이디 또는 비밀번호를 확인하세요.</show
      >
      <input
        id="customer_id"
        v-model="customer.customer_id"
        required
        placeholder="아이디 입력...."
        @keyup.enter="confirm"
      />

      <input
        type="password"
        id="customer_pw"
        v-model="customer.customer_pw"
        required
        placeholder="비밀번호 입력...."
        @keyup.enter="confirm"
      />

      <button type="button" variant="primary" class="m-1" @click="confirm">
        로그인
      </button>
    </form>
  </container>
</template>

<script>
import { mapState, mapActions } from "vuex";

export default {
  name: "LoginPage",
  data() {
    return {
      customer: {
        customer_id: null,
        customer_pw: null,
      },
    };
  },
  computed: {
    ...mapState("customerStore", ["isLogin", "isLoginError"]),
  },
  methods: {
    ...mapActions("customerStore", ["customerConfirm"]),
    async confirm() {
      await this.customerConfirm(this.customer);
      if (this.isLogin) {
        this.$router.push({ path: "score" });
      }
    },
  },
};
</script>
