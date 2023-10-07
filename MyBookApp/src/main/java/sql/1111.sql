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

insert into customer (id, customer_name) values (40001, 'ozan ercan');
insert into customer (id, customer_name) values (40002, 'gamze ercan');
insert into customer (id, customer_name) values (40003, 'duygu ercan');
insert into customer (id, customer_name) values (40004, 'mira sarisakaloglu');
insert into customer (id, customer_name) values (40005, 'sennur sarisakaloglu');


INSERT INTO post (id, text, title, customer_id) VALUES (50001, 'Hello there, this is the first post.', 'First Post', 40001);
INSERT INTO post (id, text, title, customer_id) VALUES (50002, 'Just another day in the life of a blogger.', 'Another Day', 40002);
INSERT INTO post (id, text, title, customer_id) VALUES (50003, 'Exploring the world of coding and creativity.', 'Coding Adventures', 40003);
INSERT INTO post (id, text, title, customer_id) VALUES (50004, 'The art of storytelling: crafting compelling narratives.', 'Crafting Narratives', 40004);
INSERT INTO post (id, text, title, customer_id) VALUES (50005, 'A glimpse into the future of technology.', 'Future Tech', 40005);
INSERT INTO post (id, text, title, customer_id) VALUES (50006, 'The beauty of nature and its wonders.', 'Natures Wonders', 40001);
INSERT INTO post (id, text, title, customer_id) VALUES (50007, 'The flavors and aromas of world cuisine.', 'World of Cuisine', 40002);
INSERT INTO post (id, text, title, customer_id) VALUES (50008, 'Unraveling the mysteries of the universe.', 'Mysteries Unveiled', 40003);
INSERT INTO post (id, text, title, customer_id) VALUES (50009, 'Art and its impact on society and culture.', 'Artistic Impact', 40004);
INSERT INTO post (id, text, title, customer_id) VALUES (50010, 'Diving into the ocean of musical melodies.', 'Musical Melodies', 40005);
INSERT INTO post (id, text, title, customer_id) VALUES (50011, 'Embracing change: a journey towards self-discovery.', 'Journey of Self-Discovery', 40001);
INSERT INTO post (id, text, title, customer_id) VALUES (50012, 'Innovation and the technology revolution.', 'Tech Innovation', 40002);
INSERT INTO post (id, text, title, customer_id) VALUES (50013, 'Health and wellness: a holistic approach.', 'Holistic Wellness', 40003);
INSERT INTO post (id, text, title, customer_id) VALUES (50014, 'Literature and its timeless tales.', 'Timeless Literature', 40004);
INSERT INTO post (id, text, title, customer_id) VALUES (50015, 'Adventures in the great outdoors.', 'Outdoor Adventures', 40005);
INSERT INTO post (id, text, title, customer_id) VALUES (50016, 'Connecting the dots: understanding relationships.', 'Understanding Relationships', 40001);
INSERT INTO post (id, text, title, customer_id) VALUES (50017, 'Dancing through life: the joy of movement.', 'Joy of Movement', 40002);
INSERT INTO post (id, text, title, customer_id) VALUES (50018, 'Technology and the future of education.', 'Future of Education', 40003);
INSERT INTO post (id, text, title, customer_id) VALUES (50019, 'Fiction vs. Reality: exploring alternate worlds.', 'Exploring Alternate Worlds', 40004);
INSERT INTO post (id, text, title, customer_id) VALUES (50020, 'Discovering new flavors in the world of coffee.', 'World of Coffee', 40005);

