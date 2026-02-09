CREATE DATABASE mySqlScenarioPractice;
USE mySqlScenarioPractice;



mysql> CREATE TABLE visit_master (
    ->     visit_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     patient_name VARCHAR(100),
    ->     doctor_name VARCHAR(100),
    ->     visit_date DATE,
    ->     diagnosis VARCHAR(200),
    ->     prescription TEXT,
    ->     notes VARCHAR(200),
    ->     appointment_status VARCHAR(20)
    -> );
Query OK, 0 rows affected (0.04 sec)

mysql> SHOW TABLES;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| appointment_master              |
| appointments                    |
| doctor_master                                   |
| doctors                         |
| patients                        |
| specialties                     |
| visit_master                    |
+---------------------------------+
8 rows in set (0.00 sec)

mysql> INSERT INTO visit_master (patient_name, doctor_name, visit_date, diagnosis, prescription, notes, appointment_status) VALUES
    -> ('Riya Patel', 'Dr. Aman Verma', '2026-03-15','Viral Fever','Paracetamol 500mg - 2 times/day for 3 days','Patient advised rest and fluids','COMPLETED'),
    -> ('Riya ', 'Dr. Aman', '2026-03-25','Fever','Paracetamol 500mg - 4 times/day for 4 days','Patient advised rest and fluids','COMPLETED');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM visit_master;
+----------+--------------+----------------+------------+-------------+--------------------------------------------+---------------------------------+--------------------+
| visit_id | patient_name | doctor_name    | visit_date | diagnosis   | prescription                               | notes                           | appointment_status |
+----------+--------------+----------------+------------+-------------+--------------------------------------------+---------------------------------+--------------------+
|        1 | Riya Patel   | Dr. Aman Verma | 2026-03-15 | Viral Fever | Paracetamol 500mg - 2 times/day for 3 days | Patient advised rest and fluids | COMPLETED          |
|        2 | Riya         | Dr. Aman       | 2026-03-25 | Fever       | Paracetamol 500mg - 4 times/day for 4 days | Patient advised rest and fluids | COMPLETED          |
+----------+--------------+----------------+------------+-------------+--------------------------------------------+---------------------------------+--------------------+
2 rows in set (0.00 sec)