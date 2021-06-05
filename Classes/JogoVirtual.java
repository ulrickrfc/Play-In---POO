class JogoVirtual extends Jogo {
  private String loja;

  public JogoVirtual(String titulo, String plataforma, String produtora, String categoria, int anoLancamento,
      String loja) {
    super(titulo, plataforma, produtora, categoria, anoLancamento);
    this.loja = loja;
  }

  public String getLoja() {
    return loja;
  }

  public void setLoja(String loja) {
    this.loja = loja;
  }

  @Override
  public String getDados() {
    return super.getDados() + ", Estado da mídia: " + this.loja;
  }

}