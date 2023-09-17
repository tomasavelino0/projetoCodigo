package com.projetocodigo.repositories;

import com.projetocodigo.domain.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
  
}
