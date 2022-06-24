CREATE DATABASE green_mandarine character set utf8mb4 collate utf8mb4_cs_0900_ai_ci;
use green_mandarine;

CREATE TABLE CUSTOMER(
	CUSTOMER_ID				VARCHAR(20),    
    CUSTOMER_PW				VARCHAR(20),
    CUSTOMER_NAME			VARCHAR(20),
    BIRTH_DATE				DATE,
    AGE						INT,
    THIN_FILER_TYPE			VARCHAR(20),
    EMAIL					VARCHAR(20),
    PHONE					VARCHAR(20),
	GM_YN					VARCHAR(10),
    GM						INT,
    NICE					INT,
    KCB						INT,
    
    PRIMARY KEY (CUSTOMER_ID)
);

insert into customer values('wnsdnjs','wnsdnjs','준원','1999-07-09',24,'대학생','wnsdnjs@gmail.com','010-1111-1111','Y',900,800,850);
insert into customer() values('tlgus','tlgus','시현','1998-01-31',26,'무소득자','tlgus@gmail.com','010-2222-2222','N',600,500,550);

CREATE TABLE CREDIT_LOAN(
	COMPANY_CODE			VARCHAR(100),
    COMPANY_NAME			VARCHAR(100),
    PRODUCT_CODE			VARCHAR(100),
    PRODUCT_NAME			VARCHAR(100),
    JOIN_WAY				VARCHAR(100),
    CB_NAME					VARCHAR(100),
    PRODUCT_TYPE			VARCHAR(100),
    LEND_RATE_TYPE			VARCHAR(100),
    GRADE_1					VARCHAR(100),
    GRADE_4					VARCHAR(100),
    GRADE_5					VARCHAR(100),
    GRADE_6					VARCHAR(100),
    GRADE_10				VARCHAR(100),
    GRADE_11				VARCHAR(100),
    GRADE_12				VARCHAR(100),
    GRADE_13				VARCHAR(100),
    GRADE_AVG				VARCHAR(100),
    
    PRIMARY KEY (COMPANY_CODE,PRODUCT_CODE)
);

CREATE TABLE USER_BEHAVIOR(
	CUSTOMER_ID				VARCHAR(20),
    NB_U_TIME				VARCHAR(20),
	COM_FEE_DLY_CNT			VARCHAR(20),
    SNS_FRIEND_CNT			VARCHAR(20),
	EMAIL_CHCK_RATIO		VARCHAR(20),
    AVG_GRADE				VARCHAR(20),
	M_SEARCH_CNT_AVG		VARCHAR(20),
    SNS_UPLOAD_CNT			VARCHAR(20),
    P_TEST_SCORE			VARCHAR(20),
    
    PRIMARY KEY (CUSTOMER_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
);

CREATE TABLE TRANSACTION_LIST(
	TRANS_CODE				VARCHAR(20),
	CUSTOMER_ID				VARCHAR(20),
	T_CATEGORY				VARCHAR(20),
	PRODUCT_TYPE			VARCHAR(20),
	COST					INT,
	TRANS_BF_BALANCE		INT,
	TRANS_AF_BALANCE		INT,
	TRANS_DATE				DATE,
    
    PRIMARY KEY (TRANS_CODE),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
);

CREATE TABLE PLAN(
	CUSTOMER_ID				VARCHAR(20),
    TRAVEL_YN				VARCHAR(10),
    HOUSE_YN				VARCHAR(10),
    TUITION_YN				VARCHAR(10),
    TRAVEL_COST				INT,
    HOUSE_COST				INT,
    TUITION_COST			INT,
    
    PRIMARY KEY (CUSTOMER_ID),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
);

CREATE TABLE POLICY(
	POLICY_NO				VARCHAR(10),
	POLICY_NAME				VARCHAR(100),
	P_CATEGORY				VARCHAR(20),
	P_CONDITION				VARCHAR(100),
	DETAIL					VARCHAR(500),
	GM						INT,
	START_DATE				DATE,
	END_DATE				DATE,
    
    PRIMARY KEY (POLICY_NO)
);



select * from CUSTOMER