select * from dept dept;
select dept.* from dept dept;
--------equijoin/innerjoin-------------
select d.deptno, e.empno,e.ename,d.loc 
from dept d,emp e 
where d.deptno=e.deptno;

select d.deptno,d.dname, e.empno,e.ename, e.job,d.loc 
from dept d,emp e 
where d.deptno=e.deptno;
---------------left join----------
select dept.deptno, dept.dname,emp.ename 
from emp left join dept 
on dept.deptno=emp.deptno;

---------------right join----------
 select dept.deptno, dept.dname,emp.ename 
 from emp right join dept 
 on emp.deptno=dept.deptno;

---------------full join----------
select dept.deptno, dept.dname,emp.ename 
 from emp full join dept 
 on emp.deptno=dept.deptno;
 
 
 create table manager as select * from emp;
 create table emp1 as select * from emp;
 
 select ename from emp;
select ename from manager where empno 
in ( select distinct mgr from manager where empno is not null);

create table m2 as select  * from manager where empno 
in ( select distinct mgr from manager where empno is not null);
------------------self join------------
   select e1.ename,e2.ename from emp e1,emp e2 where 