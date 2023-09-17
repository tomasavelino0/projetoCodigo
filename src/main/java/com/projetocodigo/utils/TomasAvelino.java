package com.projetocodigo.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TomasAvelino {

  public static Map<String, List<String>> organizarTimes(List<String> jogadores) {
    Map<String, List<String>> times = new LinkedHashMap<>();
    Set<String> sobrenomesUtilizados = new HashSet<>();

    jogadores.stream().map(jogador -> jogador.split(" ")).filter(nome -> nome.length >= 2)
        .filter(nome -> !sobrenomesUtilizados.contains(nome[1].toUpperCase())).forEach(nome -> {
          String sobrenome = nome[1].toUpperCase();
          sobrenomesUtilizados.add(sobrenome);
          String letra = sobrenome.substring(0, 1);
          times.computeIfAbsent("time" + ' ' + letra, key -> new ArrayList<>())
              .add(String.join(" ", nome));
        });
    return times;
  }
}