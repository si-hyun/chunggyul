<template>
  <div style="display: flex">
    <!-- <div>
      <h3>청귤뱅크에서 손쉽게 신용점수를 올려보세요!</h3>
    </div> -->

    <card class="col-8" style="margin: auto">
      <div style="float: left; width: 30%; margin-right: 50px">
        <img
          src="./..\assets\img\improve.png"
          alt=""
          style="width: 100%; border-right: 100px"
        />
      </div>
      <div>
        <h4>
          {{ customerInfo.customer_name }}님, 청귤뱅크에서 측정하는 성실도를
          올릴 수 있어요😊
        </h4>
        <br />
        <div style="margin-right: 20px; margin-top: 13px">
          <p style="font-size: 17px">
            🥇
            {{ recommendScoreUpInfo.userBehavior1 }}
          </p>
          <p style="font-size: 17px">
            🥈 {{ recommendScoreUpInfo.userBehavior2 }}
          </p>
          <p style="font-size: 17px">
            🥉 {{ recommendScoreUpInfo.userBehavior3 }}
          </p>
        </div>
        <br />
        <p>요건 충족 후 재심사 요청시 자동 심사 후 점수 반영됩니다.</p>
      </div>
      <button @click="goAlert" class="reqbtn">반영 요청하기</button>
    </card>
  </div>
</template>
<script>
import { mapState } from "vuex";

export default {
  name: "ImproveScore",
  computed: {
    ...mapState("customerStore", ["customerInfo", "recommendScoreUpInfo"]),
  },
  methods: {
    goAlert() {
      alert("재심사 요청이 완료되었습니다.");
    },
  },
};
</script>
<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");
* {
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
}

.reqbtn {
  border: none;
  width: 200px;
  height: 50px;
  border-radius: 10px;
  font-size: 20px;
  margin: 40px 0 40px 40%;
}
</style>
