create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_Day timestamp,
	primary key(id)
);

insert into person
(ID, NAME, LOCATION, BIRTH_DAY)
values
(1001,'Gabo','Ensenada',sysdate());

insert into person
(ID, NAME, LOCATION, BIRTH_DAY)
values
(1002,'Panshito','NY',sysdate());

insert into person
(ID, NAME, LOCATION, BIRTH_DAY)
values
(1003,'Peter','Obregon',sysdate());