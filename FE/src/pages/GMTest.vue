<template>
  <div style="display: flex">
    <card
      title="인적성 검사"
      sub-title="예상 소요시간 약 15분"
      style="width: 600px; margin: auto"
    >
      <div></div>
      <div
        class="questionnaire"
        v-for="(question, index) in questions"
        v-bind:key="question"
      >
        <p class="question">{{ index + 1 }}. {{ question }}</p>
        <div class="pickrange" style="color: gray">
          <span style="margin-left: 10px">매우 그렇다</span>
          <span style="margin-left: 50px">다소 그렇다</span>
          <span style="margin-left: 45px">그저 그렇다</span>
          <span style="margin-left: 35px">다소 그렇지 않다</span>
          <span style="margin-left: 20px">매우 그렇지 않다</span>
        </div>
        <div
          class="radiocontainer"
          style="margin-left: 40px; margin-bottom: 20px"
        >
          <input type="radio" id="one" value="1" />
          <input type="radio" id="two" value="2" />
          <input type="radio" id="three" value="3" />
          <input type="radio" id="four" value="4" />
          <input type="radio" id="five" value="5" />
        </div>
      </div>
      <div style="text-align: center">
        <button @click="goSetGM" class="xbutton" style="margin: auto">
          완료
        </button>
      </div>
    </card>
  </div>
</template>
<script>
import { mapState, mapActions } from "vuex";

export default {
  data() {
    return {
      questions: [
        "되도록 애매한 상황을 피하려고 한다.",
        "복잡한 문제를 푸는 것을 좋아한다.",
        "어떤 경우에도 법을 어겨서는 안된다.",
        "일을 하는 중간에 잘못된 방식인 것을 알았다면 새로운 방식을 바로 바꾸지 않고 조금 더 고민해보고 신중하게 바꾼다.",
        "평소에 긴장하거나 불안해하는 모습을 거의 보이지 않는다.",
      ],
    };
  },
  methods: {
    ...mapActions("customerStore", ["setGMScore"]),
    async goSetGM() {
      await this.setGMScore();
      this.$router.push({ path: "mychunggyul" });
    },
  },
  computed: {
    ...mapState("customerStore", ["customerInfo"]),
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

#one,
#two,
#three,
#four {
  margin-right: 100px;
}

.xbutton {
  border: none;
  width: 100px;
  height: 40px;
  background-color: rgba(146, 208, 80, 0.5);
  border-radius: 5px;
  font-size: 14px;
}

.xbutton:hover {
  background-color: rgba(146, 208, 80, 1);
}
</style>
