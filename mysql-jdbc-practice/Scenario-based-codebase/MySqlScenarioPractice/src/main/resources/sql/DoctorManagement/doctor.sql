CREATE DATABASE mySqlScenarioPractice;
USE mySqlScenarioPractice;

mysql> CREATE TABLE doctor_master (
    ->     doctor_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     doctor_name VARCHAR(100),
    ->     specialization VARCHAR(100),
    ->     contact VARCHAR(15),
    ->     consultation_fee DECIMAL(8,2),
    ->     schedule VARCHAR(50),
    ->     is_active BOOLEAN DEFAULT TRUE
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO doctor_master (doctor_name, specialization, contact, consultation_fee, schedule) VALUES
    -> ('Dr. Karan Mehta', 'Orthopedics', '9123456789', 900, 'Mon-Fri 10AM-2PM'),
    -> ('Dr. Nisha Rao', 'Dermatology', '9234567890', 700, 'Tue-Thu 11AM-3PM');
Query OK, 2 rows affected (0.02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SHOW TABLES;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| appointments                    |
| doctor_master                   |
| doctor_schedule                 |
| doctors                         |
| patients                        |
| specialties                     |
+---------------------------------+
6 rows in set (0.01 sec)

mysql> SELECT * FROM doctor_master;
+-----------+-----------------+----------------+------------+------------------+------------------+-----------+
| doctor_id | doctor_name     | specialization | contact    | consultation_fee | schedule         | is_active |
+-----------+-----------------+----------------+------------+------------------+------------------+-----------+
|         1 | Dr. Karan Mehta | Orthopedics    | 9123456789 |           900.00 | Mon-Fri 10AM-2PM |         1 |
|         2 | Dr. Nisha Rao   | Dermatology    | 9234567890 |           700.00 | Tue-Thu 11AM-3PM |         1 |
+-----------+-----------------+----------------+------------+------------------+------------------+-----------+
2 rows in set (0.00 sec)