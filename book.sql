------------------------------
--create the database schema--
------------------------------
CREATE DATABASE book-db;

---------------------
--create book table--
---------------------
CREATE TABLE book (
id integer PRIMARY KEY,
isbn VARCHAR (20) NOT NULL,
title VARCHAR ( 100 ) NOT NULL,
description VARCHAR ( 200 ) NOT NULL,
author VARCHAR ( 50 ) NOT NULL,
topic VARCHAR ( 50 ) NOT NULL,
total_pages VARCHAR ( 20 ) NOT NULL,
price VARCHAR ( 10 ) NOT NULL,
publish_date VARCHAR ( 20 ) NOT NULL,
registered_on TIMESTAMP NOT NULL
);

-------------------
--create sequence--
-------------------
CREATE SEQUENCE book_id_seq
START 103
INCREMENT 1
OWNED BY book.id;

---------------
--Insert data--
---------------
insert into book (id,isbn,title,description,author,topic,total_pages,price,publish_date,registered_on)
values (100,'978-84-9759-243-7','Crónica de una muerte anunciada','El día en que lo iban a matar, Santiago Nasar se levantó a las 5.30 de la mañana para esperar el buque en que llegaba el obispo.','García Márquez, Gabriel','Ficción moderna y contemporanea','144','$ 30.000','01-10-2020','2021-01-22 19:10:25-07');

insert into book (id, isbn, title, description, author, topic, total_pages,price, publish_date,registered_on)
values (101, '978-84-9759-220-8','Cien años de soledad', 'Señalada como catedral gótica del lenguaje, este clásico del siglo XX es el enorme y espléndido tapiz de la saga de la familia Buendía, en la mítica aldea de Macondo.', 'García Márquez, Gabriel', 'Ficción moderna y contemporanea','512', '$ 30.000','12-11-2020', '2021-01-22 19:10:25-07');

insert into book (id, isbn, title, description, author, topic, total_pages, price,publish_date,registered_on)
values (102,'978-84-9759-245-1','El amor en los tiempos del cólera', 'García Márquez traza la historia de un amor que no ha sido correspondido por medio siglo. Aunque nunca parece estar propiamente contenido, el amor fluye a través de la novela de mil maneras.', 'García Márquez, Gabriel','Ficción moderna y contemporanea','496', '$ 30.000','30-07-2020', '2021-01-22 19:10:25-07');
