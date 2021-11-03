package workflix.com.github.workflix.Dao;

import org.springframework.stereotype.Repository;
import workflix.com.github.workflix.Domain.Usuario;

import java.util.List;
@Repository
public interface UsuarioDao {
    void save(Usuario usuario);

    void update(Usuario usuario);

    void delete(Long id);

    Usuario findById(Long id);

    List<Usuario> findAll();

}
