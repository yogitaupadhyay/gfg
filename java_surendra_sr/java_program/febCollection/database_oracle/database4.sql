sorting -order by
select ename ,job,sal,dept from emp;
select ename ,job,sal,dept from emp order by deptno asc;
select ename ,job,sal,dept from emp order by deptno desc;
select ename ,job,sal,dept from emp order by deptno ;//asc
select ename ,job,sal,dept from emp order by ename asc;
select ename ,deptno,sal from emp;
select ename ,deptno,sal from emp order by deptno;
select ename ,deptno,sal from emp order by deptno,ename;
select ename ,deptno,sal from emp order by deptno desc,ename asc;
-----group by--having--agregate function----------------------------
select job,count(*) from emp group by job;
SQL> select job,count(job) from emp group by job;
SQL> select deptno,count(ename) from emp group by deptno;
SQL> select job, sum(sal),count(job) from emp group by job;
SQL> select job, sum(sal),count(job),min(sal),max(sal) from emp group by job;
SQL> select job, sum(sal),count(job) from emp group by job having sum(sal)>5000;
--------------------------nvl-------------------------------
SQL> select ename ,sal+nvl(comm,0) as netsal from emp;
SQL> select ename ,sal+comm as netsal from emp;
-----------------------automatic no-----------------------
select max(id)+1 from sabdkosh;
select nvl(max(id),0)+1 from sabdkosh;

create table sabdkosh(id number(10),word varchar2(2));
insert into  sabdkosh values (1,'happy');
insert into  sabdkosh values (2,'apple');
insert into  sabdkosh values (3,'boy');
insert into  sabdkosh values (4,'cat');
insert into  sabdkosh values (5,'dog');
insert into  sabdkosh values ((select nvl(max(id),0)+1 from sabdkosh),'dog');
insert into  sabdkosh values ((select nvl(max(id),1000)+1 from sabdkosh),'dog');
null+value=null;
------------------------search----------------------------
----exact search 
select * from emp where ename='SCOTT';
----ignorecase search 
select * from emp where LOWER(ename)=LOWER('SCOTT');
select * from emp where upper(ename)=upper('SCOTT');
select * from emp where upper(ename)=upper(&emp);
-----contains--like
select * from emp where ename like 'A%';
select * from emp where ename like '%A%';
select * from emp where ename like '%s';
select * from emp where lower(ename) like lower('%s');
select * from emp where upper(ename) like upper('%s');
select * from emp where upper(ename) like upper('%&s');
select * from emp where lower(ename) like lower('%&a%');
select * from emp where lower(ename) like lower('%k%e%');
select * from emp where lower(ename) like lower('_a%');
select * from emp where lower(ename) like lower('%a___');













