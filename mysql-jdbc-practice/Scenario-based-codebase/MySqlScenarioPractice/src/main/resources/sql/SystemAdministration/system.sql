CREATE DATABASE mySqlScenarioPractice;
USE mySqlScenarioPractice;


mysql> CREATE TABLE system_admin_master (
    ->     admin_event_id INT PRIMARY KEY AUTO_INCREMENT,
    ->     admin_user VARCHAR(100),
    ->     action_type VARCHAR(50),
    ->     entity_name VARCHAR(50),
    ->     entity_value VARCHAR(100),
    ->     action_date TIMESTAMP,
    ->     remarks VARCHAR(200)
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO system_admin_master (admin_user, action_type, entity_name, entity_value, action_date, remarks) VALUES
    -> ('Admin_Rahul', 'INSERT', 'SPECIALTY', 'Neurology',CURRENT_TIMESTAMP, 'New specialty added'),
    -> ('Admin_Dev', 'INSERT', 'SPECIALTY', 'Neurology',CURRENT_TIMESTAMP, 'New specialty added');
Query OK, 2 rows affected (0.03 sec)
Records: 2  Duplicates: 0  Warnings: 0

mysql> SHOW TABLES;
+---------------------------------+
| Tables_in_mysqlscenariopractice |
+---------------------------------+
| appointment_master              |
| appointments                    |
| billing_master                  |
| doctor_master                   |                 |
| doctors                         |
| patients                        |                    |
| system_admin_master             |
| visit_master                    |
+---------------------------------+
10 rows in set (0.00 sec)

mysql> SELECT * FROM system_admin_master;
+----------------+-------------+-------------+-------------+--------------+---------------------+---------------------+
| admin_event_id | admin_user  | action_type | entity_name | entity_value | action_date         | remarks             |
+----------------+-------------+-------------+-------------+--------------+---------------------+---------------------+
|              1 | Admin_Rahul | INSERT      | SPECIALTY   | Neurology    | 2026-02-09 16:31:12 | New specialty added |
|              2 | Admin_Dev   | INSERT      | SPECIALTY   | Neurology    | 2026-02-09 16:31:12 | New specialty added |
+----------------+-------------+-------------+-------------+--------------+---------------------+---------------------+
2 rows in set (0.00 sec)