package com.demo;


import java.sql.*;

public class Student {

    public void createDatabase(){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "Dev#@20021";
            String query = "CREATE DATABASE jdbcDemo";

            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);

            ps.execute();
            System.out.println("Database Created Successfully");

            con.close();
            ps.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void createTable(){
        try{
            String url = "jdbc:mysql://localhost:3306/jdbcDemo";
            String username = "root";
            String password = "*****";
            String query = "CREATE TABLE student(stuId INT(3) PRIMARY KEY, stuName VARCHAR(20), stuMail VARCHAR(50))";

            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();

            stmt.execute(query);
            System.out.println("Table Created Successfully!");

            con.close();
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void createData(){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String db = "jdbcDemo";
            String username = "root";
            String password = "*****";
            
            // Multiple data
            // String query = "INSERT INTO student(stuId, stuName, stuMail) VALUES"+
            //                         "(102, 'Anvii', 'httpsanvii@gmail.com'), " +
            //                         "(103, 'Johnson', 'johnsontheking@technocrats.edu.in')";

            // Single Data
            // String query = "INSERT INTO student VALUE(104, 'John', 'johnvlisdies46@gmail.co')";


            // Using setInt(), setString() ..... methods
            String query = "INSERT INTO student(stuId, stuName, stuMail) VALUES (?,?,?)";

            Connection con = DriverManager.getConnection(url+db, username, password);
            PreparedStatement ps = con.prepareStatement(query);

            //We can insert data using setInt(index, data), setString(index, data) also,
            ps.setInt(1, 105);
            ps.setString(2, "Sam");
            ps.setString(3, "sam24@gmail.com");
            
            ps.execute();
            System.out.println("Data Inserted Successfully!");

            con.close();
            ps.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void readData(){
        try{
            String url = "jdbc:mysql://localhost:3306/jdbcDemo";
            String username = "root";
            String password = "*****";
            String query = "SELECT * FROM student";

            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                System.out.println("Id: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Email: "+rs.getString(3));
                System.out.println();
            }
            System.out.println("Data Readed Successfully!");

            con.close();
            stmt.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateData(){
        try{
            String url = "jdbc:mysql://localhost:3306/jdbcDemo";
            String username = "root";
            String password = "******";
            String query = "UPDATE student set stuId = ? WHERE stuName = ? ";

            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 106);
            ps.setString(2, "Sam");

            ps.execute();
            System.out.println("Data Updated Successfully!");

            con.close();
            ps.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}