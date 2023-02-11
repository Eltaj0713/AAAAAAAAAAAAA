use fistdatabase;
CREATE TABLE products (
    id int auto_increment NOT NULL,
    name varchar(255) NOT NULL,
    price varchar(255),
    image varchar(200),
    currency varchar(255),
    PRIMARY KEY (id)
);