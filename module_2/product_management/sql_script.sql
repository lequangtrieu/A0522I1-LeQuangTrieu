CREATE TABLE category (
    category_id INT IDENTITY(1,1) PRIMARY KEY,
    category_name NVARCHAR(255)
);

CREATE TABLE product (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name NVARCHAR(255),
    price NVARCHAR(255),
    dateRelease NVARCHAR(255),
    status NVARCHAR(50),
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES category(category_id)
);

INSERT INTO category (category_name)
VALUES ('Phone'),
       ('Laptop'),
       ('Watch');



INSERT INTO product (name, price, dateRelease, status, category_id)
VALUES ('Product A', '29', '2023-01-15', 'Active', 1);

INSERT INTO product (name, price, dateRelease, status, category_id)
VALUES ('Product B', '49', '2023-02-28', 'SOLD OUT', 2);

INSERT INTO product (name, price, dateRelease, status, category_id)
VALUES ('Product C', '39', '2023-03-10', 'Active', 3);
