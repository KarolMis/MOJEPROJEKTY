import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
        return null;
    }
}
