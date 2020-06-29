package day08;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils {
    private static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");
    static String driverClass;
    static String url;
    static String username;
    static String password;

    public static Connection getConnectionByDataSource() throws SQLException {
        Connection conn=null;
        conn=dataSource.getConnection();
        return conn;
    }
}
