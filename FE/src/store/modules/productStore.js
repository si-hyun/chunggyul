import { getLoans } from "@/api/product.js";

const productStore = {
  namespaced: true,
  state: {
    smallLoans: null,
    nonBankLoans: null,
    bankLoans: null,
  },
  mutations: {
    SET_SMALL_LOANS: (state, smallLoans) => {
      state.smallLoans = smallLoans;
    },
    SET_NON_BANK_LOANS: (state, nonBankLoans) => {
      state.nonBankLoans = nonBankLoans;
    },
    SET_BANK_LOANS: (state, bankLoans) => {
      state.bankLoans = bankLoans;
    },
  },
  actions: {
    async setLoans({ commit }) {
      await getLoans(
        (response) => {
          console.log(response);
          commit("SET_SMALL_LOANS", response.data.smallLoanList);
          commit("SET_NON_BANK_LOANS", response.data.nonBankLoanList);
          commit("SET_BANK_LOANS", response.data.bankLoanList);
        },
        (error) => {
          console.log(error);
        }
      );
    },
  },
};

export default productStore;
