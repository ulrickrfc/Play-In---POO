package Classes;

class Pedido {
  public static int codigo_geral = 2;
  private int codigo;
  private Jogo jogo;
  private String comentario;

  public Pedido(Jogo jogo, String comentario) {
    this.jogo = jogo;
    this.comentario = comentario;
    this.codigo = Pedido.codigo_geral;

    Pedido.atualizaCodigo_geral();
  }

  public Pedido(Jogo jogo) {
    this(jogo, "Não há comentários");
  }

  // atualizaCodigo_geral

  public static void atualizaCodigo_geral() {
    Pedido.codigo_geral += 2;
  }

  public int getCodigo() {
    return this.codigo;
  }

  // JOGO

  public void imprimePedido() {

    if (this.jogo instanceof JogoVirtual) {
      System.out.println("Código do pedido: " + this.codigo + " | Tipo do jogo: Jogo Virtual");

      JogoVirtual p = (JogoVirtual) this.jogo;

      System.out.println(p.getDados());
      System.out.println("Comentario: " + this.comentario);

    } else {
      JogoMidia p = (JogoMidia) this.jogo;
      System.out.println("Código do pedido: " + this.codigo + " | Tipo do jogo: Jogo Midia");

      System.out.println(p.getDados());

      System.out.println("Comentario: " + this.comentario);
    }
  }

  public String getNomeJogo() {
    return this.jogo.getTitulo();
  }
}
