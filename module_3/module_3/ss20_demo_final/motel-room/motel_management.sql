create database motel_management;
use motel_management;

create table payment_type (
id int not null primary key auto_increment,
`name` varchar(50)
);

create table motel (
id int not null primary key auto_increment,
`name` varchar(255),
phone_number varchar(50),
date_begin varchar(50),
note text,
id_payment int not null,
foreign key (id_payment) references payment_type(id) on delete cascade
);

insert into payment_type values (1, 'Theo Tháng'), (2, 'Theo Quý'),  (3, 'Theo Năm');

insert into motel values (1,'Lê Khánh', '0931104763', '2022-01-12', 'Có Điều Hòa','1'),
									   (2,'Phạm Thành', '0914563123', '2020-12-12', 'Có Giường','2'),
									   (3,'Nguyễn Vinh', '0765234123', '2019-01-09', 'Có Tủ','3');
                                       

select * from motel;

select * from payment_type;

select * from motel where id like "Bi Peo" or name like "Bi Peo" or phone_number like "Bi Peo";