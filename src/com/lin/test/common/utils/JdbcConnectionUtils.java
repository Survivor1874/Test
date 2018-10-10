package com.lin.test.common.utils;


import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-16 09:56
 **/
public class JdbcConnectionUtils {

    public static ConnectionImpl getConn() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        String username = "root";
        String password = "root";
        ConnectionImpl conn = null;
        try {
            Class.forName(driver);
            conn = (ConnectionImpl) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
