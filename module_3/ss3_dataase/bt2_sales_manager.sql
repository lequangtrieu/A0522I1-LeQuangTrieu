insert into customer
values 	(1 , "Minh Quan" , 11),
		(2 , "Ngoc Oanh" , 20),
		(3 , "Hong Ha" , 50);
        
insert into `order` (customer_id, order_date, order_total_amount)
values (1 , "2006-03-21", null),
	   (2 , "2006-03-23", null),
	   (1 , "2006-03-16", null);
       
insert into product (product_name,product_price)
values ("May giat" , 3),
		("Tu lanh" , 5),
		("Dieu hoa" , 7),
		("Quat" , 1),
		("Bep dien" , 2);
        
insert into order_details (order_id, product_id, order_qty)
values (1,1,3),
		(1,3,7),
		(1,4,2),
		(2,1,1),
		(3,1,8),
		(2,5,4),
		(2,3,3);

select order_id, order_date, order_total_amount
from `order`;

select customer_name , product_name
from customer
join `order`
using (customer_id)
join order_details
using (order_id)
join product
using (product_id);

select customer_name
from customer
left join `order`
using (customer_id)
where order_id is null;

select order_id , order_date , order_qty, product_price, order_qty * product_price as total_amount
from `order`
join order_details
using (order_id)
join product
using (product_id);