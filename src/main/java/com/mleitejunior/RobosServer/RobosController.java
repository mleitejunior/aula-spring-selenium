package com.mleitejunior.RobosServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobosController {

    @GetMapping("/buscar/youtube/termo={termo}")
    public static void buscaYoutube(@PathVariable("termo") String termoASerBuscado, RoboYoutube robo) {
        System.out.println("CHAMOU O ROBO DO YOUTUBE - SEARCH " + termoASerBuscado);

        robo.searchTerm(termoASerBuscado);
    }

    @GetMapping("/buscar/youtube")
    public static void buscaYoutube(RoboYoutube robo) {
        System.out.println("CHAMOU O ROBO DO YOUTUBE - MAIN PAGE");

        robo.openMainPage();
    }

    @GetMapping("/ola")
    public static String dizerOla() {

        return "Olá!";
    }

    @GetMapping("/ola/{nome}")
    public static String dizerOlaComNome(@PathVariable("nome") String nomeADizerOla) {

        return "Olá " + nomeADizerOla + " !";
    }

    @GetMapping("/teste")
    public static String mostrarTeste() {

        return "Teste!";
    }

    @GetMapping("/")
    public static String paginaPrincipal() {

        return "Bem vindo à nossa pagina!";
    }
}
