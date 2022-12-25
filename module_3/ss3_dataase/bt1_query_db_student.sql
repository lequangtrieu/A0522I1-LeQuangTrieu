select * 
from student
where  StudentName like 'h%';

select * 
from class
where MONTH(StartDate) = 12;

select *
from subject
where Credit >=3 AND Credit <=5;

select * from student;
Update student
set ClassID = 2
where StudentName = "Hung";
use quanlysinhvien;

select  student.StudentName, subject.SubName, mark.Mark
from (student inner join mark on mark.StudentId= student.StudentId)
inner join subject on mark.SubId = subject.SubId;
select * from mark;