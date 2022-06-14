package com.example.web.dao;

import com.example.web.domain.PubWifi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DB connect test
 */
public class ConnectDB {

    static String url = "jdbc:sqlite:/Users/home/dev/sqlite/wifi.db";
    static Connection connection = null;

    public static void connect() {
//        PreparedStatement preparedStatement = null;
//        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.JDBC");   // 드라이버 로드
            connection = DriverManager.getConnection(url);   // 커넥션 객체 생성
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);
        }
    }

    public static void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
