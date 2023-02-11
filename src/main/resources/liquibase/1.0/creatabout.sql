use fistdatabase;
create table about
(
    id    int auto_increment,
    title varchar(30)  not null,
    text  varchar(400) not null,
#     constraint key_name
        primary key (id)
);