package workflix.com.github.workflix.Domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "experiencia")
@Entity
public class Experiencia extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String atividades;

    @Column(name = "data_inicio", nullable = false, columnDefinition = "DATE")
    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    private LocalDate dataInicio;

    @Column(name = "data_termino", columnDefinition = "DATE")
    @DateTimeFormat(fallbackPatterns = "yyyy-MM-dd")
    private LocalDate dataTermino;

    @ManyToOne
    @JoinColumn(name = "id_usuario_fk")
    private Usuario usuario;
}