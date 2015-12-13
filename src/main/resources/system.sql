/**
 * 用户表信息
 */
create table `user`(
id int(11) not null auto_increment,
login_name varchar(20) not null,
name varchar(20) not null,
password varchar(50) not null,
salt varchar(20) not null,
email varchar(30) ,
phone varchar(11),
state tinyint(2),
`time` datetime,
primary key(id),
key user_index_login_name(login_name)
)engine=innodb default charset=utf8mb4;