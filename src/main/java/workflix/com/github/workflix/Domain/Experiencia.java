package workflix.com.github.workflix.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "experiencia")
@Entity
public class Experiencia extends AbstractEntity<Long>{

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String atividades;

    @Column(name="data_inicio",nullable= false, columnDefinition = "DATE")
    private LocalDate dataInicio;

    @Column(name="data_termino", columnDefinition = "DATE")
    private LocalDate dataTermino;
}