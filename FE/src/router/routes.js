import DashboardLayout from "@/layout/dashboard/DashboardLayout.vue";
// GeneralViews
// import NotFound from "@/pages/NotFoundPage.vue";

// Admin pages
import Dashboard from "@/pages/Dashboard.vue";
import MyChunggyul from "@/pages/MyChunggyul.vue";
import MyFriend from "@/pages/MyFriend.vue";
import ScorePage from "@/pages/ScorePage.vue";
import ImproveScore from "@/pages/ImproveScore.vue";
import GMTest from "@/pages/GMTest.vue";
import LoanProducts from "@/pages/LoanProducts.vue";
import PlannerPage from "@/pages/PlannerPage.vue";
import PolicyPage from "@/pages/PolicyPage.vue";
import FAQPage from "@/pages/FAQPage.vue";
import LoginPage from "@/pages/LoginPage.vue";
// import Icons from "@/pages/Icons.vue";
// import Maps from "@/pages/Maps.vue";
// import Typography from "@/pages/Typography.vue";
// import TableList from "@/pages/TableList.vue";

import store from "@/store/index.js";

const onlyAuthUser = async (to, from, next) => {
  const checkUserInfo = store.getters["customerStore/checkUserInfo"];
  console.log(checkUserInfo);
  if (checkUserInfo == null) {
    alert("서비스 사용을 위해 로그인 해주세요!");
    next({ name: "login" });
  } else {
    next();
  }
};

const routes = [
  {
    path: "/",
    component: DashboardLayout,
    redirect: "/dashboard",
    children: [
      {
        path: "/",
        name: "home",
        component: Dashboard,
        meta: { description: "" },
      },
      {
        path: "loginpage",
        name: "login",
        component: () => import("@/pages/LoginPage.vue"),
        meta: { description: "" },
      },
      {
        path: "mychunggyul",
        name: "My 청귤",
        beforeEnter: onlyAuthUser,
        component: MyChunggyul,
        meta: {
          description: "나의 소비패턴과 청귤점수 및 신용점수를 확인해보세요.",
        },
      },
      {
        path: "myfriend",
        name: "내 친구 청귤",
        component: MyFriend,
        meta: { description: "내 친구 청귤입니다" },
      },
      {
        path: "score",
        name: "청귤 점수",
        beforeEnter: onlyAuthUser,
        component: ScorePage,
        meta: {
          description: "",
        },
      },
      {
        path: "gmtest",
        name: "인적성 검사",
        component: GMTest,
        meta: { description: "청귤 점수 산정을 위한 인적성 검사입니다" },
      },
      {
        path: "improvescore",
        name: "청귤 점수 올리기",
        component: ImproveScore,
        meta: {
          description:
            "청귤이가 제안해주는 항목들을 보강하여 청귤점수를 올려보세요",
        },
      },
      {
        path: "loanproducts",
        name: "대출 상품",
        component: LoanProducts,
        meta: {
          description:
            "청귤점수를 반영하여 더 낮은 금리로 더 많은 대출 상품을 받아보세요",
        },
      },
      {
        path: "planner",
        name: "청귤 플래너",
        beforeEnter: onlyAuthUser,
        component: PlannerPage,
        meta: {
          description: "나의 대출을 한눈에 확인하고 상환 계획을 세워보세요",
        },
      },
      {
        path: "policy",
        name: "청귤 정책",
        beforeEnter: onlyAuthUser,
        component: PolicyPage,
        meta: {
          description:
            "청년들을 위한 정책과 혜택들을 모아 한눈에 확인할 수 있어요",
        },
      },
      {
        path: "faq",
        name: "faq",
        component: FAQPage,
        meta: { description: "자주 묻는 질문" },
      },

      // {
      //   path: "maps",
      //   name: "maps",
      //   component: Maps,
      // },
      // {
      //   path: "typography",
      //   name: "typography",
      //   component: Typography,
      // },
      // {
      //   path: "table-list",
      //   name: "table-list",
      //   component: TableList,
      // },
    ],
  },

  // { path: "*", component: NotFound },
];

/**
 * Asynchronously load view (Webpack Lazy loading compatible)
 * The specified component must be inside the Views folder
 * @param  {string} name  the filename (basename) of the view to load.
function view(name) {
  var res= require('../components/Dashboard/Views/' + name + '.vue');
  return res;
};**/

export default routes;
