<template>
  <div id="bg1">
    <div style="text-align: center">
      <div style="color: white; padding-top: 7%">
        <p
          style="
            width: 96%;
            font-size: 7vw;
            text-align: center;
            color: rgba(255, 255, 255, 0.3);
            position: absolute;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: normal;
            word-wrap: break-word;
            line-height: 100%;
          "
        >
          청년들의 금융비서
        </p>
        <p
          style="
            width: 50%;
            font-size: 1vw;
            text-align: center;
            color: rgba(255, 255, 255, 0.7);
            position: absolute;
            text-overflow: ellipsis;
            white-space: normal;
            word-wrap: break-word;
            line-height: 150%;
            margin: 20vh 0 0 23%;
          "
        >
          청귤은 청년들을 위한 금융 비서 시스템입니다. 어쩌고저쩌고 설명 대충
          여기에 적어두기. Lorem, ipsum dolor sit amet consectetur adipisicing
          elit. Unde quaerat excepturi, illo saepe laboriosam ipsa facilis nemo
          alias eos non culpa debitis! Architecto quos, minus officiis laborum
          atque provident magni?
        </p>
      </div>
      <br />
      <div>
        <button
          type="button"
          style="
            border: 1px solid transparent;
            color: white;
            background-color: rgba(0, 0, 0, 0.1);
            width: 350px;
            height: 60px;
            border-radius: 15px;
            font-size: 25px;
            box-shadow: 0 0 15px white;
            font-family: 'Roboto Flex', sans-serif;
            margin-top: 40vh;
          "
          class="test_obj"
        >
          시작하기
        </button>
      </div>
    </div>
  </div>
</template>

<script></script>

<style lang="scss" scoped>
@import url("https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap");
@import url("https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@100;200;300;400;500;600;700&display=swap");

* {
  font-family: "IBM Plex Sans KR", "Nanum Gothic", "Muli", "Helvetica", Arial,
    sans-serif;
}

#bg1 {
  background-image: linear-gradient(
      to top,
      rgba(0, 0, 0, 0.7),
      rgba(0, 0, 0, 0.7)
    ),
    url("@/assets/img/citrusbg2.jpg");
  width: 100%;
  height: 100vh;
  background-size: cover;
  background-position: center;
}
</style>
