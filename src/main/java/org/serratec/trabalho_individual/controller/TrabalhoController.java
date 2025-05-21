package org.serratec.trabalho_individual.controller;

import java.util.List;

import org.serratec.trabalho_individual.domain.Funcionario;
import org.serratec.trabalho_individual.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/funcionarios")
public class TrabalhoController {
    @Autowired
    public TrabalhoRepository repo;

    @GetMapping
    public List<Funcionario> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> pesquisar(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Funcionario> inserir(@Valid @RequestBody Funcionario funcionario) {
        return ResponseEntity.ok(repo.save(funcionario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Long id, @Valid @RequestBody Funcionario funcionario) {
        return repo.findById(id)
                .map(fun -> {
                    fun.setId(id);
                    fun.setNome(funcionario.getNome());
                    fun.setEndereco(funcionario.getEndereco());
                    return ResponseEntity.ok(repo.save(fun));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Funcionario> deletar(@PathVariable Long id) {
        return repo.findById(id)
                .map(fun -> {
                    repo.deleteById(id);
                    return ResponseEntity.ok(fun);
                })
                .orElse(ResponseEntity.notFound().build());
    }

}
