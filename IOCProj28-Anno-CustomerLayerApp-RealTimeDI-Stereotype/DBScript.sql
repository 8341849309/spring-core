
  CREATE TABLE "ROOT"."CUSTOMER" 
   (	"CUSTNO" NUMBER DEFAULT 1 NOT NULL ENABLE, 
	"CUSTNAME" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"CUSTADDRS" VARCHAR2(20 BYTE), 
	"BILLAMT" FLOAT(126)
   );


   CREATE SEQUENCE  "ROOT"."CUSTOMER_SEQUENCE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;

