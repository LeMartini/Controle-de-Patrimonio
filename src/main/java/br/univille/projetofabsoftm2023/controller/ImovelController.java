package br.univille.projetofabsoftm2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabsoftm2023.entity.Imovel;

import br.univille.projetofabsoftm2023.service.ImovelService;

@Controller
/* @RequestMapping("/Bem") */
@RequestMapping("/imovel") /* alterado */
public class ImovelController {

    @Autowired
    private ImovelService ImovelService;

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
        var listaImovel = ImovelService.getALL();
        System.out.println(listaImovel); // Isso deve imprimir sua lista de bens no console.
        return new ModelAndView("imovel/index", "listaImovel", listaImovel);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var imovel = new Imovel();
        return new ModelAndView("imovel/form",
                "imovel", imovel);
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
    public ModelAndView save(Imovel imovel) {
        ImovelService.save(imovel);
        return new ModelAndView("redirect:/imovel");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Imovel imovel) {

        return new ModelAndView("imovel/form",
                "imovel", imovel);
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
        ImovelService.delete(id);
        return new ModelAndView("redirect:/bem");
    }

}
