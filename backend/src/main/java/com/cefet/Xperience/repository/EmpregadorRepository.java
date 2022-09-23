package com.cefet.Xperience.repository;

import com.cefet.Xperience.models.Empregador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadorRepository extends JpaRepository<Empregador, Long> {
}
