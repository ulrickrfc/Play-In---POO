package Classes;

import java.util.ArrayList;

class Usuario extends Pessoa {

  private String preferencia;

  private ArrayList<Pedido> pedidos = new ArrayList<>();
  private ArrayList<Solicitacao> solicitacoes = new ArrayList<>();

  public Usuario(String nome, String cpf, int idade, String telefone, String cidade, String estado,
      String preferencia) {
    super(nome, cpf, idade, telefone, cidade, estado);
    this.preferencia = preferencia;
  }

  //////////// Dados ////////////

  public int getQtdPedidos() {
    return this.pedidos.size();
  } 

  public int getQtdSolicitacoes() {
    return this.solicitacoes.size();
  }

  ///////////////////// Imprimir Dados ////////////////////

  public void imprimeDados() {
    System.out
        .println("Nome: " + super.getNome() + ", CPF: " + super.getCpf() + ", Idade: " + super.getIdade() + ", Cidade: "
            + super.getCidade() + ", Estado: " + super.getEstado() + ", Quantidade de Pedidos: " + this.getQtdPedidos()
            + ", Quantidade de Solicitacoes: " + this.getQtdSolicitacoes() + ", Preferencia: " + this.preferencia);
  }

  //////////////////////////////////////// PEDIDOS///////////////////////////////////////////

  // Pedido sem comentario
  public void addPedido(Jogo jogo) {
    this.pedidos.add(new Pedido(jogo));
  }

  // Pedido com comentario
  public void addPedido(Jogo jogo, String comentario) {
    this.pedidos.add(new Pedido(jogo, comentario));
  }

  // faz uma busca pelo nome do jogo
  public int verificaSeTemPedido(String nome) {
    for (Pedido pedido : this.pedidos) {
      if (pedido.getNomeJogo().toUpperCase().equals(nome.toUpperCase())) {
        return pedido.getCodigo();
      }
    }
    return 0;

  }

  // faz uma busca pelo codigo do pedido
  public void verificaSeTemPedido2(int codigo) {
    for (Pedido pedido : this.pedidos) {
      if (pedido.getCodigo() == codigo) {
        pedido.imprimePedido();
        System.out.println("");
        System.out.println("Para saber mais sobre esse pedido, entre com contato com " + super.getNome()
            + " por WhatsApp pelo numero " + super.getTelefone());
        System.out.println("");

      }
    }
  }

  // Remover Pedido

  public void remPedido(int codigoPedido) {

    for (Pedido pedido : this.pedidos) {
      if (pedido.getCodigo() == codigoPedido) {
        int index = this.pedidos.indexOf(pedido);
        this.pedidos.remove(index);
      }
    }

  }

  // Imprimir Pedidos

  public void imprimePedidos() {

    for (Pedido pedido : this.pedidos) {
      pedido.imprimePedido();
      System.out.println("");

    }
  }

  ////////////////////////// SOLICITACOES ///////////////////

  // Solicitacao com comentario
  public void addSolicitacao(Jogo jogo) {
    this.solicitacoes.add(new Solicitacao(jogo));
  }

  // Solicitacao sem comentario
  public void addSolicitacao(Jogo jogo, String comentario) {
    this.solicitacoes.add(new Solicitacao(jogo, comentario));

  }

  public void remSolicitacao(int codigo) {
    for (Solicitacao solicitacao : this.solicitacoes) {
      if (solicitacao.getCodigo() == codigo) {
        int index = this.solicitacoes.indexOf(solicitacao);
        this.solicitacoes.remove(index);
      }
    }
  }

  public void imprimeSolicitacoes() {

    for (Solicitacao solicitacao : this.solicitacoes) {
      solicitacao.imprimeSolicitacao();
    }
  }

  // faz busca pelo codigo da solicitacao
  public void verificaSeSolicitacao(int codigo) {
    for (Solicitacao solicitacao : this.solicitacoes) {
      if (solicitacao.getCodigo() == codigo) {
        solicitacao.imprimeSolicitacao();

        if (solicitacao.jogoEVirtual()) {
          System.out.println("Para saber mais sobre essa solicitacao, entre com contato com " + super.getNome()
              + " por WhatsApp pelo numero " + super.getTelefone());
          System.out.println("");

        }

        else {
          System.out.println("Para saber mais sobre essa solicitacao, entre com contato com " + super.getNome()
              + " por WhatsApp pelo numero " + super.getTelefone());
          System.out.println("Lembre-se que o usuário " + super.getNome() + " é da cidade " + super.getCidade()
              + " que fica no estado " + super.getEstado()
              + ", caso não esteja próximo pode dificultar o compartilhamento.");
          System.out.println("");
        }

      }
    }
  }

  public boolean removePedido(int id, String cpf) {
    for (Pedido pedido : this.pedidos) {
      if (id == pedido.getCodigo()) {
        if (cpf.equals(super.getCpf())) {
          this.pedidos.remove(pedido);
          return true;
        }
      }
    }
    return false;
  }

  public boolean removeSolicitacao(int id, String cpf) {
    for (Solicitacao solicitacao : this.solicitacoes) {
      if (id == solicitacao.getCodigo()) {
        if (cpf.equals(super.getCpf())) {
          this.solicitacoes.remove(solicitacao);
          return true;
        }
      }
    }
    return false;
  }
}
