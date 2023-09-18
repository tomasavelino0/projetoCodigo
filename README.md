## 🔎 Documentação da API

#### Jogador

```
  POST [/jogador](https://projetocodigo-production.up.railway.app/jogador)

  BODY do json para essa requiscao:
  {
    "nome": "Nome Jogador"
  }
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `nome` | `string` | **Obrigatório**. seu nome e sobrenome. |

```
  DELETE [/jogador/all] https://projetocodigo-production.up.railway.app/jogador/all
 
| ao chamar esse endpoint todos os jogadores serao excluidos do DB |

```

#### Times

```
  GET [/times](https://projetocodigo-production.up.railway.app/times)

  | Ao chamar esse endpoint todos os jogadores adicionados irao ser relacinados para seus devido times com essa regra:
        Cada time deve ser formado com jogadores cujo sobrenome comece com a mesma letra. Ou seja,
        jogadores com sobrenomes começando com 'A' formam um time, jogadores com 'B' formam outro, e     
        assim por diante.

        Mas aqui está a reviravolta: você só pode ter UM jogador com o mesmo sobrenome começando com
        a mesma letra em um time. Se houver mais de um jogador com o mesmo sobrenome começando com a 
        mesma letra, eles não podem estar no mesmo time.

    Voce recebera um retorno parecido a esse:
      {"time M":["Lionel messi"],"time J":["Neymar Jr"],"time V":["Raphael Veiga"]}
  |
```

## Como testar voce mesmo

  #### Metodo Simples:
   1 - Acesse: <a href="https://projeto-codigo-front.vercel.app/" target="_blank">Front Desenvolvido em React</a>  
   2 - Com alguma ferramenta de fazer requisicoes, ex: insomnia, postman, thunderclient etc, faca requisicoes para os endpoints descritos acima,
  


  #### Como usar na sua maquina:

  ###### Clone esse repositorio na sua maquina:
    git clone git@github.com:tomasavelino0/projetoCodigo.git
    abra a IDE que vc utiliza ex: Eclipse, Intelijj, Vscode etc, selecione o projeto clonado faca o build do projeto e 
    de RUN na classe ProjetoIbmApplication e o projeto irar subir e pronto, basta fazer requisicoes para 
    seu http://localhost:8080 com os endpoints GET/times POST/jogador DELETE/jogador/all 
    
    
    
  
  
