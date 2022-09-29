package spring.mvc1.web.frontcontroller.v4.controller;

import spring.mvc1.web.frontcontroller.ModelView;
import spring.mvc1.web.frontcontroller.v3.ControllerV3;
import spring.mvc1.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
