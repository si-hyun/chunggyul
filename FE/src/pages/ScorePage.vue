<template>
  <div>
    <!--Charts-->
    <div class="row">
      <div class="col-12">
        <card
          title="My 청귤 점수"
          style="
            width: 49%;
            height: 400px;
            float: left;
            background-color: rgba(146, 208, 80, 1);
          "
        >
          <div
            v-if="customerInfo.gm == 0"
            style="font-size: 40px; text-align: center; padding-top: 50px"
          >
            지금 청귤 점수를 확인해보세요!
            <br />
            <a href="gmtest">
              <button class="ybutton">청귤 점수 산정하기</button>
            </a>
          </div>
          <div
            v-else
            style="font-size: 80px; text-align: center; padding-top: 50px"
          >
            {{ customerInfo.gm }}점
            <p style="font-size: 20px; text-align: center">상위 24%</p>
          </div>
        </card>
        <card
          title="NICE"
          sub-title="상위 43%"
          style="width: 49%; height: 190px; float: right"
        >
          <p style="font-size: 40px; text-align: center">
            {{ customerInfo.nice }}점
          </p>
        </card>
        <card
          title="KCB"
          sub-title="상위 38%"
          style="width: 49%; height: 190px; float: right"
        >
          <p style="font-size: 40px; text-align: center">
            {{ customerInfo.kcb }}점
          </p>
        </card>
      </div>
    </div>
    <div class="row" style="display: flex">
      <a href="improvescore" style="width: 50%"
        ><button class="xbutton">My 청귤 점수 올리기</button></a
      >
      <a href="loanproducts" style="width: 50%">
        <button class="xbutton">대출 가능한 상품 확인하기</button>
      </a>
    </div>
  </div>
</template>
<script>
import { Card } from "@/components/index";
import { mapState } from "vuex";

export default {
  components: {
    Card,
  },
  data() {
    return {
      Cards: [
        {
          title: "myscore",
          subTitle: "나의 청귤 점수",
        },
      ],
    };
  },
  computed: {
    ...mapState("customerStore", ["customerInfo"]),
  },
  methods: {},
};
</script>
<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");

.xbutton {
  border: solid 3px rgb(225, 240, 168);
  border-radius: 10px;
  background-color: white;
  height: 80px;
  width: 100%;
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
  font-size: 20px;
  font-weight: 400;
}

.xbutton:hover {
  background-color: rgb(225, 240, 168);
}

.ybutton {
  margin-top: 50px;
  width: 300px;
  height: 100px;
  border: none;
  background-color: white;
  border-radius: 10px;
  font-size: 20px;
}

.ybutton:hover {
  background-color: rgb(230, 254, 213);
}
</style>
