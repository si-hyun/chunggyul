import DashboardLayout from "@/layout/dashboard/DashboardLayout.vue";
// GeneralViews
// import NotFound from "@/pages/NotFoundPage.vue";

// Admin pages
import Dashboard from "@/pages/Dashboard.vue";
import MyChunggyul from "@/pages/MyChunggyul.vue";
import MyFriend from "@/pages/MyFriend.vue";
import ScorePage from "@/pages/ScorePage.vue";
import ImproveScore from "@/pages/ImproveScore.vue";
import LoanProducts from "@/pages/LoanProducts.vue";
import PlannerPage from "@/pages/PlannerPage.vue";
import PolicyPage from "@/pages/PolicyPage.vue";
import FAQPage from "@/pages/FAQPage.vue";
import LoginPage from "@/pages/LoginPage.vue";
// import Icons from "@/pages/Icons.vue";
// import Maps from "@/pages/Maps.vue";
// import Typography from "@/pages/Typography.vue";
// import TableList from "@/pages/TableList.vue";

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
        meta: { description: "홈화면입니다" },
      },
      {
        path: "login",
        name: "login",
        component: LoginPage,
        meta: { description: "Login화면입니다" },
      },
      {
        path: "mychunggyul",
        name: "My 청귤",
        component: MyChunggyul,
        meta: { description: "마이청귤입니다" },
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
        component: ScorePage,
        meta: { description: "청귤점수입니다" },
      },
      {
        path: "improvescore",
        name: "청귤 점수 올리기",
        component: ImproveScore,
        meta: { description: "청귤 점수 올리기입니다" },
      },
      {
        path: "loanproducts",
        name: "대출 상품",
        component: LoanProducts,
        meta: { description: "대출 상품입니다" },
      },
      {
        path: "planner",
        name: "청귤 플래너",
        component: PlannerPage,
        meta: { description: "청귤 플래너입니다" },
      },
      {
        path: "policy",
        name: "청귤 정책",
        component: PolicyPage,
        meta: { description: "청귤 정책입니다" },
      },
      {
        path: "faq",
        name: "faq",
        component: FAQPage,
        meta: { description: "FAQ입니다" },
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
