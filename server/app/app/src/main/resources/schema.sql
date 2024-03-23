#This file allow you to create a MySql schema.


create database if not exists  vikeeper;

use vikeeper;

create table if not exists VideoPathMapper(
    idVideoMapper varchar(36) primary key,
    videoPath varchar(256)
);

create table if not exists series(
    idSeries varchar(64),
    name varchar(128)
);

create table if not exists season(
    idSeason varchar(64),
    idSeries varchar(64),
    foreign key (idSeries) references series(idSeries)
);


create table if not exists episode(
    idEpisode varchar(64),
    idSeason varchar(64),
    foreign key (idSeason) references season(idSeason)
)


