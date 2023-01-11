package br.com.ada.adm.repository;

import br.com.ada.adm.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByCPF(String CPF);
}
