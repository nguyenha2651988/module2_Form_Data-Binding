package com.codegym.controller;

import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping("/home")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/addEmployee")
    public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
        ModelAndView modelAndView = new ModelAndView("/employee");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
}
