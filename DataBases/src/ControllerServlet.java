import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("city");
        String country = request.getParameter("country");
        String district = request.getParameter("district");
        String populationString = request.getParameter("population");
        int population = 0;
        if(populationString != null && !"".equals(populationString)) {
            population = Integer.parseInt(populationString);
        }

        String option = request.getParameter("option");
        String message = null;
        if("add".equals(option)) {
            DbUtil.insert(name, country, district, population);
            message = "Do bazy dodano miasto " + name;
        } else if("delete".equals(option)) {
            DbUtil.delete(name);
            message = "Z bazy usunięto miasto " + name;
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("message.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
