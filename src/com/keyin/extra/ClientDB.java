package com.keyin.extra;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
 // id, name, age = mydatabase==mytable
public class ClientDB {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:postgresql://localhost/mydatabase";
        String username = "myusername";
        String password = "mypassword";

        try{
           Class.forName("org.postgresql.Driver");
           Connection connection = DriverManager.getConnection(url,username,password);
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
           while(resultSet.next()){
               int id = resultSet.getInt("id");
               String name = resultSet.getString("name");
               int age = resultSet.getInt("age");
               System.out.printf("id=%d, name=%s, age=%d%n", id, name, age);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        }
    }

