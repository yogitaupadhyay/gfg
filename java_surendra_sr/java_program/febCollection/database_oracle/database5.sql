create  table party(
id number(10) primary key,
name varchar2(30) not null
);
create  table stu(
id number(10) primary key,
name varchar2(30) not null,
p_id number(10),
constraint fk foreign key (p_id) references party(id)
);
insert into party values(10,'pizza');
insert into party values(20,'coke');
insert into party values(30,'samosa');
insert into party values(40,'gulab jamun');
insert into party values(50,'maaza');

insert into stu values(101,'a',20);
insert into stu values(102,'b',30);
insert into stu values(103,'c',10);
insert into stu values(104,'d',20);
insert into stu values(105,'e',10);
insert into stu values(106,'f',null);
insert into stu values(107,'g',null);
--------------equijoin/inner join-----
select s.name, p.name from stu s,party p where s.p_id=p.id;
 
select ename ,sal,dname,loc 
from emp inner join dept
on emp.deptno=dept.deptno;
 
select s.name, p.name from stu s inner join party p ON s.p_id=p.id;
-------------left join-------------
select s.name, p.name 
from stu s left join party p ON s.p_id=p.id;

select s.name, nvl(p.name,'not selected') 
from stu s left join party p ON s.p_id=p.id;
-----------------right join-------------------------
 select  p.name,nvl(s.name,'no one')
 from stu s right join party p ON s.p_id=p.id;
 
----------full join---------------------------------
 select nvl(s.name,'no one') ,nvl(p.name,'not selected') 
 from stu s full join party p ON s.p_id=p.id; 
 
 select nvl(s.name,'-----') ,nvl(p.name,'------') 
 from stu s full join party p ON s.p_id=p.id;
 