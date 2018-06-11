import pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/SqlServlet")
public class SqlServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("get");
        if("show".equals(param)) {
            List<Person> personList = getPersons();
            request.setAttribute("personList", personList);
            request.getRequestDispatcher("personlist.jsp").forward(request, response);
        } else {
            response.sendError(403);
        }

    }

    private List<Person> getPersons() {
        final String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        List<Person> personList = null;
        final String dbPath = "jdbc:mysql://localhost:3306/ksiegarnia";
        final String sqlQuery = "SELECT * FROM ksiegarnia.klienci";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(dbPath, "root", "karolm22");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);

            String name;
            String surname;
            personList = new ArrayList<>();
            while (resultSet.next()){
                name = resultSet.getString("imie");
                surname = resultSet.getString("nazwisko");
                Person person = new Person(name, surname);
                personList.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return personList;
    }
}
