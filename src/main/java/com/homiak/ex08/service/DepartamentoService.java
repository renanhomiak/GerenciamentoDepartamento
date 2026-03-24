package com.homiak.ex08.service;

import com.homiak.ex08.models.DepartamentoModel;
import com.homiak.ex08.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public DepartamentoModel salvar(DepartamentoModel departamento) {
        return repository.save(departamento);
    }

    public List<DepartamentoModel> listar() {
        return repository.findAll();
    }

    public Optional<DepartamentoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}