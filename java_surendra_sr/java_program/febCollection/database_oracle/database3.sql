------------data definition language(cdrcat)--------
================================================================
 1.create:create table tablename( c1 type,c2 type);
 2.drop:drop table tablename;
 3.truncate:truncate table tablename;
 4.alter:
 add=alter table tablename add colname type;
 drop=alter table tablename drop column cloname;
 modify=alter table tablename modify colname type;
 rename=alter table tablename column colname1 to colname2;
 6.rename:rename old_tablename to new_tablename;
------------------------data manupulation language(disum)--------=
================================================================
 1.delete:delete from tablename;
 2.insert:insert into tablename values(col1 type,col2 type...);
 3.select:select * from tablename;
 4.update:update tablename set col='something ' where='condition';
5.merge: