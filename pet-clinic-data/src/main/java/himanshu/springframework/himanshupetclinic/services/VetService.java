package himanshu.springframework.himanshupetclinic.services;

import himanshu.springframework.himanshupetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
