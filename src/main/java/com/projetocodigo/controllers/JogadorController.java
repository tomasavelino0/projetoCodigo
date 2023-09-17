package com.projetocodigo.controllers;

import com.projetocodigo.domain.Jogador;
import com.projetocodigo.services.JogadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class JogadorController {

  @Autowired
  private JogadorService jService;

  @PostMapping("/jogador")
  public ResponseEntity<Jogador> createPlayer(@RequestBody Jogador jogador) throws Exception {
    if (jogador.getNome().isEmpty()) {
      throw new Exception("Missing field nome");
    }
    jService.createPlayer(jogador);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @GetMapping("/jogador")
  public ResponseEntity<List<Jogador>> getALlPLayer() {
    List<Jogador> players = this.jService.getAllPlayers();
    return new ResponseEntity<>(players, HttpStatus.OK);
  }

  @DeleteMapping("/jogador/all")
  public ResponseEntity<Jogador> deleteAllPlayers() {
    jService.deleteAllPlayers();
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
