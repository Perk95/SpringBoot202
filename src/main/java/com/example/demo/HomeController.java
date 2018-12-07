package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
        return "songform";

    }


}
