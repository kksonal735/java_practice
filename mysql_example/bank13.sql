create database bank13;
use bank13;
create Table bank(
accno int not null primary key,
name varchar(50),
tno int,
type varchar(10),
amt double,
dot date,
address varchar(50)
);
insert into bank values(15,'sanika',111,'withdraw',4500,'2024-09-22','nagpur');
select * from bank;
select * from bank Where type='Withdraw';
select accno, name ,amt,type from bank where type in('deposit','withdraw') and month(dot)  ='5'; 
select tno,amt from bank where accno='1';
select * from bank where amt<5000;
select name from bank where address NOT IN( 'pune','mumbai');
select address,name from bank where address='pune' ;
select max(amt),min(amt) from bank where month(dot)='5';
select (amt) from bank ;