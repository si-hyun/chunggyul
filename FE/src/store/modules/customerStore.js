import {
  login,
  getMyChunggyulInfo,
  getRecommendsUpScore,
  getGMScore,
} from "@/api/customer.js";

const customerStore = {
  namespaced: true,
  state: {
    isLogin: false,
    isLoginError: false,
    customerInfo: null,
    myChunggyulInfo: null,
    recommendScoreUpInfo: null,
  },
  getters: {
    checkUserInfo: function (state) {
      return state.customerInfo;
    },
  },
  mutations: {
    SET_IS_LOGIN: (state, isLogin) => {
      state.isLogin = isLogin;
    },
    SET_IS_LOGIN_ERROR: (state, isLoginError) => {
      state.isLoginError = isLoginError;
    },
    SET_CUSTOMER_INFO: (state, customerInfo) => {
      state.isLogin = true;
      state.customerInfo = customerInfo;
    },
    SET_MYCHUNGGYUL_INFO: (state, myChunggyulInfo) => {
      state.myChunggyulInfo = myChunggyulInfo;
    },
    SET_RECOMMENDSUPSCORE_INFO: (state, recommendScoreUpInfo) => {
      state.recommendScoreUpInfo = recommendScoreUpInfo;
    },
    SET_LOGOUT: (state) => {
      state.isLogin = false;
      state.customerInfo = null;
      state.myChunggyulInfo = null;
      state.recommendScoreUpInfo = null;
    },
  },
  actions: {
    async customerConfirm({ commit }, customer) {
      await login(
        customer,
        (response) => {
          if (response.data.message === "success") {
            commit("SET_IS_LOGIN", true);
            commit("SET_IS_LOGIN_ERROR", false);
            commit("SET_CUSTOMER_INFO", response.data.customerInfo);
          } else {
            commit("SET_IS_LOGIN", false);
            commit("SET_IS_LOGIN_ERROR", true);
            console.log("유저 정보 없음!!");
          }
        },
        (error) => {
          console.log(error);
        }
      );
    },
    async setMyChunggyul({ commit }, customer_id) {
      await getMyChunggyulInfo(
        customer_id,
        (response) => {
          commit("SET_MYCHUNGGYUL_INFO", response.data);
        },
        (error) => {
          console.log(error);
        }
      );
    },
    async setRecommendsUpScore({ commit }, customer) {
      await getRecommendsUpScore(
        customer,
        (response) => {
          commit("SET_RECOMMENDSUPSCORE_INFO", response.data);
        },
        (error) => {
          console.log(error);
        }
      );
    },
    async setGMScore({ state, commit }) {
      await getGMScore(
        state.customerInfo,
        (response) => {
          console.log("Here is setGM");
          console.log(response.data.customerInfo);
          commit("SET_CUSTOMER_INFO", response.data.customerInfo);
        },
        (error) => {
          console.log(error);
        }
      );
    },
  },
};

export default customerStore;
