INSERT INTO CATEGORY (ID, DESCRIPTION)VALUES(1001, 'PROGRAMACAO')
INSERT INTO CATEGORY (ID, DESCRIPTION)VALUES(1002, 'RECURSOS HUMANOS')
INSERT INTO CATEGORY (ID, DESCRIPTION)VALUES(1003, 'DATA SCIENCE')

INSERT INTO SUPPLIER (ID, NAME) VALUES (1011, 'AMAZON')
INSERT INTO SUPPLIER (ID, NAME) VALUES (1012, 'HOTMART')
INSERT INTO SUPPLIER (ID, NAME) VALUES (1013, 'UDEMY')

INSERT INTO PRODUCT (ID, NAME, FK_SUPPLIER, FK_CATEGORY, QUANTITY_AVAILABLE, CREATED_AT) VALUES(1021, 'DESENVOLVIMENTO C#', 1013, 1001, 50, CURRENT_TIMESTAMP);
INSERT INTO PRODUCT (ID, NAME, FK_SUPPLIER, FK_CATEGORY, QUANTITY_AVAILABLE, CREATED_AT) VALUES(1022, 'DATA PYTHON', 1012, 1003, 50, CURRENT_TIMESTAMP);
INSERT INTO PRODUCT (ID, NAME, FK_SUPPLIER, FK_CATEGORY, QUANTITY_AVAILABLE, CREATED_AT) VALUES(1023, 'GESTÃO DE PESSOAS', 1011, 1002, 50, CURRENT_TIMESTAMP);

