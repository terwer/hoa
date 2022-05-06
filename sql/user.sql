-- 用户表
create table user (id integer not null, firstname varchar(50), lastname varchar(50), age integer, primary key (id)) engine=InnoDB

-- 插入数据
select max(id) from user
insert into user (firstname, lastname, age, id) values (?, ?, ?, ?)