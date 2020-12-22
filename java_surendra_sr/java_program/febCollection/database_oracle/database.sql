 create table student(id number(10),
 name varchar2(10),
 dob date,
 gender char(1),
 email varchar2(10),
 mobile varchar2(10));
 insert into student 
 values(1,'ramesh','12-feb-1998','m',
 'ramesh@gamil.com','7697526603');
 insert into student 
 values(2,'ramesh1','12-feb-1998','m',
 'ramesh@gamil.com','7697526603');
 insert into student 
 values(3,'ramesh2','12-feb-1998','m',
 'ramesh@gamil.com','7697526603');
 insert into student 
 values(4,'ramesh3','12-feb-1998','m',
 'ramesh@gamil.com','7697526603');
 insert into student values(1,'git%_a',
 '12-feb-1998','m','ramesh@gamil.com',
 '7697526603');
insert into student values(1,'gita',
'12-feb-1998','m','ramesh@gamil.com',
'7697526603');
select  * from student where email like '%a%'; 
--select * from student where lower(name) like lower('%\%%') escape '\';
--select  * from student where name like '%1%';
--select * from student where lower(name) like lower('%\_%') escape '\';
----------------validation--------------
sno=not null
email=unique
mobileno=unique
gender=m,f,o;
name=not null
3 ways to add constrains;
------------1-inline----------
  -->create table t1(
  c1 number  ,
  c2 number,
  c3 number
  );
 --> default values of all are nullable;
  create table t1(
  c1 number not null ,
  c2 number unique,
  c3 number not null unique
  );
  -->insert into t1 values(null, 111,112);//prlm
  -->insert into t1 values(110, 111,112);//successfully
  -->insert into t1 values(110, 111,112);//prlm
  ---------how to drop constrains--------
  drop table t1;
  create table t1(
  c1 number constraint t1nt1 not null ,
  c2 number constraint t1u1 unique,
  c3 number constraint t1nt2 not null unique
  );
   -->alter table t1 drop constraint t1nt1;
   -->create table t1(
  c1 number constraint t1nt1 not null ,
  c2 number,
  c3 number ,
  constraint t1nt2 not null unique(c3),
  constraint t1u1 unique(c2),
  );
  