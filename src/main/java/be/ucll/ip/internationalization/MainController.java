package be.ucll.ip.internationalization;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value={"/", "/login"})
    public String staticResource(Model model) {
        return "login";
    }

}