import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String USERNAME = "admin";
    private static final String PASS = "pass";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LoginServlet doPost()");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(validate(username, password)){
            request.getSession(true).setAttribute("username", username);
        }
        response.sendRedirect("admin.jsp");
    }

    private boolean validate(String username, String password) {
        return USERNAME.equals(username) && PASS.equals(password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
