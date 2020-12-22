/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+10 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544  , 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear ${2019} 
 */

13/02/2019 
	emp                   dept
empno  ename  dname loc

select empno,ename ,job,dname ,loc 
 from emp,dept  where emp.deptno=dept.deptno;


select emp.empno,emp.ename ,emp.job,dept.dname ,dept.loc 
 from emp emp,dept dept  where emp.deptno=dept.deptno;


select e.empno,e.ename ,e.job,d.dname ,d.loc 
 from emp e,dept d  where e.deptno=d.deptno;
----------------------------------------------------------------------------

select empno,ename ,job,dname ,loc 
 from emp,dept  where emp.deptno=dept.deptno;

select empno,ename ,job,dname ,loc 
 from emp    inner join    dept   on  emp.deptno=dept.deptno;


 create table sis_emp as select * from emp;
 create table sis_emp as select empno,ename,deptno from emp;
 
 insert into sis_emp values(11,'ramesh',10);
 insert into sis_emp values(12,'gita',null);
 insert into sis_emp values(13,'rita',null);
  select * from sis_emp;
 
  drop drop sis_emp;
  
  
  select e.empno,e.ename,e.deptno,d.dname,d.loc
       from sis_emp e inner join dept d on  e.deptno=d.deptno;
  
  
  
  select e.empno,e.ename,e.deptno,d.dname,d.loc
       from sis_emp e left join dept d on  e.deptno=d.deptno;
  
 
 
 
  select e.ename,d.dname
       from sis_emp e inner join dept d on  e.deptno=d.deptno;
  
 
  select e.ename,d.dname
       from sis_emp e left join dept d on  e.deptno=d.deptno;
  
  select e.ename,nvl(d.dname,'none')
       from sis_emp e left join dept d on  e.deptno=d.deptno;
  
  
  select e.ename,nvl(d.dname,'________')
       from sis_emp e left join dept d on  e.deptno=d.deptno;
  
  
  
  select e.ename,d.dname
       from sis_emp e right join dept d on  e.deptno=d.deptno;
  
  
  
  select d.dname,nvl(e.ename,'-------------')
       from sis_emp e right join dept d on  e.deptno=d.deptno;
  
  
  
  select nvl(e.ename,'-------------'),nvl(d.dname,'-------------')
       from sis_emp e full join dept d on  e.deptno=d.deptno;
  
  
  
  
   select empno,ename,mgr from emp;
   
   
   select mgr from emp where mgr is not null;
   select distinct mgr from emp where mgr is not null;
   
   select empno,ename from emp 
   where empno in(select distinct mgr from emp where mgr is not null);
   
   
   create table sis_mgr as (
   select empno,ename from emp 
   where empno in(select distinct mgr from emp where mgr is not null)
   );
   
   
  select e.empno,e.ename,e.mgr,m.EMPNO,m.ename 
    from emp e inner join  sis_mgr m on   e.mgr=m.empno;
	
	
  select e.empno,e.ename ,m.ename 
    from emp e inner join  sis_mgr m on   e.mgr=m.empno;
	
	---------------------------------------------
	--self join  (same table )
	
	select e.empno,e.ename ,m.ename 
    from emp e inner join  emp m on   e.mgr=m.empno;
	