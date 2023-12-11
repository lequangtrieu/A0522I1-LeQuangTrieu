create database cs_jsp_servlet;
use cs_jsp_servlet;

create table customer (
customer_id int primary key auto_increment,
customer_name varchar(45),
customer_birthday date,
customer_gender bit(1),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45),
customer_type_id int
);

create table customer_type (
customer_type_id int primary key auto_increment,
customer_type_name varchar(45)
);

ALTER TABLE customer
ADD CONSTRAINT fk_customer_type
FOREIGN KEY (customer_type_id) 
REFERENCES customer_type(customer_type_id)
ON UPDATE CASCADE
ON DELETE CASCADE;


create table employee (
employee_id int primary key auto_increment,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,
education_degree_id int,
division_id int,
username varchar(255)
);

create table position (
position_id int primary key auto_increment,
position_name varchar(45)
);

ALTER TABLE employee
ADD CONSTRAINT fk_position
FOREIGN KEY (position_id) 
REFERENCES `position`(position_id)
ON UPDATE CASCADE
ON DELETE SET NULL;

create table education_degree (
education_degree_id int primary key auto_increment,
education_degree_name varchar(45)
);

ALTER TABLE employee
ADD CONSTRAINT fk_education_degree
FOREIGN KEY (education_degree_id) 
REFERENCES education_degree(education_degree_id)
ON UPDATE CASCADE
ON DELETE SET NULL;

create table division (
division_id int primary key auto_increment,
division_name varchar(45)
);


ALTER TABLE employee
ADD CONSTRAINT fk_division
FOREIGN KEY (division_id) 
REFERENCES division(division_id)
ON UPDATE CASCADE
ON DELETE SET NULL;


create table `user` (
username varchar(255) primary key,
password varchar(255) not null
);

ALTER TABLE employee
ADD CONSTRAINT fk_employee_user
FOREIGN KEY (username) 
REFERENCES `user`(username);

create table `role` (
role_id  int primary key auto_increment,
role_name varchar(45)
);

CREATE TABLE user_role (
    role_id INT,
    username VARCHAR(255),
    FOREIGN KEY (role_id) REFERENCES `role`(role_id) on delete cascade,
    FOREIGN KEY (username) REFERENCES `user`(username) on delete cascade
);

create table service (
service_id int primary key auto_increment,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors int,
service_type_id int,
rent_type_id int
);

create table service_type (
service_type_id int primary key auto_increment,
service_type_name varchar(45)
);

ALTER TABLE service
ADD CONSTRAINT fk_service_type
FOREIGN KEY (service_type_id) 
REFERENCES service_type(service_type_id)
ON UPDATE CASCADE
ON DELETE CASCADE;

create table rent_type (
rent_type_id int primary key auto_increment,
rent_type_name varchar(45),
rent_type_cost double
);


ALTER TABLE service
ADD CONSTRAINT fk_rent_type
FOREIGN KEY (rent_type_id) 
REFERENCES rent_type(rent_type_id)
ON UPDATE CASCADE
ON DELETE CASCADE;


create table contact (
contact_id int primary key auto_increment,
contact_start_date datetime,
contact_end_date datetime,
contact_deposit double,
contact_total_money double,
employee_id int,
customer_id int,
service_id int
);

ALTER TABLE contact
ADD CONSTRAINT fk_employee_id
FOREIGN KEY (employee_id) 
REFERENCES employee(employee_id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE contact
ADD CONSTRAINT fk_customer_id
FOREIGN KEY (customer_id) 
REFERENCES customer(customer_id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE contact
ADD CONSTRAINT fk_service_id
FOREIGN KEY (service_id) 
REFERENCES service(service_id)
ON UPDATE CASCADE
ON DELETE CASCADE;


create table contact_detail (
contact_detail_id int primary key auto_increment,
quantity int,
contact_id int,
attach_service_id int
);

create table attach_service (
attach_service_id int primary key auto_increment,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45)
);

ALTER TABLE contact_detail
ADD CONSTRAINT fk_attach_service
FOREIGN KEY (attach_service_id) 
REFERENCES attach_service(attach_service_id)
ON UPDATE CASCADE
ON DELETE CASCADE;

ALTER TABLE contact_detail
ADD CONSTRAINT fk_contact_id
FOREIGN KEY (contact_id) 
REFERENCES contact(contact_id)
ON UPDATE CASCADE
ON DELETE CASCADE;









