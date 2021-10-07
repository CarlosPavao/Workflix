package workflix.com.github.workflix.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@SuppressWarnings("serial")
@MappedSuperclass
@Getter
@Setter
public class AbstractEntity<ID extends Serializable> implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private ID id;

    @Override
    public String toString() {
        return "id =" + id;
    }
}
