package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/employeeform")
    public String loadEmployeeForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employeeForm";
    }
    @RequestMapping("/displayemployee")
    public String displayEmployee(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        return "displayEmployee";
    }
}
