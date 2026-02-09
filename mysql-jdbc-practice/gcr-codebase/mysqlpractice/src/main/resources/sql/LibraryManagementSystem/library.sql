CREATE DATABASE mysqlpractice;
USE mysqlpractice;

mysql> CREATE TABLE book (
    ->     book_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     title VARCHAR(150),
    ->     author VARCHAR(100),
    ->     available BOOLEAN
    -> );
Query OK, 0 rows affected (0.07 sec)

mysql> SHOW TABLES;
+-------------------------+
| Tables_in_mysqlpractice |
+-------------------------+
| account                 |
| book                    |
| employee                |
| transaction_history     |
+-------------------------+
4 rows in set (0.00 sec)

mysql> INSERT INTO book(book_id,title,author,available) VALUES
    ->  (1,'Java Programming', 'James Gosling',1),
    -> (2,'Computer Science','devarshi',2),
    -> (3,'java8','john',0);
Query OK, 3 rows affected (0.03 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM book;
+---------+------------------+---------------+-----------+
| book_id | title            | author        | available |
+---------+------------------+---------------+-----------+
|       1 | Java Programming | James Gosling |         1 |
|       2 | Computer Science | devarshi      |         2 |
|       3 | java8            | john          |         0 |
+---------+------------------+---------------+-----------+
3 rows in set (0.02 sec)

mysql> CREATE TABLE borrow (
    ->     borrow_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     student_name VARCHAR(100),
    ->     book_id INT,
    ->     borrow_date DATE,
    ->     return_date DATE
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> SHOW TABLES;
+-------------------------+
| Tables_in_mysqlpractice |
+-------------------------+
| account                 |
| book                    |
| borrow                  |
| employee                |
| transaction_history     |
+-------------------------+
5 rows in set (0.00 sec)

mysql> INSERT INTO borrow(borrow_id,student_name,book_id,borrow_date,return_date) VALUES
    -> (1, 'Amit Sharma', 1, '2026-02-01', '2026-02-10');
Query OK, 1 row affected (0.03 sec)

mysql> SELECT * FROM borrow;
+-----------+--------------+---------+-------------+-------------+
| borrow_id | student_name | book_id | borrow_date | return_date |
+-----------+--------------+---------+-------------+-------------+
|         1 | Amit Sharma  |       1 | 2026-02-01  | 2026-02-10  |
+-----------+--------------+---------+-------------+-------------+
1 row in set (0.00 sec)