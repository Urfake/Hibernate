package com.spring.classes.Contollers;

import com.spring.classes.Model.User;
import com.spring.classes.POJO.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/deputyDirector")
public class DirectoController {

    @RequestMapping("/menu-view")
    public String showMenu(@ModelAttribute("director") User user){
        return "menu-view";
    }

    @RequestMapping("/task-generate-view")
    public String taskGenerate(Model model){
        model.addAttribute("tasks",new Tour_Tasks());
        return "Director/task-generate-view";
    }

    @RequestMapping("/show-ticket-sales-view")
    public String showTicketSales(Model model){
        model.addAttribute("permit",new Permit());
        return "Director/show-ticket-sales-view";
    }

    @RequestMapping("/establish-position-view")
    public String establishPosition(Model model){
        model.addAttribute("staff",new Staff());
        return "Director/establish-position-view";
    }

    @RequestMapping("/hire-employee-view")
    public String hireEmployee(Model model){
        model.addAttribute("staff",new Staff());
        return "Director/hire-employee-view";
    }

    @RequestMapping("/assign-task-view")
    public String assignTask(Model model){
        model.addAttribute("tasks",new Tour_Tasks());
        return "Director/assign-task-view";
    }

    @RequestMapping("/appoint-tour-manager-view")
    public String appointTourManager(Model model){
        model.addAttribute("order",new Order_Table());
        return "Director/appoint-tour-manager-view";
    }

    @RequestMapping("/supervise-preparation-view")
    public String supervisePreparation(){
        return "Director/supervise-preparation-view";
    }

    @RequestMapping("/show-reviews-view")
    public String showReviews(){
        return "show-reviews-view";
    }

    @RequestMapping("/translate-tour-view")
    public String translateTour(Model model){
        model.addAttribute("tour",new Tour());
        return "Director/translate-tour-view";
    }

    @RequestMapping("/delete-tour-view")
    public String deleteTour(Model model){
        model.addAttribute("tour",new Tour());
        return "Director/delete-tour-view";
    }

    @RequestMapping("/show-tour-sales")
    public String showTourSales(Model model){
        model.addAttribute("tour",new Tour());
        return "Director/show-tour-sales";
    }

}
