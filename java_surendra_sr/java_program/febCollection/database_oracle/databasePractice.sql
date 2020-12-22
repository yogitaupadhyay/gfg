create table stu_sub(
roll_no number (10) ,
sub_id  number(10) ,
 constraint sb_fk1 foreign key(roll_no) references student(id),
 constraint sb_fk2 foreign key(sub_id) references sub(sub_id)
);
create table course_sub(
course_id number (10) ,
sub_id  number(10) ,
 constraint sb_fk3 foreign key(course_id) references course(course_id),
 constraint sb_fk4 foreign key(sub_id) references sub(sub_id)
);
select mgr from emp where mgr is not null;