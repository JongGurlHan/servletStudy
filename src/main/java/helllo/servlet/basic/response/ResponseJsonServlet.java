package helllo.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import helllo.servlet.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="responseJsonServlet", urlPatterns = "/response-json" )
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper(); //객체를 json으로 변경

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: application/json
        response.setContentType("application/json"); //http응답으로 json으로 반환할때의 컨텐트타입
        response.setCharacterEncoding("utf-8");

        HelloData helloData = new HelloData();
        helloData.setUsername("james ");
        helloData.setAge(20);

        //{"username":"kim" , "age":20}
        String result = objectMapper.writeValueAsString(helloData);//객체를 json으로 변경
        response.getWriter().write(result);

    }
}
