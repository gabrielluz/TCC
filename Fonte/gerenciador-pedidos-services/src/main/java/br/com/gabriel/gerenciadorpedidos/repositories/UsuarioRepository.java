package br.com.gabriel.gerenciadorpedidos.repositories;

import br.com.gabriel.gerenciadorpedidos.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gabi_ on 21/08/2017.
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
