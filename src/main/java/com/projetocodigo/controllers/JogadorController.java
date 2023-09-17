package com.projetocodigo.controllers;

import com.projetocodigo.domain.Jogador;
import com.projetocodigo.services.JogadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/jogadores")
public class JogadorController {

  @Autowired
  private JogadorService jService;

  @PostMapping
  public ResponseEntity<Jogador> createPlayer(@RequestBody Jogador jogador) {
    System.out.println(jogador);
    jService.createPlayer(jogador);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<List<Jogador>> getALlPLayer() {
    List<Jogador> players = this.jService.getAllPlayers().stream().toList();
    return new ResponseEntity<>(players, HttpStatus.OK);
  }
}
