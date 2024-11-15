import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (authenticationSuccessful) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("students.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}