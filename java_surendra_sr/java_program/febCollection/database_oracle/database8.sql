-------------tcl=transcation control language-----------
insert into t10 values(1,21);
insert into t10 values (2,22);
insert into t10 values(3,23);
insert into t10 values(4,24);
insert into t10 values(5,25);
insert into t10 values(6,26);
insert into t10 values(7,27);
commit;
----------changes+savepoint+rollback--------------------
insert into t10(8,28);
insert into t10(9,29);
savepoint s1;
delete from t10 where c1=1;
delete from t10 where c1=2;
savepoint s2;
update t10 set c2=4444 where c1=4;
savepoint s3;
update t10 set c2=4444 where c1=5;

rollback to s1;
rollback to s2;
rollback to s3;
insert into t10(8,28);
insert into t10(9,29);
savepoint s1;
delete from t10 where c1=1;
delete from t10 where c1=2;
savepoint s2;
update t10 set c2=4444 where c1=4;
savepoint s3;
update t10 set c2=4444 where c1=5;
rollback to s2;