import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ServletLogin", initParams = {@WebInitParam(name = "defaultUsername", value = "Nieznajomy")})
public class ServletLogin extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String username = request.getParameter("username");
        if(username == null || "".equals(username)) {
            username = getServletConfig().getInitParameter("defaultUsername");
        } else {
            request.getSession().setAttribute("username", username);
        }

        writer.println("Witaj " + username);
    }
}
