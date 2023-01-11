package br.com.ada.adm.Service;

import br.com.ada.adm.model.Veiculo;
import br.com.ada.adm.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvar(Veiculo veiculo) {
        Veiculo veiculoEncontrado = veiculoRepository.findByPlaca(veiculo.getPlaca());
        if(veiculoEncontrado != null){
            throw new IllegalArgumentException();
        }
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listar() {
        return (List<Veiculo>) veiculoRepository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public List<Veiculo> listarPorAno(String ano){
        return veiculoRepository.findByAnoFabricacao(ano);
    }
}
