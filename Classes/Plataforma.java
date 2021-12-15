package Classes;

import java.util.ArrayList;

public class Plataforma implements Controle {

  private ArrayList<Usuario> usuarios = new ArrayList<>();

  // Usuarios

  public void addUsuario(String nome, String cpf, int idade, String telefone, String cidade, String estado,
      String preferencia) {
    this.usuarios.add(new Usuario(nome, cpf, idade, telefone, cidade, estado, preferencia));
  }

  public void listarUsuarios() {
    for (Usuario usuario : this.usuarios) {
      usuario.imprimeDados();
    }
  }

  public boolean deletarUsuario(String cpf) {
    for (Usuario usuario : this.usuarios) {
      if (usuario.getCpf().equals(cpf)) {
        this.usuarios.remove(usuario);
        return true;
      }
    }
    return false;
  }
  // Pedidos

  public void addPedido(String cpf, Jogo jogo, boolean com_comentario, String comentario) {

    for (Usuario usuario : this.usuarios) {
      if (cpf.equals(usuario.getCpf())) {

        if (com_comentario) {
          usuario.addPedido(jogo, comentario);
        } else {
          usuario.addPedido(jogo);

        }
      }
    }

  }

  public void listarPedidos() {

    for (Usuario usuario : this.usuarios) {
      if (usuario.getQtdPedidos() != 0) {
        usuario.imprimePedidos();
      }
    }
  }

  // Solicitacoes

  public void addSolicitacao(String cpf, Jogo jogo, boolean com_comentario, String comentario) {

    for (Usuario usuario : this.usuarios) {
      if (cpf.equals(usuario.getCpf())) {

        if (com_comentario) {
          usuario.addSolicitacao(jogo, comentario);
        } else {
          usuario.addSolicitacao(jogo);
        }
      }
    }

  }

  public void listarSolicitacoes() {

    for (Usuario usuario : this.usuarios) {
      if (usuario.getQtdSolicitacoes() != 0) {
        usuario.imprimeSolicitacoes();
      }
    }
  }

  // buscar jogo

  public int buscarJogo(String nome) {
    for (Usuario usuario : this.usuarios) {
      int k = usuario.verificaSeTemPedido(nome);
      if (k != 0) {
        return k;
      }
    }
    return 0;
  }

  public void achaPedido(int codigo) {
    for (Usuario usuario : this.usuarios) {
      usuario.verificaSeTemPedido2(codigo);
    }
  }

  public void achaSolicitacao(int codigo) {
    for (Usuario usuario : this.usuarios) {
      usuario.verificaSeSolicitacao(codigo);
    }
  }

  public boolean deletaPedido(int id, String cpf) {

    boolean achouPedido = false;
    for (Usuario usuario : this.usuarios) {
      if (usuario.removePedido(id, cpf)) {
        achouPedido = true;
      }
    }
    return achouPedido;
  }

  public boolean deletaSolicitacao(int id, String cpf) {

    boolean achouSolicitacao = false;
    for (Usuario usuario : this.usuarios) {
      if (usuario.removeSolicitacao(id, cpf)) {
        achouSolicitacao = true;
      }
    }
    return achouSolicitacao;
  }

  public int getQtdUsuarios() {
    return Controle.qtdPessoas(this.usuarios);
  }
}
