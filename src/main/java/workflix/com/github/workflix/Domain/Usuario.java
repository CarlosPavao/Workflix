package workflix.com.github.workflix.Domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@SuppressWarnings("serial")
@Entity
@Table(name= "USUARIO")
@Data
public class Usuario extends AbstractEntity<Long> {
    @Column(nullable= false)
    private String nome;

    @Column(nullable= false)
    private String sobrenome;

    @Column(nullable= false, unique = true)
    private String email;

    @Column(nullable= false)
    @JoinColumn(name = "data_nascimento")
    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    private LocalDate dataNascimento;

    @CPF
    @Column(nullable= false, unique = true)
    private String cpf;

    @Column(nullable= false)
    private String senha;

    private String telefone;

    @Column(nullable = false, length = 15)
    private String celular;

    private String facebook;

    private String linkedin;

    private String github;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_ID")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "experiencia_ID")
    private Experiencia experiencia;

    @ManyToOne
    @JoinColumn(name = "formacao_ID")
    private Formacao formacao;





}
