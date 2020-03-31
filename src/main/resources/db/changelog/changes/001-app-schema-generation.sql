--liquibase formatted sql

--changeset tushar:1585671142488-1
CREATE TABLE `role` (id BIGINT AUTO_INCREMENT NOT NULL, authority VARCHAR(255) NULL, CONSTRAINT rolePK PRIMARY KEY (id));

--changeset tushar:1585671142488-2
CREATE TABLE temp_table (id BIGINT AUTO_INCREMENT NOT NULL, test VARCHAR(255) NULL, CONSTRAINT temp_tablePK PRIMARY KEY (id));

--changeset tushar:1585671142488-3
CREATE TABLE user (id BIGINT AUTO_INCREMENT NOT NULL, accountEnabled BIT DEFAULT 1 NULL, accountExpired BIT DEFAULT 0 NULL, accountLocked BIT DEFAULT 0 NULL, credentialsExpired BIT DEFAULT 0 NULL, dateOfBirth datetime NULL, emailId VARCHAR(255) NULL, firstName VARCHAR(255) NULL, gender VARCHAR(255) NULL, lastName VARCHAR(255) NULL, mobileNumber VARCHAR(255) NULL, password VARCHAR(255) NULL, username VARCHAR(255) NULL, CONSTRAINT userPK PRIMARY KEY (id));

--changeset tushar:1585671142488-4
CREATE TABLE user_role (user_id BIGINT NOT NULL, role_id BIGINT NOT NULL, CONSTRAINT PK_USER_ROLE PRIMARY KEY (user_id, role_id));

--changeset tushar:1585671142488-5
ALTER TABLE user ADD CONSTRAINT UC_USERUSERNAME_COL UNIQUE (username);

--changeset tushar:1585671142488-6
ALTER TABLE user_role ADD CONSTRAINT FK859n2jvi8ivhui0rl0esws6o FOREIGN KEY (user_id) REFERENCES user (id);

--changeset tushar:1585671142488-7
ALTER TABLE user_role ADD CONSTRAINT FKa68196081fvovjhkek5m97n3y FOREIGN KEY (role_id) REFERENCES `role` (id);

