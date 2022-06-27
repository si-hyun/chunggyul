<template>
  <div>
    <card style="padding: 50px 0">
      <div class="row" style="justify-content: center">
        <div class="circle" style="margin-left: 0">INFP</div>
        <div class="circle">ESFP</div>
        <div class="selected">ENTJ</div>
      </div>
      <div style="text-align: center">
        <h1>OOO님은 ENTJ 유형이예요!</h1>
        <div>대충 설명 어쩌고</div>
      </div>
    </card>
  </div>
</template>
<script></script>
<style scoped>
.circle {
  width: 15vw;
  height: 15vw;
  background-color: gray;
  /* border-radius: 50%; */
  /* margin-left: 5vw; */
  text-align: center;
  line-height: 15vw;
  font-size: 100px;
  color: white;
  border: solid 1px black;
}
.selected {
  width: 15vw;
  height: 15vw;
  background-color: green;
  /* border-radius: 50%; */
  /* margin-left: 5vw; */
  text-align: center;
  line-height: 15vw;
  font-size: 100px;
  color: white;
  border: solid 1px black;
}
</style>
