package br.com.projetopi3.ichirakuburguer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("nomeDoAtributo", "Treinaweb");

        return "produto";
    }
}
