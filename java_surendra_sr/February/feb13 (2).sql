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

12/02/2019 

create table t1(c1 number ,c2 number);

insert into t1  values(1,111);
insert into t1  values(2,211);
insert into t1  values(3,311);
insert into t1  values(4,411);
insert into t1  values(5,511);
insert into t1  values(6,611);
insert into t1  values(7,711);
commit;
select * from t1;

insert into t1  values(8,888);
insert into t1  values(9,999);
delete from t1 where c1=1;
delete from t1 where c1=2;
update  t1 set  c2=44444  where c1=4;
update  t1 set  c2=44444  where c1=5;


rollback 



---------------------------------------


create table t1(c1 number ,c2 number);

truncate table t1;
insert into t1  values(1,111);
insert into t1  values(2,211);
insert into t1  values(3,311);
insert into t1  values(4,411);
insert into t1  values(5,511);
insert into t1  values(6,611);
insert into t1  values(7,711);
commit;
select * from t1;

insert into t1  values(8,888);
insert into t1  values(9,999); 
savepoint s1;
delete from t1 where c1=1;
delete from t1 where c1=2;
savepoint s2;

update  t1 set  c2=44444  where c1=4;
update  t1 set  c2=44444  where c1=5;
savepoint s3;
update  t1 set  c2=44444  where c1=6;






create table ball(sno number, color varchar2(30));

insert into ball (sno,color)values(
(select nvl( max(sno),0)+1 from ball),'red');

insert into ball (sno,color)values(
(select nvl( max(sno),0)+1 from ball),'blue');


insert into ball (sno,color)values(
(select nvl( max(sno),0)+1 from ball),'black');


--  create sequence ball_seq;
 -- select ball_seq.nextval from dual;
 -- select ball_seq.currval from dual;
-- drop sequence ball_seq;	
 create table ball(sno number, color varchar2(30));
 create sequence ball_seq;
 insert into ball (sno,color)values(ball_seq.nextval,'black');
 insert into ball (sno,color)values(ball_seq.nextval,'red');
 insert into ball (sno,color)values(ball_seq.nextval,'green');
 
 create sequence s1;
 create sequence s1 start with 1000;
 s1.nextval
 s1.currval
 drop sequence s1;
 rename s1 to s22;
 
 
 create user nit1 identified by root;
grant dba,resource to nit1;
connect  nit1/root
 
 revoke dba from nit1;
 revoke resource from nit1;
