package th.ac.ku.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Welcome to Banking Service Website!");

        // return home.html
        return "home";
    }

}
