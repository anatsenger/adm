package br.com.ada.adm.Controller;

import br.com.ada.adm.Service.FuncionarioService;
import br.com.ada.adm.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionarioController {
    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }
    @PostMapping("/funcionarios")
    public Funcionario salvar(@RequestBody Funcionario fun) {
        return funcionarioService.salvar(fun);
    }

    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    @GetMapping("/funcionario/{id}")
    public Funcionario buscarPorId(@PathVariable Long id) {
        return funcionarioService.buscarPorId(id);
    }
}
