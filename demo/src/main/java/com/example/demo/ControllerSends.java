package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class ControllerSends {
    @Autowired
    private DataService dataService;

    @GetMapping("/")
    public String home(Model model) {
        var r = dataService.getAllData();
        System.out.println("Size: " + r.size());
        model.addAttribute("result", r);
        return "index";
    }
 
    @GetMapping("/dataService/{text}")
    public String getData(@PathVariable String text, Model model) {
        Send send = dataService.getData(text);
        if (send == null) {
            return "redirect:/";
        }
        model.addAttribute("Send", send);
        return "send";
    }
}  