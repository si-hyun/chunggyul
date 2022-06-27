<template>
  <div id="bg1">
    <div style="text-align: center">
      <div style="color: white; padding-top: 7%">
        <p
          style="
            width: 96%;
            font-size: 7vw;
            text-align: center;
            font-weight: 500;
            color: rgba(255, 255, 255, 0.7);
            position: absolute;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: normal;
            word-wrap: break-word;
            line-height: 100%;
          "
        >
          청년 금융 대출을 위해
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
          청귤은 청년들을 위한 금융 비서 시스템입니다. <br />
          대안 신용평가 모델을 활용하여 청년 씬파일러를 위해<br />
          대출금리 완화 및 연계 서비스를 제공합니다.
        </p>
      </div>
      <br />
      <div>
        <a href="loginpage">
          <button class="startbtn" type="button">시작하기</button>
        </a>
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
    url("@/assets/img/citrusbg3.jpg");
  width: 100%;
  height: 100vh;
  background-size: cover;
  background-position: center;
}

.startbtn {
  border: 1px solid transparent;
  color: white;
  background-color: rgba(0, 0, 0, 0.1);
  width: 350px;
  height: 60px;
  border-radius: 15px;
  font-size: 25px;
  box-shadow: 0 0 15px white;
  font-family: "Roboto Flex", sans-serif;
  margin-top: 40vh;
  transition: transform 0.2s;
}

.startbtn:hover {
  background-color: rgba(255, 255, 255, 0.8);
  color: rgba(0, 0, 0, 1);
  -ms-transform: scale(1.5); /* IE 9 */
  -webkit-transform: scale(1.5); /* Safari 3-8 */
  transform: scale(1.1);
}
</style>
