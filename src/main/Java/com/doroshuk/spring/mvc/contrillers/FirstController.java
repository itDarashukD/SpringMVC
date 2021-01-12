package com.doroshuk.spring.mvc.contrillers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

    @RequestMapping("/")
    public String showFirstView(){

     return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askDetails(){

        return "askDetails";
    }

    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("employeeName") String  oldNameFromRequest
            , Model model){
        String newNameForShowDetails="Mr.  "+oldNameFromRequest + " !";
        model.addAttribute("nameAttribute",newNameForShowDetails);

        return "showDetails";
    }
}
