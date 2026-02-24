package Controller;

import Models.Orden;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Main_Controller {

    @GetMapping("/")
    public String index(Model model) {

        // LISTA DE ÓRDENES
        List<Orden> ordenes = new ArrayList<>();

        ordenes.add(new Orden(6, "Orden lista", "Paola"));
        ordenes.add(new Orden(5, "Orden no lista", "Stefy"));
        ordenes.add(new Orden(4, "Orden no lista", "Leo"));
        ordenes.add(new Orden(2, "Orden lista", "Julio"));
        ordenes.add(new Orden(13, "Orden no lista", "Liz"));

        // ATRIBUTOS PARA THYMELEAF
        model.addAttribute("ordenes", ordenes);
        model.addAttribute("totalOrdenes", ordenes.size());
        model.addAttribute("bounceRate", "40%");
        model.addAttribute("usuarios", 5);

        return "index";
    }
}