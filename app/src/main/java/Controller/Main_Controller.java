package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main_Controller 
{
    @GetMapping("/")
    public String root(Model model)
    {
        model.addAttribute("msg", "Hola");
        return "index";
    }
        
}
