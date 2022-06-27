<template>
  <div class="row">
    <div id="calendar" class="col-md-6 col-12">
      <v-calendar
        title-position="left"
        :columns="$screens({ lg: 1 }, 1)"
        :from-date="new Date()"
        :attributes="attributes"
        id="test"
        style="
          width: 100%;
          height: 550px;
          border: solid 1px rgba(146, 208, 80, 1);
        "
      />
    </div>
    <div id="toggles" class="col-md-6 col-12">
      <card>
        <div>
          <div style="display: flex; justify-content: space-between">
            <div>
              <div style="font-size: 25px; margin-bottom: 10px">
                1. 희망두배 청년통장<br />
              </div>
              신청 기간 : 2022/06/02 ~ 2022/06/24<br />
            </div>

            <button :class="{ active: toggle1 }" @click="doToggle1">
              상세보기
            </button>
          </div>
          <div class="box" :class="{ active: toggle1 }">
            🐷 저축 가능 금액 : 매월 10만원 또는 15 만원<br />
            📅 지원 기간 : 적립 개시일로부터 2년 또는 3년<br />
            📢 지원 대상 : 월 소득 255만원 이하 청년<br />
          </div>
        </div>
      </card>

      <card>
        <div>
          <div style="display: flex; justify-content: space-between">
            <div>
              <div style="font-size: 25px; margin-bottom: 10px">
                2. 청년 면접수당 <br />
              </div>
              신청 기간 : 2022/05/25 ~ 2022/06/27 <br />
            </div>

            <button :class="{ active: toggle2 }" @click="doToggle2">
              상세보기
            </button>
          </div>
          <div class="box" :class="{ active: toggle2 }">
            💰 지원 금액 : 최대 30 만원 (지역화폐 형태로 지급) <br />
            📜 신청 방법 : 청년 면접수당 홈페이지 https://thankyou.jobaba.net
            온라인 신청 <br />
            📢 신청 대상 : 만 18세 ~ 39세 이하 청년 면접자 <br />
            ❓ 문의 : 청년면접수당 상담콜센터(1877-2046)<br />
          </div>
        </div>
      </card>

      <card>
        <div>
          <div style="display: flex; justify-content: space-between">
            <div>
              <div style="font-size: 25px; margin-bottom: 10px">
                3. 청년 노동자 통장 <br />
              </div>

              신청 기간 : 2022/4/19 ~ 2022/5/2 <br />
            </div>

            <button :class="{ active: toggle3 }" @click="doToggle3">
              상세보기
            </button>
          </div>
          <div class="box" :class="{ active: toggle3 }">
            📢 지원 조건 : 만18세 ~ 34세, 중위소득 100% 이하 청년노동자 <br />
            ❓ 문의 : 청년 노동자 통장 콜센터, 경기도 콜센터 <br />
            📜 상세 내용 : <br />
            ---- 매달 10만 원씩 저축 <br />
            ---- 경기도에서 월 14만2000원씩 지원 <br />
          </div>
        </div>
      </card>

      <card>
        <div>
          <div style="display: flex; justify-content: space-between">
            <div>
              <div style="font-size: 25px; margin-bottom: 10px">
                4. 청년월세지원 <br />
              </div>

              신청 기간 : 2022/06/01 ~ 2023/06/30 <br />
            </div>

            <button :class="{ active: toggle4 }" @click="doToggle4">
              상세보기
            </button>
          </div>
          <div class="box" :class="{ active: toggle4 }">
            📢 지원 대상 : 부모와 떨어져 별도로 거주하는 만 19세에서 만
            34세까지의 무주택 청년 대상 <br />
            🏠 주택 : 보증금 5000만원 이하이면서 월세 60만원 이하 <br />
            📜 지원 조건: 중위소득 60%(1인가구 월 116만원) 이하, 자산기준은
            1억700만원 이하 <br />
            ---- 월 최대 20만원씩 최장 12개월에 걸쳐 분할 지급
          </div>
        </div>
      </card>
    </div>
  </div>
</template>
<script>
import VCalendar from "v-calendar/lib/components/calendar.umd";

export default {
  components: {
    VCalendar,
  },
  data() {
    const todos = [
      {
        description: "청년희망적금 신청 시작",
        isComplete: false,
        dates: [new Date(2022, 5, 15)],
        color: "red",
      },
      {
        description: "청년희망적금 신청 마감",
        isComplete: false,
        dates: [new Date(2022, 5, 22)],
        color: "blue",
      },
      {
        description: "청년 취업 지원금 신청 시작",
        isComplete: false,
        dates: [new Date(2022, 5, 22)],
        color: "red",
      },
      {
        description: "청년 취업 지원금 신청 마감",
        isComplete: false,
        dates: [new Date(2022, 5, 25)],
        color: "blue",
      },
      {
        description: "희망두배 청년통장 신청 시작",
        isComplete: false,
        dates: [new Date(2022, 5, 2)],
        color: "red",
      },
      {
        description: "희망두배 청년통장 신청 마감",
        isComplete: false,
        dates: [new Date(2022, 5, 24)],
        color: "blue",
      },
      {
        description: "청년 면접수당 신청 시작",
        isComplete: false,
        dates: [new Date(2022, 4, 25)],
        color: "red",
      },
      {
        description: "청년 면접수당 신청 마감",
        isComplete: false,
        dates: [new Date(2022, 5, 27)],
        color: "blue",
      },
      {
        description: "청년 노동자 통장 신청 시작",
        isComplete: false,
        dates: [new Date(2022, 3, 19)],
        color: "red",
      },
      {
        description: "청년 노동자 통장 신청 마감",
        isComplete: false,
        dates: [new Date(2022, 4, 2)],
        color: "blue",
      },
      {
        description: "청년월세지원 신청 시작",
        isComplete: false,
        dates: [new Date(2022, 5, 1)],
        color: "red",
      },
      {
        description: "청년월세지원 신청 마감",
        isComplete: false,
        dates: [new Date(2022, 5, 30)],
        color: "blue",
      },
    ];
    return {
      incId: todos.length,
      todos,
      attrs: [
        {
          highlight: {
            start: { fillMode: "outline" },
            base: { fillMode: "light" },
            end: { fillMode: "outline" },
          },
          dates: { start: new Date(2022, 5, 14), end: new Date(2022, 5, 18) },
        },
      ],
      toggle1: true,
      toggle2: true,
      toggle3: true,
      toggle4: true,
    };
  },
  computed: {
    attributes() {
      return [
        // Attributes for todos
        ...this.todos.map((todo) => ({
          dates: todo.dates,
          dot: {
            color: todo.color,
            class: todo.isComplete ? "opacity-75" : "",
          },
          popover: {
            label: todo.description,
            visibility: "focus",
          },
          customData: todo,
        })),
      ];
    },
  },
  methods: {
    doToggle1() {
      this.toggle1 = !this.toggle1;
    },
    doToggle2() {
      this.toggle2 = !this.toggle2;
    },
    doToggle3() {
      this.toggle3 = !this.toggle3;
    },
    doToggle4() {
      this.toggle4 = !this.toggle4;
    },
  },
};
</script>
<style>
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");

.vc-day-content[data-v-4420d078] {
  height: 28px;
  width: 28px;
  margin-top: 50px;
}
.vc-weeks[data-v-74ad501d] {
  padding-top: 20px;
}
.vc-weeks[data-v-74ad501d] {
  justify-content: none;
}
.vc-title[data-v-74ad501d] {
  font-size: 20px;
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
}

.box.active {
  display: none;
}

.box {
  margin-top: 10px;
}

#toggles button {
  border: none;
  width: 100px;
  height: 40px;
  border-radius: 5px;
  background-color: rgba(146, 208, 80, 0.3);
  margin: 10px 0 5px 10px;
}

#toggles button.active {
  background-color: rgba(146, 208, 80, 0.096);
}
</style>
