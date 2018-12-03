package com.iesemilidarder.anicolau.resolution.web.controller;

import com.iesemilidarder.anicolau.resolution.core.data.Product;
import com.iesemilidarder.anicolau.resolution.core.data.Restaurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;


@Controller
public class WebController {
    @RequestMapping("/")
    public String index(HttpSession session, Model model) {
        List<String> productTypes = Arrays.asList("Hoteles","Activities","Flights");
        List<String> data = Arrays.asList("yuhu1", "yuhu2", "yuhu3");
        //data.it

        model.addAttribute("datil",data);
        model.addAttribute("tony",productTypes);
        //model.addAttribute("ip",session.get)
        //session.getServletContext().getip
        return "index";
    }
    @RequestMapping("/macros")
    public String macroTest(HttpSession session, Model model) {
        return "macroTest";
    }


    @RequestMapping(value = "/inde")
    public String index() {
        return "inde";
    }


}
