--nit student
 1.create table human(
 name varchar(20),
 age number(3),
 weight number(5,2),
 gender char(1),
 dob date);
 2.drop table tablename;
 3.describe tablename;
 4.desc tablename;
 5.insert into human(name ,age ,weight,gender ,dob )
 values('ramesh',22,60.0,'m','30-jan-2019');
 6.create table car(
 modelno varchar2(20),
color varchar2(20));

7.insert into car values('abc1','green');

8.insert into car(modelno ,color)values('abc','purple');

9.insert into car(modelno ,color)values(&modelno,&color);

10.insert into car(modelno ,color)values('&modelno','&color');
11.insert into car(modelno ,color)values('&m_car','&car_c');
12.create table car_backup as select * from car;

13.create table t1(
 c1 number(20),
c2 number(20),
c3 number(20));

14.alter table t1 add c4 varchar2(10);
15.alter table t1 drop column c2;
16. alter table t1 modify c1 varchar2(12);
17.alter table t1 modify c1 varchar2(20);
18.alter table t1 rename column c1 to c11;
19.create table car(
sno number(10),
 modelno varchar2(20),
color varchar2(20));
20.insert into car( sno,modelno ,color)values('1',abc','purple');