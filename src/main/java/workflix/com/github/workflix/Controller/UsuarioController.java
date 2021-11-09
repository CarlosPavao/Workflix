package workflix.com.github.workflix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import workflix.com.github.workflix.Domain.Endereco;
import workflix.com.github.workflix.Domain.Experiencia;
import workflix.com.github.workflix.Domain.Formacao;
import workflix.com.github.workflix.Domain.Usuario;
import workflix.com.github.workflix.Repository.EnderecoRepository;
import workflix.com.github.workflix.Repository.ExperienciaRepository;
import workflix.com.github.workflix.Repository.FormacaoRepository;
import workflix.com.github.workflix.Repository.UsuarioRepository;

@Controller
@RequestMapping("/user")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;
    private EnderecoRepository enderecoRepository;
    private FormacaoRepository formacaoRepository;
    private ExperienciaRepository experienciaRepository;

    public UsuarioController(UsuarioRepository usuarioRepository,
                             EnderecoRepository enderecoRepository,
                             FormacaoRepository formacaoRepository,
                             ExperienciaRepository experienciaRepository){

        this.usuarioRepository = usuarioRepository;
        this.enderecoRepository= enderecoRepository;
        this.formacaoRepository = formacaoRepository;
        this.experienciaRepository = experienciaRepository;
    }

    @GetMapping("/new-user")
    public String novaPessoa(@ModelAttribute("usuario") Usuario usuario,
                             @ModelAttribute("endereco") Endereco endereco,
                             @ModelAttribute("formacao") Formacao formacao,
                             @ModelAttribute("experiencia") Experiencia experiencia){
        return "/usuario/newUser";
    }

    @PostMapping("/salvar")
    public String salvarPessoa(@ModelAttribute("usuario") Usuario usuario,
                               @ModelAttribute("endereco") Endereco endereco,
                               @ModelAttribute("formacao") Formacao formacao,
                               @ModelAttribute("experiencia") Experiencia experiencia){
        enderecoRepository.save(endereco);
        usuario.setEndereco(endereco);

        formacaoRepository.save(formacao);
        
        experienciaRepository.save(experiencia.);



        usuarioRepository.save(usuario);

        return "/usuario/dashboard";
    }

    @GetMapping("/login")
    public String Login() {
        return "/usuario/login";
    }

    @GetMapping("/dashboard")
        public String Dashboard(){
            return "/usuario/dashboard";
        }


}
