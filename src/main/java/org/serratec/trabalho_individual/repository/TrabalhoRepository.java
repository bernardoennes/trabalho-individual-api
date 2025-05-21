package org.serratec.trabalho_individual.repository;

import org.serratec.trabalho_individual.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabalhoRepository extends JpaRepository<Funcionario, Long> {

}
