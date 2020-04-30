package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1987Roll");
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("insert into users values ('Vova', 22)");
            ResultSet resultSet = statement.executeQuery("select * from users ");
            resultSet.
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
