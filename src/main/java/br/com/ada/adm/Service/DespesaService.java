package br.com.ada.adm.Service;

import br.com.ada.adm.model.Despesa;
import br.com.ada.adm.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private final DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }
     public Despesa salvar(Despesa despesa){
        return despesaRepository.save(despesa);
     }
    public List<Despesa> listar() {
        return (List<Despesa>) despesaRepository.findAll();
    }

    public Despesa buscarPorId(Long id) {
        return despesaRepository.findById(id).orElse(null);
    }
}
