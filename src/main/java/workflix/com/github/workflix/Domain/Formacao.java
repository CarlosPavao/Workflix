package workflix.com.github.workflix.Domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
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
    private LocalDate dataInicio;

    @Column(name="data_termino", columnDefinition = "DATE")
    private LocalDate dataTermino;
}