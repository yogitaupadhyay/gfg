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
 
 
 sid   sname mobile1  mobile2 mobile3    c1 c2 c3 c3 c4
 
 s101  ramesh                                                         1001           MCA
                        1234567890          core & adv     
                        1234567891           spring
                        1234567892           hibername
						

 s102  gita                                                                     1002           IT
                        1234567894          core & adv     
                        1234567895           spring
                                                     webservices
                                                     android
												
						
-------------------------------------------------------------------------------						
						

 s101  ramesh   1234567890        core & adv 
                        1234567891           spring
                        1234567892           hibername
						
	 
						
						

 s101  ramesh   1234567890        core & adv     1001           MCA
 s101  ramesh   1234567890        spring             1001           MCA
 s101  ramesh   1234567890        hibername       1001           MCA
 
 s101  ramesh   1234567890        core & adv         1001           MCA
 s101  ramesh   1234567891        spring              1001           MCA
 s101  ramesh   1234567892        hibername          1001           MCA
 
 s101  ramesh   1234567890        core & adv                1001           MCA
 s101  ramesh   1234567891        spring                   1001           MCA
 s101  ramesh   1234567892        hibername				1001           MCA
 =-----------------record for gita
                             
                                                      
create table stu_dept (
id number(10) primary key,
name varchar2(50) not null
);
							 
create table student (
id number(10) primary key,
name varchar2(50) not null,
dept_id number(10),
    constraint  stu_fk1 foreign key(dept_id) references stu_dept(id)
);

drop table student;
create table student (
id number(10) ,
name varchar2(50) not null,
dept_id number(10),
    constraint  stu_pk1 primary key(id) ,
    constraint  stu_fk1 foreign key(dept_id) references stu_dept(id)
);


insert into  stu_dept values(11,'mca');													  
insert into  stu_dept values(12,'cse');													  
insert into  stu_dept values(13,'it');		
commit;

insert into  student values(1001,'ramesh',11);													  
insert into  student values(1002,'gita',11);													  
insert into  student values(1003,'gyan',12);													  
insert into  student values(1004,'nilam',12);	

												  
insert into  student values(1005,'Ganesh',120);													  
											  
delete from stu_dept where id=11;
													  
insert into  student values(1006,'gagan',null);													  
													  
alter table student drop constraint stu_fk1;


 