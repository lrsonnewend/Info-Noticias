package infonews;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/exemplo"})
public class App extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            PrintWriter pw = res.getWriter();
            pw.write("Subindo o servidor com gradle!");
            pw.write("Lucas Ribeiro");
            pw.close();
        } catch (Exception e) {
            System.out.println("Erro IO ou servlet.");
        }

    }

}
