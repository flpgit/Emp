DROP TABLE mem PURGE ;
CREATE TABLE mem(
mid VARCHAR2(50) ,
name VARCHAR2(50) ,
sex VARCHAR2(10) ,
edu VARCHAR2(50) ,
birthday DATE ,
salary NUMBER(8,2) ,
note CLOB ,
CONSTRAINT pk_mid PRIMARY KEY(mid)
) ;