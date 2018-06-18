import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

    public static int insert(String name, String country, String district, int population){

        int rowsAffected = 0;
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionProvider.getConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO city(Name, CountryCode, District, Population) "
                    + "VALUES("
                    + "\""+name+"\""
                    + ","
                    + "\""+country+"\""
                    + ","
                    + "\""+district+"\""
                    + ","
                    + "\""+population+"\""
                    + ");";
            rowsAffected = statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            releaseResources(statement, null, connection);
        }
        return rowsAffected;
    }

    public static int delete(String name) {
        int rowsAffected = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = ConnectionProvider.getConnection();
            statement = connection.createStatement();
            String selectQuery = "SELECT ID FROM city WHERE " + ("Name = " + "\""+name+"\"");
            resultSet = statement.executeQuery(selectQuery);
            if(resultSet.next()) {
                String deleteQuery = "DELETE FROM city WHERE ID="+resultSet.getInt(1);
                rowsAffected = statement.executeUpdate(deleteQuery);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            releaseResources(statement, resultSet, connection);
        }
        return rowsAffected;
    }

    private static void releaseResources(Statement statement, ResultSet resultSet, Connection connection) {
        try {
            if (statement!=null && !statement.isClosed())
                statement.close();
            if (resultSet!= null && !resultSet.isClosed())
                resultSet.close();
            if(connection != null && !connection.isClosed())
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
