import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Correct extends HttpServlet  {
    public void doPost( HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        response.setContentType ( "text/html;charset=UTF-8" );
        PrintWriter pw=response.getWriter ();
        String us=request.getParameter ("email"  );
        pw.println (  "welcome =>   " + us);
    }
}
