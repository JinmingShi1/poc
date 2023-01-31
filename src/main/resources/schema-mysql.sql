DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

create table users
(
    id int not null unique,
    username varchar(50)  not null
        primary key,
    password varchar(120) null,
    enabled  tinyint(1)   not null,
    email    varchar(255) null,
    phoneNum  varchar(255) null,
    ssn varchar(255) null,
    address varchar(255) null,
    city varchar(255) null
);


create table authorities (
                             username varchar(50) not null,
                             authority varchar(50) not null,
                             foreign key (username) references users (username)
);



INSERT INTO users (id, username, password, enabled, email, phoneNum, ssn, address, city) VALUES (1, 'admin', 'admin001', 1, 'test@gmail.com', '123456', '1234', 'NJ', 'NWR');
INSERT INTO users (id, username, password, enabled, email, phoneNum, ssn, address, city) VALUES (2, 'test', 'test', 1, null, null, null, null, null);

insert into authorities(username,authority)values('admin','ROLE_ADMIN');
insert into authorities(username,authority)values('admin','ROLE_USER');