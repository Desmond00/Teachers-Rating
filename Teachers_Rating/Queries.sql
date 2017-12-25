select * from STUDENTS_ROLLNUMBERS where roll_number = '100200300';

desc STUDENTS_ROLLNUMBERS;

drop table Admin;
create table Admin (id varchar2(10), department varchar2(10),password varchar2(10));

insert into Admin values('adminit','IT','12345');

select * from Admin where id = 'admincse' and department = 'CSE' and password = '12345' ;

delete from Admin where id = 'admin';

create table Central (discipline varchar2(10), teachers varchar2(30), years_taught varchar2(10));

drop table Central;

truncate table Central;

insert into Central values ('ECE', 'Sneha Ghosh', '1,2');

select * from Central;

CREATE INDEX discipline ON Central (discipline);

create table Final_Ratings (sName varchar2(30), sTeacher varchar2(30), q1 varchar2(10),q2 varchar2(10),q3 varchar2(10));

select * from Final_Ratings;

truncate table Final_Ratings;