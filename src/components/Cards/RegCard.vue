<template>
  <div class="regcard">
    <div class="regcard-img" v-if="$slots.image">
      <slot name="img"></slot>
    </div>
    <div class="regcard-header" v-if="$slots.header || title">
      <slot name="header">
        <img src="${img}" alt="" />
        <h4 class="regcard-title">{{ title }}</h4>
        <p class="regcard-category" v-if="subTitle">{{ subTitle }}</p>
      </slot>
    </div>
    <div class="regcard-body" v-if="$slots.default">
      <!-- <slot></slot> -->
    </div>
    <!-- <slot name="raw-content"></slot> -->
  </div>
</template>
<script>
export default {
  name: "regcard",
  props: {
    title: String,
    subTitle: String,
    img: String,
  },
};
</script>
<style></style>
