package test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ALISURE on 2017/3/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index.html")
    public String test(){
        return "index";
    }

}
