package helllo.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //자동으로 bean등록된다 (내부에 @Component 애노테이션이 있어서 component scan이 대상이된다.)
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form") //요청정보를 매핑하낟. 해당 url이 호출되면 이 메서드가 호출된다.
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }
}
