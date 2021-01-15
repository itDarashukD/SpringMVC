package com.doroshuk.spring.mvc.contrillers;

import com.doroshuk.spring.mvc.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

    @RequestMapping("/")
    public String showFirstView(){

     return "firstView";
    }



    @RequestMapping("employee")
    public String askDetails(Model model){
        model.addAttribute("employeeAtribute",new Employee());

        return "askDetails";
    }

    @RequestMapping("showDetails")
    public String showDetails(@ModelAttribute("employeeAtribute") Employee employee ){




        return "showDetails";
    }
}
