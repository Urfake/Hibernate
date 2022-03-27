package com.spring.classes.Contollers;


import com.spring.classes.POJO.Client;
import com.spring.classes.POJO.Agreement;
import com.spring.classes.POJO.Permit;
import com.spring.classes.POJO.Tour;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salesManager")
public class ManagerController {

    @RequestMapping("/menu-view")
    public String showMenu(){
        return "menu-view";
    }

    @RequestMapping("show-dates-and-program-view")
    public String showDatesAndProgram(Model model){
        model.addAttribute("tour",new Tour());
        return "Manager/show-dates-and-program-view";
    }

    @RequestMapping("issue-contract-view")
    public String issueContract(Model model){
        model.addAttribute("contract",new Agreement());
        return "Manager/issue-contract-view";
    }

    @RequestMapping("create-tour-permit-view")
    public String createPermit(Model model){
        model.addAttribute("permit",new Permit());
        return "Manager/create-tour-permit-view";
    }

    @RequestMapping("get-client-information-view")
    public String getClientInformation(Model model){
        model.addAttribute("client",new Client());
        return "Manager/get-client-information-view";
    }

    @RequestMapping("get-tour-information-view")
    public String getTourInformation(Model model){
        model.addAttribute("tour",new Tour());
        return "Manager/get-tour-information-view";
    }
}
