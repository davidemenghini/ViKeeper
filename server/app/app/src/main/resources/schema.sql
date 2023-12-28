#This file allow you to create a MySql schema.


create database if not exists  vikeeper;

use vikeeper;

create table VideoPathMapper(
    idVideoMapper varchar(36) primary key,
    videoPath varchar(256)
);

