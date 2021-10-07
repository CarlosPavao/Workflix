package workflix.com.github.workflix.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import workflix.com.github.workflix.Dao.UsuarioDao;
import workflix.com.github.workflix.Domain.Usuario;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao dao;

    @Override
    public void salvar(Usuario usuario) {
        dao.save(usuario);
    }

    @Override
    public void editar(Usuario usuario) {
        dao.update(usuario);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> buscarTodos() {
        return dao.findAll();
    }
}
