<template>
  <div style="display: flex">
    <card class="col-3" style="text-align: center; margin: auto; height: 300px">
      <h3>로그인</h3>

      <form
        class="text-left"
        style="display: flex; flex-direction: column; width: 200px"
      >
        <show variant="danger" v-if="isLoginError"
          >아이디 또는 비밀번호를 확인하세요.</show
        >
        <div style="margin-left: 50%; margin-top: 20%">
          <input
            id="customer_id"
            v-model="customer.customer_id"
            required
            placeholder="아이디 입력...."
            @keyup.enter="confirm"
            style="border: none; border-bottom: solid 2px #92d050"
          />

          <input
            style="
              margin-top: 3px;
              border: none;
              border-bottom: solid 2px #92d050;
            "
            type="password"
            id="customer_pw"
            v-model="customer.customer_pw"
            required
            placeholder="비밀번호 입력...."
            @keyup.enter="confirm"
          />
          <button
            type="button"
            style="
              margin-top: 20px;
              margin-left: 50%;
              width: 80px;
              height: 40px;
              border: none;
              border-radius: 5px;
              background-color: #92d050;
            "
            @click="confirm"
          >
            로그인
          </button>
        </div>
      </form>
    </card>
  </div>
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
    ...mapActions("customerStore", [
      "customerConfirm",
      "setMyChunggyul",
      "setRecommendsUpScore",
    ]),
    ...mapActions("productStore", ["setLoans"]),
    async confirm() {
      await this.customerConfirm(this.customer);
      if (this.isLogin) {
        this.setMyChunggyul(this.customer.customer_id);
        this.setRecommendsUpScore(this.customer);
        this.setLoans();
        this.$router.push({ path: "mychunggyul" });
      }
    },
  },
};
</script>
<style></style>
