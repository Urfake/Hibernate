package com.spring.classes.Contollers;


import com.spring.classes.POJO.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tourComposer")
public class TourController {

    @RequestMapping("/menu-view")
    public String showMenu(){
        return "menu-view";
    }

    @RequestMapping("/compile-applications-view")
    public String compileApplications(Model model){
        model.addAttribute("ticket",new Event_Tickets());
        return "tour/compile-applications-view";
    }

    @RequestMapping("/make-program-view")
    public String makeProgram(Model model){
        model.addAttribute("program",new Program());
        return "tour/make-program-view";
    }

    @RequestMapping("/read-customer-review-view")
    public String readCustomerReview(Model model){
        model.addAttribute("client",new Client());
        return "tour/read-customer-review-view";
    }

}
