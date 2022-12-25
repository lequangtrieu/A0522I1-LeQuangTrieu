select * 
from subject
where Credit = (select max(Credit) from subject);

select * from subject
join mark on subject.SubId = mark.SubId
where mark.mark = (select MAX(mark.Mark)from mark);

select * from student;
select * from mark;
select student.StudentId, AVG(mark.Mark) as TB from student
join mark on student.StudentId = mark.StudentId
group by StudentId
order by TB desc;