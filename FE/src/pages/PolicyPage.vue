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
    <div class="col-md-6 col-12">
      <card
        style="
          height: 550px;
          box-shadow: none;
          border: solid 1px rgba(146, 208, 80, 1);
          background-color: rgba(146, 208, 80, 1);
        "
      >
        asd
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
};
</script>
<style>
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");

.vc-day-content[data-v-4420d078] {
  height: 20;
  width: 20;
  margin-top: 50px;
}
.vc-weeks[data-v-74ad501d] {
  padding-top: 30px;
}
.vc-weeks[data-v-74ad501d] {
  justify-content: none;
}
.vc-title[data-v-74ad501d] {
  font-size: 20px;
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
}
</style>
