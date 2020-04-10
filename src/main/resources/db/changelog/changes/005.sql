--liquibase formatted sql

--changeset tushar:1586240437079-1
CREATE TABLE school (id VARCHAR(255) NOT NULL, name VARCHAR(255) NOT NULL, CONSTRAINT schoolPK PRIMARY KEY (id));

--changeset tushar:1586240437079-2
CREATE TABLE student (id VARCHAR(255) NOT NULL, name VARCHAR(255) NOT NULL, school_id VARCHAR(255) NULL, CONSTRAINT studentPK PRIMARY KEY (id));

--changeset tushar:1586240437079-3
ALTER TABLE student ADD CONSTRAINT FK1vm0oqhk9viil6eocn49rj1l9 FOREIGN KEY (school_id) REFERENCES school (id);