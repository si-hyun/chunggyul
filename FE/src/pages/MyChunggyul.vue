<template>
  <div>
    <!-- 상단 소비 카테고리 탑3 -->
    <div class="row">
      <!-- 1위 카테고리 -->
      <div class="col-md-6 col-xl-3">
        <card>
          <div>
            <div class="numdiv" style="position: relative">1</div>
            <div class="categoryname" style="position: absolute">
              <p style="font-size: 30px; font-weight: bold">
                {{ myChunggyulInfo.category1 }}💪
              </p>
            </div>
            <p
              style="
                text-align: center;
                font-size: 40px;
                position: absolute;
                right: 20px;
                top: 60px;
              "
            >
              {{ myChunggyulInfo.total_cost1.toLocaleString() }} 원
            </p>
          </div>
        </card>
      </div>
      <!-- 2위 카테고리 -->
      <div class="col-md-6 col-xl-3">
        <card>
          <div>
            <div class="numdiv" style="position: relative">2</div>
            <div class="categoryname" style="position: absolute">
              <p style="font-size: 30px; font-weight: bold">쇼핑 🛒</p>
            </div>
            <p
              style="
                text-align: center;
                font-size: 40px;
                position: absolute;
                right: 20px;
                top: 60px;
              "
            >
              223,600 원
            </p>
          </div>
        </card>
      </div>
      <!-- 3위 카테고리 -->
      <div class="col-md-6 col-xl-3">
        <card>
          <div>
            <div class="numdiv" style="position: relative">3</div>
            <div class="categoryname" style="position: absolute">
              <p style="font-size: 30px; font-weight: bold">패션/뷰티 💄</p>
            </div>
            <p
              style="
                text-align: center;
                font-size: 40px;
                position: absolute;
                right: 20px;
                top: 60px;
              "
            >
              175,500 원
            </p>
          </div>
        </card>
      </div>
      <!-- 계좌이체 -->
      <div class="col-md-6 col-xl-3">
        <card>
          <div>
            <div
              class="numdiv"
              style="position: relative; font-size: 120px; top: -38px"
            >
              <img
                src="./..\assets\img\transfer3.png"
                alt=""
                style="
                  top: 40px;
                  max-width: 110px;
                  position: absolute;
                  opacity: 0.5;
                "
              />
            </div>
            <div class="categoryname" style="position: absolute">
              <p style="font-size: 30px; font-weight: bold">계좌이체💸</p>
            </div>
            <p
              style="
                text-align: center;
                font-size: 40px;
                position: absolute;
                right: 20px;
                top: 60px;
              "
            >
              4 건
            </p>
          </div>
        </card>
      </div>
    </div>
    <!-- 청귤점수랑 파이차트 -->
    <div class="row">
      <div class="col-6">
        <!-- 청귤점수 -->
        <card style="height: 460px; background-color: #99d35c">
          <div
            v-if="customerInfo.gm == 0"
            style="
              width: 50%;
              height: 100%;
              float: left;
              border-right: solid 1px #f4f3ef;
              text-align: center;
              color: black;
            "
          >
            <div style="margin-top: 100px; font-size: 30px">
              지금 청귤 점수를<br />
              확인해보세요!
            </div>
            <a href="gmtest">
              <button class="xbutton" style="margin-top: 60px">
                청귤점수 확인
              </button>
            </a>
          </div>
          <div
            v-else
            style="
              width: 50%;
              height: 100%;
              float: left;
              border-right: solid 1px #f4f3ef;
              text-align: center;
              color: white;
            "
          >
            <br />
            <h3 style="margin-top: 60px; font-size: 40px; font-weight: 500">
              청귤점수
            </h3>
            <h1
              style="
                font-size: 100px;
                font-weight: 500;
                margin-top: 10px;
                margin-bottom: 30px;
              "
            >
              {{ customerInfo.gm }}
            </h1>
            <a href="improvescore"
              ><button class="xbutton">My 청귤 점수 올리기</button></a
            >
          </div>
          <!-- NICE & KCB -->
          <div style="width: 50%; float: right">
            <div style="height: 190px; float: top; margin-left: 20px">
              <h3>NICE</h3>
              <h1 style="text-align: center; font-weight: 500">
                {{ customerInfo.nice }}
              </h1>
            </div>
            <hr style="color: white; margin-top: 0px" />
            <div style="float: bottom; margin-left: 20px">
              <h3>KCB</h3>
              <h1 style="text-align: center; font-weight: 500">
                {{ customerInfo.kcb }}
              </h1>
            </div>
          </div>
        </card>
        <!-- <card title="My 청귤점수" style="height: 460px">
          <h3>{{ customerInfo.gm }}점</h3>
          <p>상위 24%</p>
        </card> -->
      </div>
      <!-- 파이차트 -->
      <div class="col-6">
        <chart-card
          title="소비 카테고리별 비율"
          sub-title="상위 3개 카테고리"
          :chart-data="preferencesChart.data"
          chart-type="Pie"
          style="height: 460px"
        >
          <span slot="footer">
            <i class="ti-timer"></i> 마지막 업데이트 2분 전</span
          >
          <div slot="legend">
            <span class="dot" style="background-color: #99d35c"></span>
            {{ myChunggyulInfo.category1 }}
            <span class="dot" style="background-color: #eacc60"></span>
            쇼핑
            <span class="dot" style="background-color: #eea71a"></span>
            패션/뷰티
          </div>
        </chart-card>
      </div>
    </div>
  </div>
</template>
<script>
import { StatsCard, ChartCard, RegCard } from "@/components/index";
import { mapState } from "vuex";
import Chartist from "chartist";

export default {
  components: {
    StatsCard,
    ChartCard,
  },

  /**
   * Chart data used to render stats, scharts. Should be replaced with server data
   */
  data() {
    return {
      preferencesChart: {
        data: {
          labels: ["45.67%", "30.44%", "23.89%"],
          series: [335500, 223600, 175500],
        },
        options: {},
      },
    };
  },
  computed: {
    ...mapState("customerStore", ["customerInfo", "myChunggyulInfo"]),
  },
};
</script>
<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");
@import url("https://fonts.googleapis.com/css2?family=Jua&display=swap");
@import url("https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap");
* {
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
}
.middleline {
  display: inline-block;
  width: 25%;
}
.xbutton {
  width: 50%;
  height: 60px;
  font-weight: 600;
  font-size: 16px;
  border-radius: 7px;
  border: none;
  background-color: rgba(255, 255, 255, 0.5);
  transition: transform 0.2s;
}
.xbutton:hover {
  background-color: rgb(255, 255, 255);
  -ms-transform: scale(1.5); /* IE 9 */
  -webkit-transform: scale(1.5); /* Safari 3-8 */
  transform: scale(1.1);
}
.dot {
  height: 10px;
  width: 10px;
  border-radius: 50%;
  display: inline-block;
  margin-left: 10px;
}

.numdiv {
  position: relative;
  font-size: 80px;
  font-weight: 600;
  font-style: italic;
  color: rgba(146, 208, 80, 0.5);
  width: 100px;
  height: 100px;
  top: -30px;
  left: 0px;
  font-family: "IBM Plex Sans KR";
}

.categoryname {
  position: absolute;
  width: 500px;
  height: 100px;
  left: 80px;
  top: 20px;
}
</style>
