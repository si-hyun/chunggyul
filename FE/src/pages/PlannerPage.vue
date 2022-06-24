<template>
  <div>
    <div class="row">
      <div class="col-md-6 col-12">
        <chart-card
          title="적금 모으기 현황"
          :sub-title="userInfo.goalamount + `원`"
          :chart-data="preferencesChart.data"
          chart-type="Pie"
          style="height: 460px"
        >
          <span slot="footer">
            <i class="ti-timer"></i> Campaign set 2 days ago</span
          >
          <div slot="legend">
            <span
              class="dot"
              style="background-color: rgba(158, 221, 147, 1)"
            ></span>
            현재 저축액
            <span
              class="dot"
              style="background-color: rgba(232, 192, 106, 1)"
            ></span>
            저축 가능 금액
            <span
              class="dot"
              style="background-color: rgba(219, 137, 37, 1)"
            ></span>
            대출
          </div>
        </chart-card>
      </div>
      <div class="col-md-6 col-12">
        <card
          style="height: 460px"
          :title="userInfo.username + `님의 자산 현황`"
        >
          <form action="">
            <div style="margin: 20px"></div>
            <label for="goal" style="color: black; margin: 0 8px"
              >목표 저축액:</label
            >
            <span>
              <input
                id="goal"
                type="text"
                placeholder="10000000"
                style="width: 75%"
              />
            </span>
            <div style="margin: 20px"></div>
            <label for=" current" style="color: black; margin: 0 8px"
              >현재 저축액:</label
            >
            <span>
              <input
                id="current"
                type="text"
                placeholder="5000000"
                style="width: 75%"
              />
            </span>
            <div style="margin-top: 20px; text-align: center">
              <button
                style="
                  border: none;
                  background-color: rgba(146, 208, 80, 1);
                  border-radius: 3px;
                  color: white;
                "
              >
                적용
              </button>
            </div>
          </form>
        </card>
      </div>
    </div>
  </div>
</template>
<script>
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
<style>
.dot {
  height: 10px;
  width: 10px;
  border-radius: 50%;
  display: inline-block;
  margin-left: 10px;
}
</style>
