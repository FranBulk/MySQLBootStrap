package fing.uach.com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fing.uach.com.app.Models.Orden;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Main_Controller {

    @GetMapping("/")
    public String index(Model model) {

        // LISTA DE ÓRDENES
        List<Orden> ordenes = new ArrayList<>();

        ordenes.add(new Orden(6, "Ready", "Leo"));
        ordenes.add(new Orden(5, "Not Ready", "Stefy"));
        ordenes.add(new Orden(4, "Not Ready", "Juan"));
        ordenes.add(new Orden(2, "Ready", "Gali"));
        ordenes.add(new Orden(13, "Not Ready", "Pedro"));

        // ATRIBUTOS PARA THYMELEAF
        model.addAttribute("ordenes", ordenes);
        model.addAttribute("totalOrdenes", ordenes.size());
        model.addAttribute("bounceRate", "80%");
        model.addAttribute("usuarios", 5);

        return "index";
    }
}