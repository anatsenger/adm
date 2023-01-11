package br.com.ada.adm.repository;

import br.com.ada.adm.model.Despesa;
import br.com.ada.adm.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {

}
