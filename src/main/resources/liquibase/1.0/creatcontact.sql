use fistdatabase;
create table contact
(
    id    int auto_increment,
    full_name varchar (50),
    email  varchar(40),
    message  varchar(40),
    phone_number varchar(60),
        primary key (id)
);
# use fistdatabase;
# create table contact
# (
#     id    int auto_increment,
#     fullName varchar(50)  not null,
#     email  varchar(40) not null,
#     message  varchar(40) not null,
#     phoneNumber varchar(60),
#     primary key (id)
# );

# {
#     "fullName":"Agazasdeh_Eltaj",
#     "email":"agazadeltac@gmail.com",
#     "message":"ThisMyside",
#     "phoneNumber":"0705594711"
# }