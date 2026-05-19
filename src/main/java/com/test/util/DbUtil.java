package com.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库工具类
 *
 * @author 李占文
 */
public class DbUtil {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/test01";
    private static String user = "root";
    private static String password = "123456";

    /**
     * 获得数据库的连接对象
     * @return 返回java.sql.Connection类型的对象
     * @throws ClassNotFoundException 数据库驱动加载失败
     * @throws SQLException 数据库链接失败
     * @author 李占文
     */

    public static Connection getConnection() throws ClassNotFoundException, SQLException {


        //关闭数据库自动提交功能
        //返回Connection对象
        Connection conn = null;
        //加载数据库驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获得Connection对象
        conn = DriverManager.getConnection(url,user,password);

        conn.setAutoCommit(false);


        return conn;
    }
}