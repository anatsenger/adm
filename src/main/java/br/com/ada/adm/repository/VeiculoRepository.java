package br.com.ada.adm.repository;

import br.com.ada.adm.model.Veiculo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
    Veiculo findByPlaca(String placa);

    List<Veiculo> findByAnoFabricacao(String ano);

}
