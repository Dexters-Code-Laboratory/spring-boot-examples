--liquibase formatted sql

--changeset tushar:1
create table exam_3 (
  id bigint not null,
  title varchar(50) not null,
  description varchar(512) not null,
  primary key (id)
);

--changeset tushar:2
create table exam_4 (
  id bigint not null,
  title varchar(50) not null,
  description varchar(512) not null,
  primary key (id)
);