package com.itisvinci.eserciziocondbinclasse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class BaseDbService {

    private static final String DB_HOST = "mariadb";
    private static final String DB_PORT = "3306";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    private static final String DB_DATABASE = "mydb";

    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    protected static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mariadb://" + DB_HOST + ":" + DB_PORT + "/" + DB_DATABASE, DB_USER, DB_PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
