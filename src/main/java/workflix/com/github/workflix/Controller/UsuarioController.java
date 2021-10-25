package workflix.com.github.workflix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsuarioController {

    @GetMapping("/login")
    public String Login() {
        return "/usuario/login";
    }

    @GetMapping("/dashboard")
        public String Dashboard(){
            return "/usuario/dashboard";
        }


    @GetMapping("/new-user")
    public String Cadastrar() {
        return "/usuario/newUser";
    }


    @GetMapping("/listar")
    public String Listar() {
        return "/usuario/lista";
    }


}
