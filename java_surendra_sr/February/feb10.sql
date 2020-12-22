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

10/02/2019 

drop table child ;
drop table parent;

create table parent(
c1 number,
c2 varchar2(20)
);


create table child(
c4 number(10),
c5 varchar2(20),
c6 number(10)
);

alter table parent add constraints p_pk1 primary key(c1);
alter table parent add constraints p_uk1 unique (c2);
alter table parent add constraints p_nn1 check(c2 is not null);


alter table child add constraints c_primary primary key (c4);
alter table child add constraints c_fk1 foreign key (c6) references parent(c1);
alter table child add constraints c_nn1 check(c6 is not null);

alter table child enable constraints c_nn1 ;

 desc dba_constraints;

select 
 CONSTRAINT_NAME,
 CONSTRAINT_TYPE,
 TABLE_NAME from dba_constraints where TABLE_NAME='PARENT';


select 
 CONSTRAINT_NAME,
 CONSTRAINT_TYPE,
 TABLE_NAME from dba_constraints where TABLE_NAME='CHILD';

 
select 
 CONSTRAINT_NAME,
 CONSTRAINT_TYPE,
 TABLE_NAME from dba_constraints where TABLE_NAME='EMP';
 
 
 
 
 
 select deptno,dname,loc from dept;
 select empno,ename,job,sal,deptno,hiredate from emp;
 
 total leader
 
 select mgr from emp;
 select distinct( mgr) from emp where mgr is not null
 
 select * from emp 
 where empno in(select distinct( mgr) from emp where mgr is not null);
 
 select deptno from dept where loc='NEW YORK';
 
 
 select * from emp 
 where deptno = (select deptno from dept where loc='NEW YORK');
 
 
 
 select count(*) from emp group by deptno;
 
 select deptno,count(*) from emp group by deptno having count(*)>=5;
 select deptno from emp group by deptno having count(*)>=5;
 
 
 select dname from dept 
 where deptno in(
 select deptno from emp group by deptno having count(*)>=5
 );


select deptno from dept where dname='RESEARCH';


select ename from emp 
 where
 empno in(select distinct( mgr) from emp where mgr is not null)
 and
  deptno=(select deptno from dept where dname='RESEARCH')
 ;

 
 select deptno from dept where loc in('NEW YORK');

 select deptno from dept where loc in('NEW YORK','CHICAGO');
 
 
 ADAMS      CLERK
JAMES      CLERK
MILLER     CLERK


select dname from dept where deptno in ( select distinct(deptno) from emp where job='CLERK' );