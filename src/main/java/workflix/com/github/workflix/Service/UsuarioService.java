package workflix.com.github.workflix.Service;

import workflix.com.github.workflix.Domain.Usuario;

import java.util.List;

public interface UsuarioService {
    void salvar (Usuario usuario);

    void editar (Usuario usuario);

    void excluir(Long id);

    Usuario buscarPorId(Long id);

    List<Usuario> buscarTodos();
}
