create table  ball(
sno number(20),
color varchar(20)
);
create sequence ball_seq;
insert into ball values(ball_seq.nextval,'black');
insert into ball values(ball_seq.nextval,'green');
insert into ball values(ball_seq.nextval,'yellow');
insert into ball values(ball_seq.nextval,'purple');
insert into ball values(ball_seq.nextval,'orange');
insert into ball values(ball_seq.nextval,'maroon');
insert into ball values(ball_seq.nextval,
'gray');
