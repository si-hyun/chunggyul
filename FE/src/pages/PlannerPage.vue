<template>
  <div>
    <div>
      <form action="">
        <div class="dropdown-label">⚡ 나의 대출상품</div>
        <div class="dropdown">
          <button class="dropbtn">
            <span class="dropbtn_content"
              >국민은행 KB새희망홀씨 긴급 생계자금</span
            >
            <span
              class="dropbtn_click"
              style="
                font-family: Material Icons;
                font-size: 16px;
                color: #3b3b3b;
                float: right;
              "
              onclick="dropdown()"
              >arrow_drop_down</span
            >
          </button>
          <div class="dropdown-content">
            <div class="myloan" onclick="showMenu(this.innerText)">
              국민은행 KB새희망홀씨 긴급 생계자금
            </div>
            <div class="myloan" onclick="showMenu(this.innerText)">
              카카오 비상금대출
            </div>
          </div>
        </div>
      </form>
    </div>
    <div style="height: 20px"></div>
    <div class="row">
      <div class="col-md-4 col-12">
        <chart-card
          title="국민은행 KB새희망홀씨 긴급 생계자금 상환 현황📊"
          :chart-data="preferencesChart.data"
          chart-type="Pie"
          style="height: 460px"
        >
          <span slot="footer">
            <i class="ti-timer"></i> 마지막 업데이트 2분 전</span
          >
          <div slot="legend">
            <span
              class="dot"
              style="background-color: rgba(158, 221, 147, 1)"
            ></span>
            상환 완료
            <span
              class="dot"
              style="background-color: rgba(232, 192, 106, 1)"
            ></span>
            잔액
            <span
              class="dot"
              style="background-color: rgba(219, 137, 37, 1)"
            ></span>
            이자
          </div>
        </chart-card>
      </div>
      <div class="col-md-4 col-4">
        <card
          style="height: 460px"
          :title="userInfo.username + `님의 대출 현황💰`"
        >
          <div
            class="insidetext"
            style="position: relative; margin-top: 20px; margin-left: 20px"
          >
            <p>대출 원금:</p>
            <p>대출 유형:</p>
            <p>금리:</p>
            <p>현재까지 상환액:</p>
            <p>남은 대출액:</p>
            <p>대출 총 기간:</p>
            <p>남은 상환 기간:</p>
            <p>다음 이자 납입 예정일:</p>
            <p>다음 이자 납입 예정 금액:</p>
          </div>
          <div
            class="insidetext2"
            style="position: absolute; margin-top: -306px; margin-left: 170px"
          >
            <p>6,000,000 원</p>
            <p>원리금 균등 분할 상환</p>
            <p>5.5 %</p>
            <p>1,000,000 원 (20 %)</p>
            <p>4,000,000 원 (80 %)</p>
            <p>12 개월</p>
            <p>10 개월</p>
            <p>2022년 7월 1일</p>
            <p>527,500 원 (원금 500,000원 + 이자 27,500원)</p>
          </div>
        </card>
      </div>
      <div class="col-md-4 col-4">
        <card
          style="height: 460px"
          :title="userInfo.username + `님의 대출 상환 TIP✨`"
        >
          <div style="margin-top: 40px; margin-left: 20px">
            <p>김청귤님은 🍕식비🥙에 가장 많은 지출이 있어요!</p>
            비슷한 유형의 소비자들에 비해 식비에 평균 🔔5.1% 더 많은 소비를
            해요.<br /><br /><br />

            <p>지난달 입금된 금액 대비 지출 금액이 컸어요...</p>
            다음달 이자와 원금 상환을 위해 소비를 조금 줄여보아요 😉
            <br /><br /><br />
          </div>
        </card>
      </div>
    </div>
  </div>
</template>
<script>
import Vue from "vue";
import { ChartCard } from "@/components/index";

export default {
  components: {
    ChartCard,
  },
  data() {
    return {
      userInfo: {
        username: "김청귤",
        type: "여행",
        goalamount: "5,000,000",
      },
      preferencesChart: {
        data: {
          labels: ["62%", "32%", "6%"],
          series: [62, 32, 6],
        },
        options: {},
      },
    };
  },
};
</script>
<style scoped>
@import url("https://fonts.googleapis.com/icon?family=Material+Icons");

.dropdown-label {
  font-size: 15px;
  margin: 10px;
  font-weight: bold;
  color: rgb(50, 50, 50);
}

.dropdown {
  position: relative;
  display: inline-block;
}
.dropbtn {
  display: block;
  border: 2px solid rgb(94, 94, 94);
  border-radius: 4px;
  background-color: #fcfcfc;
  font-weight: 400;
  color: rgb(124, 124, 124);
  padding: 12px;
  width: 300px;
  text-align: left;
  cursor: pointer;
  font-size: 12px;
  z-index: 1;
  position: relative;
}
.dropdown-content {
  display: none;
  font-weight: 400;
  background-color: #fcfcfc;
  min-width: 240px;
  border-radius: 8px;
  height: 160px;
  overflow: scroll;
  box-shadow: 0px 0px 10px 3px rgba(190, 190, 190, 0.6);
}
.dropdown-content::-webkit-scrollbar {
  width: 5px;
  height: 10px;
}
.dropdown-content::-webkit-scrollbar-thumb {
  border-radius: 2px;
  background-color: rgb(194, 194, 194);
}

.dropdown-content div {
  display: block;
  text-decoration: none;
  color: rgb(37, 37, 37);
  font-size: 12px;
  padding: 12px 20px;
}
.dropdown-content div:hover {
  background-color: rgb(226, 226, 226);
}

.dropdown-content.show {
  display: block;
}
.dot {
  height: 10px;
  width: 10px;
  border-radius: 50%;
  display: inline-block;
  margin-left: 10px;
}

.inputline {
  width: 20%;
  position: absolute;
  left: 110px;
  border: none;
  border-bottom: solid 1px rgba(146, 208, 80);
}

.insidetext p {
  font-size: 13px;
  font-weight: 500;
}

.insidetext2 p {
  font-size: 13px;
}
</style>
