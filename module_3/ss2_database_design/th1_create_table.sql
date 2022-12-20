create database exam_point_management;
use exam_point_management;
create table student (
student_id int not null primary key,
student_name varchar(50) null,
student_birthday datetime null,
student_grade varchar(20) null,
student_gender varchar(20) null
);

create table `subject` (
subject_id int not null primary key,
subject_name varchar(255) null
);

create table scoreboard (
student_id int,
subject_id int,
examscore int,
examday datetime,
primary key (student_id, subject_id),
foreign key (student_id) references student(student_id),
foreign key (subject_id) references `subject`(subject_id)
);

create table teacher (
teacher_id int not null primary key,
teacher_name varchar(255) null,
phone_number varchar(255) null
);

alter table `subject` add teacher_id int;
alter table `subject` add constraint FK_teacher_id foreign key (teacher_id) references teacher(teacher_id);

