package com.example.web.dao;

import com.example.web.common.Db;
import com.example.web.domain.PubWifi;
import java.sql.*;

public class PubDao {

    public void insert(PubWifi pubWifi) {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        PreparedStatement stat = null;


        try {

            conn = DriverManager.getConnection(Db.URL);

            String sql = "INSERT INTO PUB_WIFI VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

            stat = conn.prepareStatement(sql);
            stat.setString(1, pubWifi.getMgrNo());
            stat.setString(2, pubWifi.getRegion());
            stat.setString(3, pubWifi.getMainNm());
            stat.setString(4, pubWifi.getAddress());
            stat.setString(5, pubWifi.getAddressDetail());
            stat.setString(6, pubWifi.getInstallFloor());
            stat.setString(7, pubWifi.getInstallTy());
            stat.setString(8, pubWifi.getInstallMby());
            stat.setString(9, pubWifi.getServiceSe());
            stat.setString(10, pubWifi.getNetworkTy());
            stat.setString(11, pubWifi.getInstallYear());
            stat.setString(12, pubWifi.getIsOutdoor());
            stat.setString(13, pubWifi.getConnectEnv());
            stat.setString(14, pubWifi.getLongitude());
            stat.setString(15, pubWifi.getLatitude());
            stat.setString(16, pubWifi.getWorkDate());

            int affected = stat.executeUpdate();

            if (affected < 0) {
                System.out.println("저장 실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (stat != null && !stat.isClosed()) {
                    stat.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

//    public static List<PubWifi> list() {
//        List<PubWifi> wifiList = new ArrayList<>();
//        return wifiList;
//    }

    public void deleteAll() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        PreparedStatement stat = null;

        String sql = "DELETE FROM PUB_WIFI";

        try {

            conn = DriverManager.getConnection(Db.URL);
            stat = conn.prepareStatement(sql);

            int affected = stat.executeUpdate();

            if (affected < 0) {
                System.out.println("리셋 실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (stat != null && !stat.isClosed()) {
                    stat.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
