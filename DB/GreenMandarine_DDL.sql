CREATE DATABASE green_mandarine character set utf8mb4 collate utf8mb4_cs_0900_ai_ci;
USE green_mandarine;

CREATE TABLE CUSTOMER(
	CUSTOMER_ID				VARCHAR(20),
    CUSTOMER_PW				VARCHAR(20),
    CUSTOMER_NAME			VARCHAR(20),
    BIRTH_DATE				DATE,
    AGE						INT,
    THIN_FILER_TYPE			VARCHAR(20),
    EMAIL					VARCHAR(45),
    PHONE					VARCHAR(20),
	GM_YN					VARCHAR(10),
    GM						INT,
    GM_TOP_RATE				INT,
    NICE					INT,
    NICE_TOP_RATE			INT,
    KCB						INT,
    KCB_TOP_RATE			INT
);

CREATE TABLE SMALL_LOAN(
	FILE_NAME				VARCHAR(100),
	CO_NAME					VARCHAR(100),
	PD_NAME					VARCHAR(100),
	MAX_LIMIT				INT,
	MIN_LIMIT				INT,
	MAX_RATE				VARCHAR(100),
	MIN_RATE				VARCHAR(100),
	MAX_PERIOD				INT,
	MIN_PERIOD				INT,
    METHOD					VARCHAR(100),
    KEY1					VARCHAR(100),
    KEY2					VARCHAR(100)
);

CREATE TABLE NON_BANK_LOAN(
	CO_NAME					VARCHAR(100),
    PD_NAME					VARCHAR(100),
    MIN_RATE				VARCHAR(100),
    MAX_RATE				VARCHAR(100)
);

CREATE TABLE BANK_LOAN(
	FILE_NAME				VARCHAR(100),
	CO_NAME					VARCHAR(100),
    PD_NAME					VARCHAR(100),
    MAX_RATE				VARCHAR(100),
    MIN_RATE				VARCHAR(100),
    KEY1					VARCHAR(100),
    KEY2					VARCHAR(100)
);

CREATE TABLE USER_BEHAVIOR(
	CUSTOMER_ID				VARCHAR(20),
    NB_U_TIME				FLOAT,
	COM_FEE_DLY_CNT			FLOAT,
    SNS_FRIEND_CNT			FLOAT,
	EMAIL_CHCK_RATIO		FLOAT,
    AVG_GRADE				FLOAT,
	M_SEARCH_CNT_AVG		FLOAT,
    SNS_UPLOAD_CNT			FLOAT,
    P_TEST_SCORE			FLOAT
);

CREATE TABLE TRANSACTION_LIST(
	TRANS_CODE				VARCHAR(20),
	CUSTOMER_ID				VARCHAR(20),
	T_CATEGORY				VARCHAR(20),
	PRODUCT_TYPE			VARCHAR(20),
	COST					INT,
	TRANS_BF_BALANCE		INT,
	TRANS_AF_BALANCE		INT,
	TRANS_DATE				DATE
);

CREATE TABLE PLAN(
	CUSTOMER_ID				VARCHAR(20),
    TARGET_MONEY			INT,
    CURRENT_SAVING			INT,
    POSSIBLE_SAVE			INT,
    LOAN_AMOUNT				INT,
    TARGET_PERIOD			INT
);

CREATE TABLE POLICY(
	POLICY_NO				VARCHAR(10),
	POLICY_NAME				VARCHAR(100),
	P_CATEGORY				VARCHAR(20),
	P_CONDITION				VARCHAR(100),
	DETAIL					VARCHAR(500),
	GM						INT,
	START_DATE				DATE,
	END_DATE				DATE
);

INSERT INTO CUSTOMER VALUES('chunggyul','1111','김청귤','1999-09-09',24,'Unemployeed','chunggyul@hackaton.com','010-1234-5678','N',NULL,17,854,34,883,29);
INSERT INTO USER_BEHAVIOR VALUES('chunggyul',1.6,0,421,0.8,4.1,792,153,81);
INSERT INTO USER_BEHAVIOR VALUES(1,3.5,3,133,0.3,2.8,436,38,84);
INSERT INTO USER_BEHAVIOR VALUES(2,2.1,1,639,0.91,3.8,889,214,79);
INSERT INTO USER_BEHAVIOR VALUES(3,5.7,2,225,0.18,3.2,190,333,61);
INSERT INTO USER_BEHAVIOR VALUES(4,2.8,0,280,0.65,3.6,684,109,88);
INSERT INTO USER_BEHAVIOR VALUES(5,10,4,500,0.28,3.4,555,139,25);
INSERT INTO USER_BEHAVIOR VALUES(6,0.7,0,893,0.9,3.9,741,390,71);
INSERT INTO USER_BEHAVIOR VALUES(7,8.2,2,79,0.44,2.9,829,89,48);
INSERT INTO USER_BEHAVIOR VALUES(8,3.2,1,170,0.7,3.5,215,10,94);
INSERT INTO USER_BEHAVIOR VALUES(9,14,2   ,130,0.26,3.1,492,500,45);
INSERT INTO TRANSACTION_LIST VALUES(1, 'chunggyul', '패션/미용', '옷', 170000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(2, 'chunggyul', '건강', '약국', 330000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(3, 'chunggyul', '교통', '택시', 120000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(4, 'chunggyul', '저금', '적금', 100000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(5, 'chunggyul', '식비', '카페', 100000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(6, 'chunggyul', '쇼핑', '쿠팡', 200000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(7, 'chunggyul', '문화생활', '영화', 13000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(8, 'chunggyul', '교육', '학원', 37000, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(9, 'chunggyul', '경조사', '축의금', 0, 0, 0, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(10, 'chunggyul', '기타', '이체', 300000, 0, 300000, '2022-06-23');
INSERT INTO TRANSACTION_LIST VALUES(11, 'chunggyul', '건강', '옷', 5500, 300000, 294500, '2022-06-25');
INSERT INTO TRANSACTION_LIST VALUES(12, 'chunggyul', '쇼핑', '옷', 18900, 294500, 275600, '2022-06-25');
INSERT INTO TRANSACTION_LIST VALUES(13, 'chunggyul', '패션/미용', '옷', 23400, 275600, 252200, '2022-06-25');

INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/1.png','카카오뱅크', '비상금대출', 300, 50, '14.47%', '4.05%', 12, 0, '만기일시상환', '5%', '10%');
INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/2.png','우리은행', '우리비상금대출', 300, 0, '12%', '5.875%', 12, 0, '자유상환, 만기일시상환', '6%', '9%');
INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/3.png','국민은행', 'KB새희망홀씨 긴급 생계자금', 500, 0, '6.3%', '5.3%', 60, 12, '원리금균등 분할상환, 원금균등 분할상환', '5.5%', '6.3%');
INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/4.png','농협은행', '올원 비상금대출', 250, 0, '6.16%', '5.16%', 36, 0, '원리금균등 분할상환', '5.3%', '6.16%');
INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/5.png','신한은행', '쏠편한 비상금대출', 200, 50, '5.5%', '5.2%', 12, 0, '만기일시상환', '5.2%', '5.5%');
INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/6.png','SC제일은행', 'SC제일 토스 소액대출', 10, 50, '9.5%', '6.5%', 3, 0, '만기자동상환', '7.5%', '8%');
INSERT INTO SMALL_LOAN VALUES('/assets/img/bank/7.png','한국캐피탈', '다이렉트z론', 1000, 100, '19.9%', '11.9%', 36, 12, '원금균등분할상환, 원리금균등분할상환', '11.9%', '15%');

INSERT INTO BANK_LOAN VALUES('/assets/img/bank/1.png','카카오뱅크', '일반신용대출', '11.95%', '5.53', '7.41%', '9.22%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/5.png','신한은행', '일반신용대출','8.79%', '4.35%', '5.36%', '7.66%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/2.png','우리은행', '일반신용대출','11.52%', '4.25%', '6.14%', '7.78%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/3.png','국민은행', '일반신용대출', '6.99%', '4.78%', '5.57%', '5.35%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/4.png','농협은행', '일반신용대출', '8.78%', '4.89%', '7.62%', '7.24%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/8.png','중소기업은행', '일반신용대출', '8.44%', '4.46%', '5.96%', '6.98%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/9.png','부산은행', '일반신용대출', '6.89%', '4.23%', '5.96%', '6.47%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/10.png','제주은행', '일반신용대출', '8.84%', '4.37%',' 5.18%', '8.30%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/11.png','수협은행', '일반신용대출', '10.53%', '4.43%', '7.14%',	'10.33%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/12.png','하나은행', '일반신용대출',  '12.78%', '4.33%', '7.07%',	'8.17%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/13.png','경남은행', '일반신용대출', '10.56%', '4.78%', '6.41%',	'9.44%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/14.png','대구은행', '일반신용대출', '8.87%', '4.75%', '6.37%', '6.65%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/15.jpeg','한국스탠다드차타드은행', '일반신용대출', '9.74%', '4.92%', '7.57%', '8.93%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/16.png','케이뱅크', '일반신용대출', '15%', '4.35%', '7.16%', '8.29%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/17.jpeg','토스뱅크', '일반신용대출', '10.12%', '4.36%', '8.01%', '8.84%');
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/18.png','광주은행', '일반신용대출', '15.7%', '5.13%', '8.51%', '10.33%' );
INSERT INTO BANK_LOAN VALUES('/assets/img/bank/19.png','전북은행', '일반신용대출', '10.98%', '7.08%', '9.96%',	'10.08%');

INSERT INTO NON_BANK_LOAN VALUES('엔에이치저축은행','일반신용대출','6.57%','11.80%');
INSERT INTO NON_BANK_LOAN VALUES('상상인저축은행','일반신용대출','8.24%','14.10%');
INSERT INTO NON_BANK_LOAN VALUES('하나카드㈜','일반신용대출','8.34%','10.43%');
INSERT INTO NON_BANK_LOAN VALUES('알씨아이파이낸셜서비스코리아㈜','일반신용대출','6.34%','14.78%');
INSERT INTO NON_BANK_LOAN VALUES('비씨카드㈜','일반신용대출','7.37%','17.90%');
INSERT INTO NON_BANK_LOAN VALUES('롯데오토리스㈜','일반신용대출','10.07%','11.90%');
INSERT INTO NON_BANK_LOAN VALUES('하나캐피탈㈜','일반신용대출','9.70%','11.97%');
INSERT INTO NON_BANK_LOAN VALUES('키움저축은행','일반신용대출','9.13%','10.95%');
INSERT INTO NON_BANK_LOAN VALUES('㈜우리카드','일반신용대출','7.08%','17.10%');
INSERT INTO NON_BANK_LOAN VALUES('비엔케이캐피탈㈜','일반신용대출','9.22%','14.58%');
INSERT INTO NON_BANK_LOAN VALUES('JT저축은행','일반신용대출','11.26%','13.47%');
INSERT INTO NON_BANK_LOAN VALUES('BNK저축은행','일반신용대출','11.27%','12.68%');
INSERT INTO NON_BANK_LOAN VALUES('폭스바겐파이낸셜서비스코리아㈜','일반신용대출','9.96%','13.11%');
INSERT INTO NON_BANK_LOAN VALUES('케이비캐피탈㈜','일반신용대출','9.52%','18.44%');
INSERT INTO NON_BANK_LOAN VALUES('㈜케이비국민카드','일반신용대출','9.34%','15.04%');
INSERT INTO NON_BANK_LOAN VALUES('롯데캐피탈㈜','일반신용대출','10.34%','14.57%');
INSERT INTO NON_BANK_LOAN VALUES('키움예스저축은행','일반신용대출','11.44%','14.35%');
INSERT INTO NON_BANK_LOAN VALUES('엔에이치농협캐피탈㈜','일반신용대출','8.41%','19.90%');
INSERT INTO NON_BANK_LOAN VALUES('한국투자저축은행','일반신용대출','10.89%','18.08%');
INSERT INTO NON_BANK_LOAN VALUES('다올저축은행','일반신용대출','14.27%','19.49%');
INSERT INTO NON_BANK_LOAN VALUES('신한저축은행','일반신용대출','8.40%','12.04%');
INSERT INTO NON_BANK_LOAN VALUES('삼성카드㈜','일반신용대출','13.83%','16.54%');
INSERT INTO NON_BANK_LOAN VALUES('신한카드㈜','일반신용대출','6.95%','9.84%');
INSERT INTO NON_BANK_LOAN VALUES('㈜애큐온캐피탈','일반신용대출','14.02%','17.78%');
INSERT INTO NON_BANK_LOAN VALUES('㈜디지비캐피탈','일반신용대출','10.68%','19.87%');
INSERT INTO NON_BANK_LOAN VALUES('애큐온저축은행','일반신용대출','12.85%','	13.82%');
INSERT INTO NON_BANK_LOAN VALUES('JT친애저축은행','일반신용대출','12.39%','15.70%');
INSERT INTO NON_BANK_LOAN VALUES('우리금융저축은행','일반신용대출','7.03%','16.06%');
INSERT INTO NON_BANK_LOAN VALUES('스마트저축은행','일반신용대출','14.00%','14.53%');
INSERT INTO NON_BANK_LOAN VALUES('한성저축은행','일반신용대출','13.29%','14.80%');
INSERT INTO NON_BANK_LOAN VALUES('롯데카드㈜','일반신용대출','9.41%','17.69%');
INSERT INTO NON_BANK_LOAN VALUES('IBK저축은행','일반신용대출','7.65%','16.04%');
INSERT INTO NON_BANK_LOAN VALUES('참저축은행','일반신용대출','14.08%','14.95%');
INSERT INTO NON_BANK_LOAN VALUES('페퍼저축은행','일반신용대출','9.40%','15.78%');
INSERT INTO NON_BANK_LOAN VALUES('HB저축은행','일반신용대출','13.27%','15.61%');
INSERT INTO NON_BANK_LOAN VALUES('예가람저축은행','일반신용대출','11.80%','16.48%');
INSERT INTO NON_BANK_LOAN VALUES('제이비우리캐피탈㈜','일반신용대출','11.60%','16.62%');
INSERT INTO NON_BANK_LOAN VALUES('고려저축은행','일반신용대출','13.82%','15.64%');
INSERT INTO NON_BANK_LOAN VALUES('하나저축은행','일반신용대출','10.85%','18.90%');
INSERT INTO NON_BANK_LOAN VALUES('웰컴저축은행','일반신용대출','8.35%','19.90%');
INSERT INTO NON_BANK_LOAN VALUES('한국캐피탈㈜','일반신용대출','13.76%','18.30%');
INSERT INTO NON_BANK_LOAN VALUES('현대캐피탈㈜','일반신용대출','12.13%','19.50%');
INSERT INTO NON_BANK_LOAN VALUES('OSB저축은행','일반신용대출','14.65%','16.08%');
INSERT INTO NON_BANK_LOAN VALUES('대신저축은행','일반신용대출','10.20%','16.43%');
INSERT INTO NON_BANK_LOAN VALUES('우리금융캐피탈㈜','일반신용대출','10.94%','18.30%');
INSERT INTO NON_BANK_LOAN VALUES('에이캐피탈㈜','일반신용대출','11.50%','18.12%');
INSERT INTO NON_BANK_LOAN VALUES('SBI저축은행','일반신용대출','12.21%','19.90%');
INSERT INTO NON_BANK_LOAN VALUES('동원제일저축은행','일반신용대출','13.65%','18.54%');
INSERT INTO NON_BANK_LOAN VALUES('OK저축은행','일반신용대출','14.94%','19.36%');
INSERT INTO NON_BANK_LOAN VALUES('세람저축은행','일반신용대출','13.40%','18.35%');
INSERT INTO NON_BANK_LOAN VALUES('모아저축은행','일반신용대출','17.92%','18.90%');
INSERT INTO NON_BANK_LOAN VALUES('청주저축은행','일반신용대출','15.84%','18.84%');
INSERT INTO NON_BANK_LOAN VALUES('진주저축은행','일반신용대출','16.53%','18.04%');
INSERT INTO NON_BANK_LOAN VALUES('오케이캐피탈㈜','일반신용대출','10.01%','	19.96%');
INSERT INTO NON_BANK_LOAN VALUES('웰컴캐피탈㈜','일반신용대출','19.11%','19.90%');
INSERT INTO NON_BANK_LOAN VALUES('메리츠캐피탈㈜','일반신용대출','13.50%','19.54%');
INSERT INTO NON_BANK_LOAN VALUES('스타저축은행','일반신용대출','14.11%','19.70%');
INSERT INTO NON_BANK_LOAN VALUES('상상인플러스저축은행','일반신용대출','9.99%','18.88%');
INSERT INTO NON_BANK_LOAN VALUES('삼호저축은행','일반신용대출','16.31%','19.68%');

select * from small_loan;
select * from bank_loan;
select * from non_bank_loan;




