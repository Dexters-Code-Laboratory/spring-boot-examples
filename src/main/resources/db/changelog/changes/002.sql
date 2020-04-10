--liquibase formatted sql

--changeset tushar:1585904851976-1
CREATE TABLE transaction_contract (transaction_id VARCHAR(255) NOT NULL, transaction_status VARCHAR(255) NULL, CONSTRAINT transaction_contractPK PRIMARY KEY (transaction_id));

--changeset tushar:1585904851976-2
CREATE TABLE work_object (transaction_id VARCHAR(255) NOT NULL, test VARCHAR(255) NULL, CONSTRAINT work_objectPK PRIMARY KEY (transaction_id));

--changeset tushar:1585904851976-3
CREATE TABLE `process` (process_id VARCHAR(255) NOT NULL, transaction_id VARCHAR(255) NOT NULL, CONSTRAINT processPK PRIMARY KEY (process_id));