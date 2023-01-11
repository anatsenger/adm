package br.com.ada.adm.Controller;

import br.com.ada.adm.Service.DespesaService;
import br.com.ada.adm.model.Despesa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DespesaController {
    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping("/despesas")
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvar(despesa);
    }

    @GetMapping
    public List<Despesa> listar() {
        return despesaService.listar();
    }

    @GetMapping("/despesa/{id}")
    public Despesa buscarPorId(@PathVariable Long id) {
        return despesaService.buscarPorId(id);
    }

}
