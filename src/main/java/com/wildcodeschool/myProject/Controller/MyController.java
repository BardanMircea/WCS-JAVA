package com.wildcodeschool.myProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/doctor")
public class MyController {

    @GetMapping("/")
    public String getAll() {
        return "index";
    }

    @GetMapping("/12")
    @ResponseBody
    public String getTwelfth() {
        return "Peter Capaldi";
    }

    @RequestMapping("/15")
    @ResponseBody
    public String getFifteenth() {
        return "Ncuti Gatwa";
    }

    @RequestMapping("/13")
    @ResponseBody
    public String getThirteenth() {
        return "Jodie Whittaker";
    }

    @RequestMapping("/1")
    @ResponseBody
    public String getFirst() {
        return "William Hartnell";
    }
}
