package com.itszt;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by Administrator on 2018\6\21 0021.
 */
public class UtilDBCP {
    private static DataSource dataSource;
    static{
        Properties pro=new Properties();
        InputStream resourceAsStream = UtilDBCP.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
        try {
            pro.load(resourceAsStream);
            dataSource = BasicDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            throw new RuntimeException("加载配置文件失败");
        } catch (Exception e) {
            throw new RuntimeException("获取数据源对象失败");
        }
    }
    public static Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("获取连接对象失败");
        }
    }
    public static void release(Connection connection, Statement statement, ResultSet resultSet){
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public static void release(Connection connection,Statement statement){
        release(connection,statement,null);
    }
}
