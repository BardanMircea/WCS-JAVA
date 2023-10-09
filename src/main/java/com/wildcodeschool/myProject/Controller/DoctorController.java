package com.wildcodeschool.myProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping("/")
    public String getAll() {
        return "myIndex";
    }

    @GetMapping("/12")
    @ResponseBody
    public String getTwelfth() {
        return "Peter Capaldi";
    }

    @GetMapping("/15")
    @ResponseBody
    public String getFifteenth() {
        return "Ncuti Gatwa";
    }

    @GetMapping("/13")
    @ResponseBody
    public String getThirteenth() {
        return "Jodie Whittaker";
    }

    @GetMapping("/1")
    @ResponseBody
    public String getFirst() {
        return "William Hartnell";
    }
}
