package com.med.kirana.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("greeting", "TESTING THIS SH**");
        return "homepage";
    }
}
