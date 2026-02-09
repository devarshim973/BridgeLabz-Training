CREATE DATABASE mySqlScenarioPractice;
USE mySqlScenarioPractice;


mysql> CREATE TABLE appointment_master (
    ->     appointment_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     patient_name VARCHAR(100),
    ->     doctor_name VARCHAR(100),
    ->     appointment_date DATE,
    ->     appointment_time TIME,
    ->     status VARCHAR(20),
    ->     remarks VARCHAR(200)
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO appointment_master (patient_name, doctor_name, appointment_date, appointment_time, status, remarks) VALUES
    -> ('Aarav Singh', 'Dr. Karan Mehta', '2026-03-10', '10:00:00', 'SCHEDULED', 'First visit'),
    -> ('Aarav', 'Dr. Mehta', '2026-03-11', '11:00:00', 'SCHEDULED', 'First visit');
Query OK, 2 rows affected (0.02 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SHOW TABLE;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| appointment_master              |
| appointments                    |
| doctor_master                   |
| doctor_schedule                 |
| doctors                         |
| patients                        |
| specialties                     |
+---------------------------------+
7 rows in set (0.01 sec)

mysql> SELECT * FROM appointment_master;
+----------------+--------------+-----------------+------------------+------------------+-----------+-------------+
| appointment_id | patient_name | doctor_name     | appointment_date | appointment_time | status    | remarks     |
+----------------+--------------+-----------------+------------------+------------------+-----------+-------------+
|              1 | Aarav Singh  | Dr. Karan Mehta | 2026-03-10       | 10:00:00         | SCHEDULED | First visit |
|              2 | Aarav        | Dr. Mehta       | 2026-03-11       | 11:00:00         | SCHEDULED | First visit |
+----------------+--------------+-----------------+------------------+------------------+-----------+-------------+
2 rows in set (0.00 sec)