create database test1;
use test1;
create table t_order_1(
id bigint unsigned primary key auto_increment,
order_no varchar(20) not null comment 'orderNo',
source_type varchar(20) not null comment 'source',
deleted bit(1) not null default 0 comment 'delete flag',
gmt_created timestamp default CURRENT_TIMESTAMP comment 'create time',
gmt_modified datetime comment 'modify time'
)engine = InnoDB default charset = utf8 comment 'order';

create database test2;
use test2;
create table t_order(
id bigint unsigned primary key auto_increment,
order_no varchar(20) not null comment 'orderNo',
source_type varchar(20) not null comment 'source',
deleted bit(1) not null default 0 comment 'delete flag',
gmt_created timestamp default CURRENT_TIMESTAMP comment 'create time',
gmt_modified datetime comment 'modify time'
)engine = InnoDB default charset = utf8 comment 'order';
