CREATE DATABASE mySqlScenarioPractice;
USE mySqlScenarioPractice;

mysql> CREATE TABLE billing_master (
    ->     bill_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     patient_name VARCHAR(100),
    ->     doctor_name VARCHAR(100),
    ->     visit_date DATE,
    ->     consultation_fee DECIMAL(8,2),
    ->     additional_charges DECIMAL(8,2),
    ->     total_amount DECIMAL(10,2),
    ->     payment_status VARCHAR(20),
    ->     payment_mode VARCHAR(30),
    ->     payment_date DATE
    -> );
Query OK, 0 rows affected (0.06 sec)

mysql> SHOW TABLES;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| appointment_master              |
| appointments                    |
| billing_master                  |
| doctor_master                   |
| doctor_schedule                 |
| doctors                         |
| patients                        |
| specialties                     |
| visit_master                    |
+---------------------------------+
9 rows in set (0.00 sec)

mysql> INSERT INTO billing_master (patient_name, doctor_name, visit_date,  consultation_fee, additional_charges, total_amount,payment_status) VALUES
    -> ('Neha Kulkarni', 'Dr. Saurabh Iyer', '2026-03-18', 900, 300, 1200, 'UNPAID'),
    -> ('Neha', 'Dr. Saurabh ', '2026-03-28', 900, 300, 1200, 'PAID');
Query OK, 2 rows affected (0.03 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM billing_master;
+---------+---------------+------------------+------------+------------------+--------------------+--------------+----------------+--------------+--------------+
| bill_id | patient_name  | doctor_name      | visit_date | consultation_fee | additional_charges | total_amount | payment_status | payment_mode | payment_date |
+---------+---------------+------------------+------------+------------------+--------------------+--------------+----------------+--------------+--------------+
|       1 | Neha Kulkarni | Dr. Saurabh Iyer | 2026-03-18 |           900.00 |             300.00 |      1200.00 | UNPAID         | NULL         | NULL         |
|       2 | Neha          | Dr. Saurabh      | 2026-03-28 |           900.00 |             300.00 |      1200.00 | PAID           | NULL         | NULL         |
+---------+---------------+------------------+------------+------------------+--------------------+--------------+----------------+--------------+--------------+
2 rows in set (0.00 sec)