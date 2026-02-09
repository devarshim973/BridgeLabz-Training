CREATE DATABASE mySqlScenarioPractice;
USE mySqlScenarioPractice;

mysql> CREATE TABLE patients (
    ->     patient_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     name VARCHAR(100),
    ->     dob DATE,
    ->     phone VARCHAR(15) UNIQUE,
    ->     email VARCHAR(100) UNIQUE,
    ->     address VARCHAR(200),
    ->     blood_group VARCHAR(5)
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> SHOW TABLES;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| patients                        |
+---------------------------------+
1 row in set (0.07 sec)

mysql>  INSERT INTO patients(name, dob, phone, email, address, blood_group) VALUES
    -> ('Rohit Kumar', '1998-05-12', '9876543210','abc@gmail.com', 'Delhi', 'O+'),
    -> ('devarshi', '1998-05-15', '9876543340','xyz@gmail.com', 'bhopal', 'B+');
Query OK, 2 rows affected (0.03 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM patients;
+------------+-------------+------------+------------+---------------+---------+-------------+
| patient_id | name        | dob        | phone      | email         | address | blood_group |
+------------+-------------+------------+------------+---------------+---------+-------------+
|          1 | Rohit Kumar | 1998-05-12 | 9876543210 | abc@gmail.com | Delhi   | O+          |
|          2 | devarshi    | 1998-05-15 | 9876543340 | xyz@gmail.com | bhopal  | B+          |
+------------+-------------+------------+------------+---------------+---------+-------------+
2 rows in set (0.02 sec)