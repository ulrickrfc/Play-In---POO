
class Solicitacao {

  public static int codigoGeral = 1;

  private Jogo jogo;
  private String comentario;
  private int id;

  public Solicitacao(Jogo jogo, String comentario) {
    this.jogo = jogo;
    this.comentario = comentario;
    this.id = Solicitacao.codigoGeral;

    Solicitacao.atualizaCodigoGeral();
  }

  public Solicitacao(Jogo jogo) {
    this(jogo, "Não há comentários");
  }

  public static void atualizaCodigoGeral() {
    Solicitacao.codigoGeral += 2;
  }

  public int getCodigo() {
    return this.id;
  }

  public void imprimeSolicitacao() {
    if (this.jogo instanceof JogoVirtual) {

      JogoVirtual p = (JogoVirtual) this.jogo;

      System.out.println("Código da solicitação: " + this.id + " | Tipo do jogo: Jogo Virtual");

      System.out.println("Titulo: " + p.getTitulo() + ", Produtora: " + p.getProdutora() + ", Categoria: "
          + p.getCategoria() + ", Ano de lancamento: " + p.getAnoLancamento() + ", Plataforma: " + p.getPlataforma()
          + ", Loja: " + p.getLoja());
      System.out.println("Comentario: " + this.comentario);
      System.out.println("");

    } else {
      JogoMidia p = (JogoMidia) this.jogo;

      System.out.println("Código da solicitação: " + this.id + " | Tipo do jogo: " + "Midia Física");

      System.out.println("Titulo: " + p.getTitulo() + ", Produtora: " + p.getProdutora() + ", Categoria: "
          + p.getCategoria() + ", Ano de lancamento: " + p.getAnoLancamento() + ", Plataforma: " + p.getPlataforma()
          + ", Loja: " + p.getEstadoMidia());
      System.out.println("Comentario: " + this.comentario);
      System.out.println("");

    }
  }

  public boolean jogoEVirtual() {
    if (this.jogo instanceof JogoVirtual) {
      return true;
    } else {
      return false;
    }
  }
}