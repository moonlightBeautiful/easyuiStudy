package com.ims.c08sample.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

    private String dbUrl = "jdbc:mysql://127.0.0.1:3306/db_easyui?serverTimezone=UTC";
    private String dbUserName = "root";
    private String dbPassword = "root";
    private String jdbcName = "com.mysql.cj.jdbc.Driver";

    public Connection getConn() throws Exception {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        return con;
    }

    public void closeConn(Connection con) throws Exception {
        if (con != null) {
            con.close();
        }
    }
}
