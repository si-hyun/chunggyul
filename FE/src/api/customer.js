import { apiInstance } from "./index.js";

const api = apiInstance();

async function login(customer, success, fail) {
  await api
    .post(`/customer/login`, JSON.stringify(customer))
    .then(success)
    .catch(fail);
}

async function getMyChunggyulInfo(customer_id, success, fail) {
  await api.get(`/myGM/analysis/${customer_id}`).then(success).catch(fail);
}

async function getRecommendsUpScore(customer, success, fail) {
  await api
    .post(`/myScore/recommend/`, JSON.stringify(customer))
    .then(success)
    .catch(fail);
}

async function getGMScore(customer, success, fail) {
  await api
    .put(`/myScore/gmScore/`, JSON.stringify(customer))
    .then(success)
    .catch(fail);
}

export { login, getMyChunggyulInfo, getRecommendsUpScore, getGMScore };
