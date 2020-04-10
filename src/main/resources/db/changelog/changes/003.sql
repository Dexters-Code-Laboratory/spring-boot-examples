--liquibase formatted sql

--changeset tushar:1585909232325-1
ALTER TABLE work_object ADD process_id VARCHAR(255) NULL;

--changeset tushar:1585909232325-2
ALTER TABLE work_object ADD CONSTRAINT FK9uffn1axgxul4oatrytny9psg FOREIGN KEY (process_id) REFERENCES `process` (process_id);