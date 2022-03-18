package com.crud.demo.controllers;

import com.crud.demo.models.Produit;
import com.crud.demo.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProduitController {

    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(value = {"/","/produits"})
    public String home(Model model,@ModelAttribute Produit produit){
        model.addAttribute("produits",produitRepository.findAll());
        model.addAttribute("produit",produit == null ? new Produit() : produit);
        return "index";
    }

    @GetMapping(value = "/search")
    public String search(RedirectAttributes ra, @ModelAttribute Produit produit){
        ra.addFlashAttribute("produit",produitRepository.findByDesignation(produit.getDesignation()));
        return "redirect:";
    }

}
