select * from STUDENTS_ROLLNUMBERS where roll_number = '100200300';

desc STUDENTS_ROLLNUMBERS;

drop table Admin;
create table Admin (id varchar2(10), department varchar2(10),password varchar2(10));

insert into Admin values('adminit','IT','12345');

select * from Admin where id = 'admincse' and department = 'CSE' and password = '12345' ;

delete from Admin where id = 'admin';