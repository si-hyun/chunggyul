import { apiInstance } from "./index.js";

const api = apiInstance();

async function getLoans(success, fail) {
  await api.get(`/myScore/checkLoan/`).then(success).catch(fail);
}

export { getLoans };
