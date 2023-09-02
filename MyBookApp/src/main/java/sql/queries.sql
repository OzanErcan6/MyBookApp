select * from writer;
select * from publisher;
select * from book;
select * from writer_book;

drop table book;
drop table publisher;
drop table writer;
drop table writer_book;

delete from writer_book;
delete from book;
delete from publisher;
delete from writer;