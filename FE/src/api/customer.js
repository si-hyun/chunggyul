import { apiInstance } from "./index.js";

const api = apiInstance();

async function login(customer, success, fail) {
  await api
    .post(`/customer/login`, JSON.stringify(customer))
    .then(success)
    .catch(fail);
}

export { login };
