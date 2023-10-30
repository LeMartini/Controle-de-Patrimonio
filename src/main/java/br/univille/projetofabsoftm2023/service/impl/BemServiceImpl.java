package br.univille.projetofabsoftm2023.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabsoftm2023.entity.Bem;
import br.univille.projetofabsoftm2023.repository.BemRepository;
import br.univille.projetofabsoftm2023.service.BemService;

@Service
public class BemServiceImpl
        implements BemService {

    @Autowired
    private BemRepository repository;

    @Override
    public List<Bem> getALL() {
        return repository.findAll();
    }

    @Override
    public void save(Bem bem) {
        repository.save(bem);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

}
