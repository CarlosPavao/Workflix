package workflix.com.github.workflix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/login")
    void logar(){
        return ;
    }
}
