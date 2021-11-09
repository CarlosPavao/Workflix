package workflix.com.github.workflix.Domain;

import lombok.*;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@SuppressWarnings("serial")
@Entity
@Table(name= "CANDIDATOS")
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

    @Column(length = 15)
    private String celular;

    private String facebook;

    private String linkedin;

    private String github;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="endereco_id")
    private Endereco endereco;

    @OneToMany (mappedBy = "usuario")
    private List<Experiencia> experiencias;

    @OneToMany (mappedBy = "usuario")
    private List<Formacao> formacoes;





}
