package helllo.servlet.web.frontcontroller.v3;

import helllo.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3  {

    ModelView process(Map<String, String> paraMap);
}