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

09/02/2019 

101  gagan           mca              c&adv java
											 	        Spring						
											 			Hibernate						

														
102  rita                 it                java &project 
											   	  Spring						
												  webservice
 												  andriod
---------------------------student----------------------------------------------
id  name         deptname        course_name														
														
														
101  gagan           mca              c&adv java
101  gagan           mca             Spring	
101  gagan           mca             Hibernate

102  rita                 it                java &project 
102  rita                 it               Spring 
102  rita                 it               webservice 
102  rita                 it               andriod     
-		-					CSE				  - 	  
											 	        					
											 					
drop table sis_category;
create table  sis_category(
 id number(10) constraint  sc_pk1 primary key,
 name varchar2(50) constraint  sc_unn1  unique not null,
 details varchar2(50) null 
 );
 
 create table  sis_category(
 id number(10) ,
 name varchar2(50)  constraint  sc_unn1  unique not null,
 details varchar2(50) null,
constraint   sc_pk1 primary key (id),
 );
 
 
insert into sis_category  values(101,'c1','details');
insert into sis_category  values(102,'c2','details');
insert into sis_category  values(103,'c3','details');
commit;
select * from  sis_category;

alter table sis_Category drop constraint sc_unn1;

drop table sis_product;
create table sis_product(
id number(10),
name varchar2(30),
price number(10,2),
c_id number(10) not null,
constraint sp_pk1 primary key (id),
constraint sp_fk1 foreign key (c_id)  references sis_Category(id)
);

insert into  sis_product (ID, NAME, PRICE, C_ID)values(1,'p1',400.44,101);
insert into  sis_product (ID, NAME, PRICE, C_ID)values(2,'p2',300.44,101);
insert into  sis_product (ID, NAME, PRICE, C_ID)values(3,'p3',200.44,101);
insert into  sis_product (ID, NAME, PRICE, C_ID)values(4,'p4',100.44,102);
insert into  sis_product (ID, NAME, PRICE, C_ID)values(5,'p5',30.44,102);

--ERROR insert into  sis_product (ID, NAME, PRICE, C_ID)values(6,'p6',130.44,10001);
--ERROR insert into  sis_product (ID, NAME, PRICE, C_ID)values(6,'p6',130.44,null);

 select * from sis_product;
 select * from sis_category;
 

 