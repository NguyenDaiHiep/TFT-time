package ndhiep.springsecurity.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public String admin() {
        return "admin";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

}