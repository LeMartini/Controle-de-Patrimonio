package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Bem;

import br.univille.projetofabsoftm2023.service.BemService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/bem") /* alterado */
public class BemController {

    @Autowired
    private BemService BemService;

    /*
     * @GetMapping
     * public ModelAndView index() {
     * var listabem = BemService.getALL();
     * return new ModelAndView("bem/index",
     * "listabem", listabem);
     * }
     */
    @GetMapping
    public ModelAndView index() {
        var listabem = BemService.getALL();
        System.out.println(listabem); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("bem/index", "listabem", listabem);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var bem = new Bem();
        return new ModelAndView("bem/form",
                "bem", bem);
    }

    /*
     * @PostMapping(params = "form")
     * public ModelAndView save(Bem bem) {
     * 
     * BemService.save(bem);
     * return new ModelAndView("redirect:/bem");
     * }
     */
    @PostMapping("/save")
    public ModelAndView save(Bem bem) {
        BemService.save(bem);
        return new ModelAndView("redirect:/bem");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Bem bem) {

        return new ModelAndView("bem/form",
                "bem", bem);
    }

    /*
     * @GetMapping("/remover/{id}")
     * public ModelAndView remover(@PathVariable("id") long id) {
     * 
     * BemService.delete(id);
     * return new ModelAndView("redirect:/bem");
     * }
     */
    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") int id) {
        BemService.delete(id);
        return new ModelAndView("redirect:/bem");
    }

}
