package com.projetocodigo.services;

import com.projetocodigo.domain.Jogador;
import com.projetocodigo.repositories.JogadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

  @Autowired
  private JogadorRepository jrepository;

  public List<Jogador> getAllPlayers() {
    return this.jrepository.findAll();
  }

  public void createPlayer(Jogador player) {
    this.jrepository.save(player);
  }
}
