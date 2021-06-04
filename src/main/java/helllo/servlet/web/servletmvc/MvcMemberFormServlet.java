package helllo.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//컨트롤러
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //WEB-INF 밑에 있는 자원들은 외부에서 호출해도 호출되지 않는다.
        //항상 컨트롤러(여기선 서블릿)를 거쳐서 내부에서 forward해야 호출된다.
        String viewPath = "/WEB-INF/views/new-form.jsp";

        //컨트롤러에서 view로 이동하기 위한코드
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request,response);
    }
}
