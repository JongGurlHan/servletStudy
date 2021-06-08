package helllo.servlet.web.frontcontroller.v5;

import helllo.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {

    boolean supports(Object handler); //핸들러(컨트롤러)가 넘어왔을때 컨트롤러가 핸들러를 지원할 수 있는ㄴ지 확인

    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler)throws ServletException, IOException;
}
