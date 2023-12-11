INSERT INTO customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id)
VALUES ('John Doe', '1990-05-15', b'1', '123456789', '1234567890', 'john@example.com', '123 Main St', 1);

INSERT INTO customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id)
VALUES ('Alice Smith', '1985-09-20', b'0', '987654321', '0987654321', 'alice@example.com', '456 Elm St', 2);

INSERT INTO customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id)
VALUES ('Bob Johnson', '1978-12-10', b'1', '555555555', '0123456789', 'bob@example.com', '789 Oak St', 3);

INSERT INTO customer (customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address, customer_type_id)
VALUES
('Customer 1', '1990-01-01', b'1', '1234567890', '1234567890', 'customer1@email.com', 'Address 1', 1),
('Customer 2', '1991-02-02', b'0', '2345678901', '2345678901', 'customer2@email.com', 'Address 2', 2),
('Customer 3', '1992-03-03', b'1', '3456789012', '3456789012', 'customer3@email.com', 'Address 3', 1),
('Customer 4', '1993-04-04', b'0', '4567890123'employee, '4567890123', 'customer4@email.com', 'Address 4', 2),
('Customer 5', '1994-05-05', b'1', '5678901234', '5678901234', 'customer5@email.com', 'Address 5', 1),
('Customer 6', '1995-06-06', b'0', '6789012345', '6789012345', 'customer6@email.com', 'Address 6', 2),
('Customer 7', '1996-07-07', b'1', '7890123456', '7890123456', 'customer7@email.com', 'Address 7', 1),
('Customer 8', '1997-08-08', b'0', '8901234567', '8901234567', 'customer8@email.com', 'Address 8', 2),
('Customer 9', '1998-09-09', b'1', '9012345678', '9012345678', 'customer9@email.com', 'Address 9', 1),
('Customer 10', '1999-10-10', b'0', '0123456789', '0123456789', 'customer10@email.com', 'Address 10', 2);

INSERT INTO service (service_name, service_area, service_cost, service_max_people, standard_room, description_other_convenience, pool_area, number_of_floors, service_type_id, rent_type_id)
VALUES ('Luxury Suite', 500, 250.75, 4, 'Deluxe Suite', 'Private balcony', 50.5, 10, 1, 2);

INSERT INTO service (service_name, service_area, service_cost, service_max_people, standard_room, description_other_convenience, pool_area, number_of_floors, service_type_id, rent_type_id)
VALUES 
('Single Room', 200, 80.50, 1, 'Basic Single', 'Wi-Fi included', 25.0, 5, 1, 1),
('Double Room', 300, 120.75, 2, 'Double Suite', 'City view', 30.0, 6, 1, 2),
('Executive Suite', 450, 200.25, 3, 'Executive Suite', 'Meeting room available', 40.0, 7, 2, 2),
('Studio Apartment', 350, 150.00, 2, 'Studio Apartment', 'Kitchenette included', 35.0, 6, 2, 1),
('Penthouse', 600, 300.50, 6, 'Luxury Penthouse', 'Private rooftop access', 60.0, 12, 2, 2),
('Dormitory', 500, 90.25, 8, 'Shared Dormitory', 'Common lounge area', 0.0, 4, 3, 1),
('Villa', 700, 400.00, 10, 'Luxury Villa', 'Private garden and pool', 100.0, 15, 3, 2);

INSERT INTO employee (
    employee_name, employee_birthday, employee_id_card, employee_salary,
    employee_phone, employee_email, employee_address, position_id,
    education_degree_id, division_id, username
)
VALUES (
    'John Doe', '1990-05-15', 'ABC123456', 3500.50,
    '123-456-7890', 'john@example.com', '123 Main St, City, Country', 1,
    3, 2, 'johndoe123'
);

INSERT INTO employee (
    employee_name, employee_birthday, employee_id_card, employee_salary,
    employee_phone, employee_email, employee_address, position_id,
    education_degree_id, division_id, username
)
VALUES 
(
    'Alice Johnson', '1985-08-25', 'DEF789012', 4200.75,
    '111-222-3333', 'alice@example.com', '456 Park Ave, City, Country', 2,
    4, 1, 'alicejohnson'
),
(
    'Bob Smith', '1992-11-10', 'GHI345678', 3800.25,
    '444-555-6666', 'bob@example.com', '789 Elm St, City, Country', 3,
    2, 2, 'bobsmith'
),
(
    'Emily Davis', '1988-04-30', 'JKL901234', 4700.00,
    '777-888-9999', 'emily@example.com', '321 Oak Rd, City, Country', 1,
    3, 3, 'emilydavis'
),
(
    'Michael Brown', '1995-02-18', 'MNO567890', 3200.50,
    '999-000-1111', 'michael@example.com', '101 Pine St, City, Country', 4,
    1, 2, 'michaelbrown'
);

INSERT INTO attach_service (
    attach_service_name, attach_service_cost, attach_service_unit, attach_service_status
)
VALUES 
(
    'Laundry', 10.50, 1, 'Available'
),
(
    'Airport Shuttle', 25.00, 1, 'Available'
),
(
    'Room Service', 15.75, 1, 'Available'
),
(
    'Spa Treatment', 50.25, 1, 'Available'
);

INSERT INTO contact (
    contact_start_date, contact_end_date, contact_deposit, contact_total_money,
    employee_id, customer_id, service_id
)
VALUES 
(
    '2023-01-10 09:00:00', '2023-01-15 12:00:00', 150.00, 500.00,
    1, 1, 3
),
(
    '2023-02-05 14:30:00', '2023-02-10 10:00:00', 200.00, 800.00,
    2, 2, 2
),
(
    '2023-03-20 11:00:00', '2023-03-25 15:00:00', 100.00, 350.00,
    3, 3, 1
);

INSERT INTO contact_detail (
    quantity, contact_id, attach_service_id
)
VALUES 
(
    2, 1, 1
),
(
    1, 2, 2
),
(
    3, 3, 3
);

