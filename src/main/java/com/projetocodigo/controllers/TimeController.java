package com.projetocodigo.controllers;

import com.projetocodigo.utils.TomasAvelino;
import com.projetocodigo.domain.Jogador;
import com.projetocodigo.services.JogadorService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/times")
public class TimeController {

  @Autowired
  private JogadorService Jservice;

  @GetMapping
  public ResponseEntity<Map<String, List<String>>> listAllTimes() {
    List<String> allPlayers = Jservice.getAllPlayers().stream().map(Jogador::getNome).toList();
    Map<String, List<String>> playersByTime = TomasAvelino.organizarTimes(allPlayers);
    return new ResponseEntity<>(playersByTime, HttpStatus.OK);
  }
}

