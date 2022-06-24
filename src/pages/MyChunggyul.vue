<template>
  <div>
    <!--카테고리별 소비금액-->
    <div class="row">
      <div class="col-md-6 col-xl-3" v-for="regs in regCards" :key="regs.title">
        <card>
          <div>
            <p style="font-size: 20px">
              <img :src="regs.img" alt="" style="height: 30px" />
              {{ regs.title }}
            </p>
            <p style="text-align: center; font-size: 30px">{{ regs.value }}</p>
          </div>
        </card>
      </div>
    </div>
    <!-- 소득입력 및 내친구 청귤이 버튼 -->
    <div style="display: block; margin-bottom: 20px; height: 60px; width: 100%">
      <div class="middleline">
        <p style="margin-top: 0px">월 고정 소득을 입력하세요</p>
        <form action="">
          <input
            type="text"
            placeholder="1000000"
            style="
              width: 95%;
              border: none;
              border-bottom: 1px solid orange;
              background-color: transparent;
              margin-right: 1%;
            "
          />
        </form>
      </div>
      <div class="middleline">
        <p style="margin-top: 0px">이번달 추가 소득을 입력하세요</p>
        <form action="">
          <input
            type="text"
            placeholder="1000000"
            style="
              width: 95%;
              border: none;
              border-bottom: 1px solid orange;
              background-color: transparent;
              margin-right: 1%;
            "
          />
        </form>
      </div>
      <div
        style="
          display: inline-block;
          width: 49.2%;
          float: right;
          margin-right: 10px;
        "
      >
        <a href="myfriend">
          <button class="xbutton">나와 비슷한 청귤이 보러가기</button>
        </a>
      </div>
    </div>
    <!--Charts-->
    <div class="row">
      <div class="col-6">
        <chart-card
          title="카드 소비 내역"
          sub-title="24 Hours performance"
          :chart-data="usersChart.data"
          :chart-options="usersChart.options"
        >
          <span slot="footer">
            <i class="ti-reload"></i> Updated 3 minutes ago
          </span>
          <div slot="legend">
            <span
              class="dot"
              style="background-color: rgba(158, 221, 147, 1)"
            ></span>
            카페
            <span
              class="dot"
              style="background-color: rgba(232, 192, 106, 1)"
            ></span>
            의료
            <span
              class="dot"
              style="background-color: rgba(219, 137, 37, 1)"
            ></span>
            쇼핑
          </div>
        </chart-card>
      </div>
      <div class="col-6">
        <chart-card
          title="Email Statistics"
          sub-title="Last campaign performance"
          :chart-data="preferencesChart.data"
          chart-type="Pie"
        >
          <span slot="footer">
            <i class="ti-timer"></i> Campaign set 2 days ago</span
          >
          <div slot="legend">
            <span
              class="dot"
              style="background-color: rgba(158, 221, 147, 1)"
            ></span>
            카페
            <span
              class="dot"
              style="background-color: rgba(232, 192, 106, 1)"
            ></span>
            의료
            <span
              class="dot"
              style="background-color: rgba(219, 137, 37, 1)"
            ></span>
            쇼핑
          </div>
        </chart-card>
      </div>

      <!-- <div class="col-md-6 col-12">
        <chart-card
          title="2015 Sales"
          sub-title="All products including Taxes"
          :chart-data="activityChart.data"
          :chart-options="activityChart.options"
        >
          <span slot="footer">
            <i class="ti-check"></i> Data information certified
          </span>
          <div slot="legend">
            <i class="fa fa-circle text-info"></i> Tesla Model S
            <i class="fa fa-circle text-warning"></i> BMW 5 Series
          </div>
        </chart-card>
      </div> -->
    </div>
  </div>
</template>
<script>
import { StatsCard, ChartCard, RegCard } from "@/components/index";
import Chartist from "chartist";
export default {
  components: {
    StatsCard,
    ChartCard,
    RegCard,
  },

  /**
   * Chart data used to render stats, charts. Should be replaced with server data
   */
  data() {
    return {
      regCards: [
        {
          title: "카페",
          value: "100,300" + "원",
          img: require(`./../assets/img/coffee.png`),
        },
        {
          title: "의료",
          value: "210,000" + "원",
          img: require(`./../assets/img/medicine.png`),
        },
        {
          title: "쇼핑",
          value: "16,211" + "원",
          img: require(`./../assets/img/shopping.png`),
        },
        {
          title: "계좌이체",
          value: "4" + "건",
          img: require(`./../assets/img/transfer.png`),
        },
      ],
      usersChart: {
        data: {
          labels: [
            "9:00AM",
            "12:00AM",
            "3:00PM",
            "6:00PM",
            "9:00PM",
            "12:00PM",
            "3:00AM",
            "6:00AM",
          ],
          series: [
            [287, 385, 490, 562, 594, 626, 698, 895, 952],
            [67, 152, 193, 240, 387, 435, 535, 642, 744],
            [23, 113, 67, 108, 190, 239, 307, 410, 410],
          ],
        },
        options: {
          low: 0,
          high: 1000,
          showArea: true,
          height: "245px",
          axisX: {
            showGrid: false,
          },
          lineSmooth: Chartist.Interpolation.simple({
            divisor: 3,
          }),
          showLine: true,
          showPoint: false,
        },
      },
      activityChart: {
        data: {
          labels: [
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "Mai",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec",
          ],
          series: [
            [542, 543, 520, 680, 653, 753, 326, 434, 568, 610, 756, 895],
            [230, 293, 380, 480, 503, 553, 600, 664, 698, 710, 736, 795],
          ],
        },
        options: {
          seriesBarDistance: 10,
          axisX: {
            showGrid: false,
          },
          height: "245px",
        },
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
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");

* {
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
}
.middleline {
  display: inline-block;
  width: 25%;
}
.xbutton {
  margin-left: 10px;
  width: 100%;
  height: 60px;
  border-radius: 7px;
  border: none;
  background-color: rgba(146, 208, 80, 0.5);
}
.xbutton:hover {
  background-color: rgba(146, 208, 80, 1);
}
.dot {
  height: 10px;
  width: 10px;
  border-radius: 50%;
  display: inline-block;
  margin-left: 10px;
}
</style>
