package workflix.com.github.workflix.Domain;

import javax.persistence.*;

@Table(name = "login")
@Entity
public class Login extends AbstractEntity<Long>{

    @Column(nullable= false)
    private String cpf;

    @Column(nullable= false)
    private String senha;

    @OneToOne
    @JoinColumn(name = "usuario_ID")
    private Usuario usuario;
}