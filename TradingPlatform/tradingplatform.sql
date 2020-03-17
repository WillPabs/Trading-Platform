DROP SEQUENCE admin_id_seq;
DROP SEQUENCE broker_id_seq;
DROP SEQUENCE company_id_seq;
DROP SEQUENCE stock_id_seq;
DROP SEQUENCE shareholder_id_seq;
DROP SEQUENCE trade_id_seq;

DROP TABLE system_admin CASCADE CONSTRAINTS;
DROP TABLE stock CASCADE CONSTRAINTS;
DROP TABLE company CASCADE CONSTRAINTS;
DROP TABLE broker CASCADE CONSTRAINTS;
DROP TABLE shareholder CASCADE CONSTRAINTS;
DROP TABLE trade CASCADE CONSTRAINTS;
DROP TABLE shareholder_trade CASCADE CONSTRAINTS;

create sequence admin_id_gen
  start with 1
  increment by 1
  cache 10;
  
create sequence broker_id_gen
  start with 1
  increment by 1
  cache 10;

create sequence company_id_gen
  start with 1
  increment by 1
  cache 10;

create sequence admin_id_gen
  start with 1
  increment by 1
  cache 10;
  
create sequence stock_id_gen
  start with 1
  increment by 1
  cache 10;
  
create sequence shareholder_id_gen
  start with 1
  increment by 1
  cache 10;
  
create sequence trade_id_gen
  start with 1
  increment by 1
  cache 10;

create table system_admin(
  admin_id number(4) not null,
  first_name varchar2(35) not null,
  last_name varchar2(35) not null,
  constraint admin_pk primary key(admin_id)
);

create table stock(
  stock_id number(4) not null,
  ticker varchar2(10) not null,
  price number(20),
  constraint stock_pk primary key(stock_id),
  constraint ticker_uk unique(ticker)
);

create table company(
  company_id number(4) not null,
  company_name varchar2(35) not null,
  fk_stock_id number(4) not null,
  constraint company_pk primary key(company_id),
  constraint company_name_uk unique(company_name),
  constraint company_stock_fk foreign key(fk_stock_id) references
    stock(stock_id)
);

create table broker(
  broker_id number(4) not null,
  first_name varchar2(35) not null,
  last_name varchar2(35) not null,
  fk_company_id number(4) not null,
  constraint broker_pk primary key(broker_id),
  constraint broker_company_fk foreign key(fk_company_id) references
    company(company_id)
);

create table shareholder(
  shareholder_id number(4) not null,
  first_name varchar2(35) not null,
  last_name varchar2(35) not null,
  email varchar2(35) not null,
  sh_password varchar2(35) not null,
  sh_confirm_password varchar2(35) not null,
  ssn varchar2(35) not null,
  balance number(20,2),
  investing number(20,2),
  constraint shareholder_pk primary key(shareholder_id),
  constraint email_uk unique(email),
  constraint ssn_uk unique(ssn)
);

create table trade(
  trade_id number(4) not null,
  fk_shareholder_id number(4) not null,
  fk_broker_id number(4) not null,
  fk_stock_id number(4) not null,
  transaction_time date not null,
  price number(20) not null,
  quantity number(20) not null,
  constraint trade_pk primary key(trade_id),
  constraint trade_shareholder_fk foreign key(fk_shareholder_id) references 
    shareholder(shareholder_id),
  constraint trade_broker_fk foreign key(fk_broker_id) references
    broker(broker_id),
  constraint trade_stock_fk foreign key(fk_stock_id) references 
    stock(stock_id)
);

create table shareholder_trade (
  fk_shareholder_id number(4) not null,
  fk_trade_id number(4) not null,
  constraint sh_t_shareholder_id foreign key(fk_shareholder_id) references
    shareholder(shareholder_id),
  constraint sh_t_trade_id foreign key(fk_trade_id) references
    trade(trade_id)
);
















