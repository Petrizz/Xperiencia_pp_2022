package com.cefet.Xperience.repository;

import com.cefet.Xperience.models.Oferta;
import com.cefet.Xperience.models.OfertaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRepository extends JpaRepository<Oferta, OfertaId> {
}
