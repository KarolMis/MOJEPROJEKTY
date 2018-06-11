import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "IPRequestFilter")
public class IPRequestFilter implements Filter {

    private String ipPattern;

    public void init(FilterConfig config) throws ServletException {
        ipPattern = config.getInitParameter("ipPattern");

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String requestIP = req.getRemoteAddr();
        System.out.println("Ip filter " + requestIP);
        if(requestIP.matches(ipPattern)){
            System.out.println("IP ok");
            chain.doFilter(req, resp);
        } else {
            System.out.println("IP not ok");
            HttpServletResponse httpResponse = (HttpServletResponse) resp;
            httpResponse.sendError(403);
        }
    }

    public void destroy() {
    }

}
