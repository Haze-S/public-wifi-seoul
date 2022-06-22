package com.example.web.common;

import java.sql.*;

/**
 * Db
 */
public class Db {

    public static final String URL = "jdbc:sqlite:/Users/home/dev/sqlite/wifi.db";

    public static final String SQL_PUB_SELECT =
            "SELECT * FROM PUB_WIFI";

    public static final String SQL_PUB_INSERT =
            "INSERT INTO PUB_WIFI"
                    + "()"
                    + "VALUES()";

    public static final String SQL_HIS_SELECT =
            "SELECT * FROM HIST";

    public static final String SQL_HIS_INSERT =
            "INSERT INTO HIST"
                    + "(LAT, LNT, SRCH_DTTM)"
                    + "VALUES(?, ?, SELECT datatime('now', 'localtime'))";
}
