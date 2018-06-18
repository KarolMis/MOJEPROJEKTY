//package db;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//
//import java.beans.PropertyVetoException;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class DbUtil {
//    private static DbUtil dbUtil;
//    // obiekt C3P0 odpowiedzialny za zarzdzanie połczeniami
//    private ComboPooledDataSource connectionPool;
//
//    private DbUtil() throws PropertyVetoException {
//        connectionPool = new ComboPooledDataSource();
//        // podstawowe informacje o bazie danych
//        connectionPool.setDriverClass("com.mysql.jdbc.Driver");
//        connectionPool.setJdbcUrl("jdbc:mysql://localhost:3306/world");
//        connectionPool.setUser("root");
//        connectionPool.setPassword("admin");
//
//        // konfiguracja puli połaczeń
//        //pocztkowa liczba połaczeń
//        connectionPool.setInitialPoolSize(5);
//        // min. dostępna liczba podtrzymywanych połczeń
//        connectionPool.setMinPoolSize(5);
//        // max liczba podtrzymywanych połaczeń
//        connectionPool.setMaxPoolSize(20);
//        // ilość dodatkowych połczeń, która ma być otworzona, gdy wszystkie s
//        // zajęte
//        connectionPool.setAcquireIncrement(5);
//        // maxymalny czas podtrzymywania połczenia w sec
//        connectionPool.setMaxIdleTime(3600);
//    }
//
//    public Connection getConnection() throws SQLException {
//        return connectionPool.getConnection();
//    }
//
//    public void close() {
//        connectionPool.close();
//    }
//
//    public static DbUtil getInstance() {
//        if (dbUtil == null) {
//            try {
//                dbUtil = new DbUtil();
//            } catch (PropertyVetoException e) {
//                e.printStackTrace();
//            }
//        }
//        return dbUtil;
//    }
//}