import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        final String dbPath = "jdbc:mysql://localhost:3306/ksiegarnia";
        Connection conn = DriverManager.getConnection(dbPath, "root", "karolm22");
        Statement statement = conn.createStatement();

        final String sqlQuery = "SELECT * FROM ksiegarnia.klienci";
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        String name;
        String surname;
        while(resultSet.next()) {
            name = resultSet.getString("imie");
            surname = resultSet.getString("nazwisko");
            System.out.println(name + " " + surname);
        }

        if(statement != null) {
            statement.close();
        }
        if(resultSet != null) {
            resultSet.close();
        }
        if(conn != null) {
            conn.close();
        }
    }
}
