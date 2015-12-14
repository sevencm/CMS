/**
 * 用户表信息
 */
create table `sys_user`(
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

/**
 * 菜单列表
 */
create table `sys_menu`(
id int(11) not null auto_increment,
pid int(11) default null comment '父节点ID',
name varchar(50) not null comment '菜单名称',
`type` tinyint(3) default 0 comment '0表示菜单 1表示功能',
`index` int(3) ,
 url varchar(100),
 icon varchar(50),
 state tinyint(2),
 des varchar(50),
 primary key(id)
)engine=innodb default charset=utf8mb4;

