<template>
  <div style="display: flex">
    <card title="대출 가능한 상품" style="width: 1000px; margin: auto">
      <div>
        <div class="loan-category">
          <span>대출 심사 활용 점수 선택</span>
          <form>
            <input
              type="checkbox"
              id="category1"
              name="category1"
              value="Category1"
              checked
              onclick="return false;"
            />
            <label for="category1" style="margin-left: 5px; margin-right: 20px"
              >NICE & KCB</label
            >
            <input
              type="checkbox"
              id="category2"
              name="category2"
              value="Category2"
              v-model="GMcheck"
              @click="toggleGMLoans()"
            />
            <label for="category2" style="margin-left: 5px; margin-right: 20px"
              >청귤점수</label
            >
          </form>
        </div>

        <div class="search-result" style="margin-top: 40px">
          <h5>검색결과 {{ GMdata.length }}건</h5>
          <hr />
          <!-- <div>(vfor써서 대출 가능한거 리스트 보여주기)</div> -->
          <div v-for="smloan in GMdata" :key="smloan.index">
            <div style="position: relative; margin-left: 20px">
              <div style="float: left">
                <div class="bank-logo">
                  <!-- <img
                src="./..\assets\img\transfer3.png"
                alt=""
                style="max-width: 80px"
              /> -->
                  <img
                    v-if="smloan.file_name == '/assets/img/bank/1.png'"
                    src="@/assets/img/bank/1.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/2.png'"
                    src="@/assets/img/bank/2.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/3.png'"
                    src="@/assets/img/bank/3.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/4.png'"
                    src="@/assets/img/bank/4.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/5.png'"
                    src="@/assets/img/bank/5.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/6.png'"
                    src="@/assets/img/bank/6.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/7.png'"
                    src="@/assets/img/bank/7.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/8.png'"
                    src="@/assets/img/bank/8.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/9.png'"
                    src="@/assets/img/bank/9.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/10.png'"
                    src="@/assets/img/bank/10.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/11.png'"
                    src="@/assets/img/bank/11.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/12.png'"
                    src="@/assets/img/bank/12.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/13.png'"
                    src="@/assets/img/bank/13.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/14.png'"
                    src="@/assets/img/bank/14.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/15.jpeg'"
                    src="@/assets/img/bank/15.jpeg"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/16.png'"
                    src="@/assets/img/bank/16.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/17.jpeg'"
                    src="@/assets/img/bank/17.jpeg"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/18.png'"
                    src="@/assets/img/bank/18.png"
                  />
                  <img
                    v-else-if="smloan.file_name == '/assets/img/bank/19.png'"
                    src="@/assets/img/bank/19.png"
                  />
                  <img v-else src="@/assets/img/chunggyul_logo4.png" />
                </div>
                <div style="position: absolute; top: 0; left: 60px">
                  <span>{{ smloan.co_name }}</span>
                  <div
                    style="
                      font-size: 20px;
                      font-weight: 1000;
                      margin-bottom: 20px;
                    "
                  >
                    {{ smloan.pd_name }}
                  </div>
                  <div v-if="GMcheck != 0" style="margin-top: 45px">
                    <p>나의 예측 금리</p>
                    <h2 style="margin-top: -15px; color: rgb(157, 213, 98)">
                      {{ smloan.key2 }}
                    </h2>
                  </div>
                </div>

                <div style="float: right">
                  <div>
                    <div style="margin-left: 400px; margin-top: -45px">
                      <p>최저금리</p>
                      <h2 style="margin-top: -15px">{{ smloan.min_rate }}</h2>
                    </div>
                    <div style="margin-left: 400px; margin-top: 30px">
                      <p>최고금리</p>
                      <h2 style="margin-top: -15px">{{ smloan.max_rate }}</h2>
                    </div>
                  </div>
                </div>
                <div style="position: absolute; right: 0%; margin-top: 18px">
                  <a href="">
                    <button
                      style="
                        width: 100px;
                        height: 40px;
                        border: solid 1px #9dd562;
                        border-radius: 5px;
                        margin-right: 10px;
                        background-color: white;
                      "
                    >
                      더 알아보기
                    </button>
                  </a>
                  <a href="">
                    <button
                      @click="goAlert"
                      style="
                        width: 100px;
                        height: 40px;
                        border: solid 1px #9dd562;
                        background-color: #9dd562;
                        border-radius: 5px;
                        margin-right: 4vw;
                      "
                    >
                      바로 신청하기
                    </button>
                  </a>
                </div>
              </div>
            </div>
            <div style="clear: both">
              <hr style="margin-top: 110px" />
            </div>
          </div>
        </div>
      </div>
    </card>
  </div>
</template>
<script>
import { mapState, mapActions } from "vuex";

export default {
  name: "LoanProducts",
  data() {
    return {
      GMcheck: [],
      GMdata: null,
    };
  },
  computed: {
    ...mapState("productStore", ["smallLoans", "nonBankLoans", "bankLoans"]),
    noGMdata() {
      return [...this.nonBankLoans, ...this.smallLoans];
    },
    yesGMdata() {
      let tmp = [...this.bankLoans, ...this.smallLoans];
      let result = tmp.sort((a, b) => parseFloat(a.key2) - parseFloat(b.key2));
      return result;
    },
  },
  methods: {
    async toggleGMLoans() {
      if (this.GMcheck == 0) {
        this.GMdata = this.yesGMdata;
      } else {
        this.GMdata = this.noGMdata;
      }
    },
    goAlert() {
      alert("대출 신청이 완료되었습니다!");
    },
  },
  created() {
    this.GMdata = [...this.nonBankLoans, ...this.smallLoans];
  },
};
</script>
<style scoped>
img {
  max-width: 45px;
  border-radius: 50%;
  background-color: white;
}
</style>
