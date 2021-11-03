package workflix.com.github.workflix.Domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "formacao")
@Entity
public class Formacao extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String curso;

    @Column(nullable = false)
    private String instituicao;

    @Column(nullable = false)
    private String nivel;

    @Column(name="data_inicio",nullable= false, columnDefinition = "DATE")
    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    private LocalDate dataInicio;

    @Column(name="data_termino", columnDefinition = "DATE")
    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    private LocalDate dataTermino;

    @ManyToOne
    @JoinColumn(name = "id_usuario_fk")
    private Usuario usuario;
}