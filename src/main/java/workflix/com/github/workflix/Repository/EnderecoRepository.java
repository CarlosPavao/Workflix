package workflix.com.github.workflix.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import workflix.com.github.workflix.Domain.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
}
