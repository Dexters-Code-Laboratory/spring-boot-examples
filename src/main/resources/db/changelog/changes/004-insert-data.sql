--liquibase formatted sql

--changeset tushar:004-1
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-1','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-2','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-3','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-4','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-5','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-6','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-7','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-8','SUCCESS');
INSERT into transaction_contract(transaction_id, transaction_status) values ('tx-9','SUCCESS');


--changeset tushar:004-2
INSERT into process(process_id,transaction_id) values ('pid-1','tx-1');
INSERT into process(process_id,transaction_id) values ('pid-2','tx-2');
INSERT into process(process_id,transaction_id) values ('pid-3','tx-3');
INSERT into process(process_id,transaction_id) values ('pid-4','tx-4');
INSERT into process(process_id,transaction_id) values ('pid-5','tx-5');
INSERT into process(process_id,transaction_id) values ('pid-6','tx-6');
INSERT into process(process_id,transaction_id) values ('pid-7','tx-7');
INSERT into process(process_id,transaction_id) values ('pid-8','tx-8');
INSERT into process(process_id,transaction_id) values ('pid-9','tx-9');

--changeset tushar:004-3
INSERT into work_object(transaction_id, test) values ('tx-1','test');
INSERT into work_object(transaction_id, test) values ('tx-2','test');
INSERT into work_object(transaction_id, test) values ('tx-3','test');
INSERT into work_object(transaction_id, test) values ('tx-4','test');
INSERT into work_object(transaction_id, test) values ('tx-5','test');
INSERT into work_object(transaction_id, test) values ('tx-6','test');
INSERT into work_object(transaction_id, test) values ('tx-7','test');
INSERT into work_object(transaction_id, test) values ('tx-8','test');
INSERT into work_object(transaction_id, test) values ('tx-9','test');