package workflix.com.github.workflix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String Home(){
        return "/home";
    }

    @GetMapping("/sobre")
    public String SobreNos(){
        return "/institucional/sobre";
    }

    @GetMapping("/negocio")
    public String Negocio(){
        return "/institucional/negocio";
    }

    @GetMapping("/vagas")
    public String Vagas(){
        return "/institucional/vagas";
    }

    @GetMapping("/contato")
    public String Contato(){
        return "/institucional/contato";
    }

    @GetMapping("/help")
    public String Help(){
        return "/institucional/help";
    }

    @GetMapping("/funciona")
    public String ComoFunciona(){
        return "/institucional/funciona";
    }


}
