package com.example.web.dao;


//  http://openapi.seoul.go.kr:8088/6d50464258736b6438386674554155/json/TbPublicWifiInfo/5/1000

import com.example.web.domain.PubWifi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PubDao {

    public static List<PubWifi> list() {

        ConnectDB.connect();
        List<PubWifi> wifiList = new ArrayList<>();

        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {

            String sql = "select MGR_NO from PUB_WIFI";

            preparedStatement = ConnectDB.connection.prepareStatement(sql);
//            preparedStatement.setString();
            rs = preparedStatement.executeQuery();

            System.out.println(rs.getString("MGR_NO"));

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
            System.exit(0);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (ConnectDB.connection != null && !ConnectDB.connection.isClosed()) {
                    ConnectDB.connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return wifiList;
    }
}
