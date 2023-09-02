insert into writer (id, name) values (10001, 'ozan');
insert into writer (id, name) values (10002, 'gamze');
insert into writer (id, name) values (10003, 'duygu');
insert into writer (id, name) values (10004, 'erhan');
insert into writer (id, name) values (10005, 'zehra');

insert into publisher (id, name) values (20001, 'zambak');
insert into publisher (id, name) values (20002, 'esen');
insert into publisher (id, name) values (20003, 'isbankasi');

insert into book (id, isbn, title, publisher_id) values (30001, 111, 'book_name_1', 20001);
insert into book (id, isbn, title, publisher_id) values (30002, 112, 'book_name_2', 20001);
insert into book (id, isbn, title, publisher_id) values (30003, 113, 'book_name_3', 20001);
insert into book (id, isbn, title, publisher_id) values (30004, 114, 'book_name_4', 20002);
insert into book (id, isbn, title, publisher_id) values (30005, 115, 'book_name_5', 20002);
insert into book (id, isbn, title, publisher_id) values (30006, 116, 'book_name_6', 20003);

insert into writer_book (writer_id, book_id) values (10001,30001);
insert into writer_book (writer_id, book_id) values (10002,30001);
insert into writer_book (writer_id, book_id) values (10003,30001);
insert into writer_book (writer_id, book_id) values (10001,30002);
insert into writer_book (writer_id, book_id) values (10002,30003);
insert into writer_book (writer_id, book_id) values (10003,30004);
insert into writer_book (writer_id, book_id) values (10004,30005);
insert into writer_book (writer_id, book_id) values (10004,30006);