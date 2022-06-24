<template>
  <div class="wrapper">
    <side-bar>
      <template slot="links" class="sidebarmenu">
        <sidebar-link
          to="/mychunggyul"
          name="My 청귤"
          description="마이청귤설명대충"
          icon="ti-user"
        />
        <sidebar-link
          to="/score"
          name="청귤 점수"
          description="마이청귤설명대충"
          icon="ti-dashboard"
        />
        <sidebar-link
          to="/planner"
          name="청귤 플래너"
          description="마이청귤설명대충"
          icon="ti-pie-chart"
        />
        <sidebar-link
          to="/policy"
          name="청귤 정책"
          description="마이청귤설명대충"
          icon="ti-calendar"
        />
        <sidebar-link
          to="/faq"
          name="FAQ"
          description="마이청귤설명대충"
          icon="ti-help-alt"
        />
        <sidebar-link
          to="/myfriend"
          name="내 친구 청귤"
          description="마이청귤설명대충"
          icon="ti-comments-smiley"
          hidden="hidden"
        />
        <sidebar-link
          to="/improvescore"
          name="청귤 점수 올리기"
          description="마이청귤설명대충"
          icon="ti-stats-up"
          hidden="hidden"
        />
        <sidebar-link
          to="/loanproducts"
          name="맞춤 대출 상품"
          description="마이청귤설명대충"
          icon="ti-wallet"
          hidden="hidden"
        />
        <!-- <sidebar-link to="/icons" name="Icons" icon="ti-pencil-alt2" />
        <sidebar-link to="/maps" name="Map" icon="ti-map" />
        <sidebar-link to="/notifications" name="Notifications" icon="ti-bell" /> -->
      </template>
      <!-- <mobile-menu>
        <li class="nav-item">
          <a class="nav-link">
            <i class="ti-panel"></i>
            <p>Stats</p>
          </a>
        </li>
        <drop-down
          class="nav-item"
          title="5 Notifications"
          title-classes="nav-link"
          icon="ti-bell"
        >
          <a class="dropdown-item">Notification 1</a>
          <a class="dropdown-item">Notification 2</a>
          <a class="dropdown-item">Notification 3</a>
          <a class="dropdown-item">Notification 4</a>
          <a class="dropdown-item">Another notification</a>
        </drop-down>
        <li class="nav-item">
          <a class="nav-link">
            <i class="ti-settings"></i>
            <p>Settings</p>
          </a>
        </li>
        <li class="divider"></li>
      </mobile-menu> -->
    </side-bar>
    <div class="main-panel">
      <top-navbar></top-navbar>

      <dashboard-content @click.native="toggleSidebar"> </dashboard-content>

      <content-footer></content-footer>
    </div>
  </div>
</template>
<style lang="scss"></style>
<script>
import TopNavbar from "./TopNavbar.vue";
import ContentFooter from "./ContentFooter.vue";
import DashboardContent from "./Content.vue";
import MobileMenu from "./MobileMenu";
export default {
  components: {
    TopNavbar,
    ContentFooter,
    DashboardContent,
    MobileMenu,
  },
  methods: {
    toggleSidebar() {
      if (this.$sidebar.showSidebar) {
        this.$sidebar.displaySidebar(false);
      }
    },
  },
};
</script>
