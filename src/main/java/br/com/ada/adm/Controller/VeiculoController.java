package br.com.ada.adm.Controller;


import br.com.ada.adm.Service.VeiculoService;
import br.com.ada.adm.model.Veiculo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping("/veiculos")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoService.listar();
    }

    @GetMapping("/veiculo/{id}")
    public Veiculo buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id);
    }
    @GetMapping("/veiculo/{ano}")
    public List<Veiculo> listarPorAno(@PathVariable String ano) {
        return  veiculoService.listarPorAno(ano);
}
}
