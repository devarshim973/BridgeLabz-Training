package com.mysqlpractice.employeeManagementSystem;

import com.mysqlpractice.util.DBConnection;
import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) throws SQLException {
        String sql = "INSERT INTO employee(name, salary) VALUES (?, ?)";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, emp.getName());
        ps.setDouble(2, emp.getSalary());

        ps.executeUpdate();
        System.out.println("Employee added successfully");
        con.close();
    }

    public void viewEmployees() throws SQLException {

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getDouble("salary")
            );
        }
        con.close();
    }

    public void updateSalary(int id, double salary) throws SQLException {
        String sql = "UPDATE employee SET salary=? WHERE id=?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setDouble(1, salary);
        ps.setInt(2, id);

        ps.executeUpdate();
        System.out.println("Salary updated");
        con.close();
    }

    public void deleteEmployee(int id) throws SQLException {
        String sql = "DELETE FROM employee WHERE id=?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Employee deleted");
        con.close();
    }

    public void searchByName(String name) throws SQLException {
        String sql = "SELECT * FROM employee WHERE name LIKE ?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "%" + name + "%");
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " +
                rs.getString("name") + " | " +
                rs.getDouble("salary")
            );
        }
        con.close();
    }
}