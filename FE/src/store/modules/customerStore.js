import { login } from "@/api/customer.js";

const customerStore = {
  namespaced: true,
  state: {
    isLogin: false,
    isLoginError: false,
    customerInfo: null,
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
  },
};

export default customerStore;
