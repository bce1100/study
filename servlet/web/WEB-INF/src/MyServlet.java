import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bce1100
 * @date 2018/8/10.
 */
public class MyServlet extends HttpServlet {
    private String message ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置:响应内容类型
        resp.setContentType("text/html");

        // 输出文本
        PrintWriter out = resp.getWriter();
        out.write("<h1> " + message + " </h1>");

        String name = req.getParameter("name");
        out.write("<h2>"+name+"</h2>");

    }

    @Override
    public void init() throws ServletException {
        message = "ojbk";
    }
}
