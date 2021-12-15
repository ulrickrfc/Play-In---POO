package Classes;

abstract class Jogo {
  public static int identificador = 10;
  private int id;
  private String titulo;
  private String plataforma;
  private String produtora;
  private String categoria;
  private int anoLancamento;

  public Jogo(String titulo, String plataforma, String produtora, String categoria, int anoLancamento) {
    this.id = Jogo.identificador;
    this.titulo = titulo;
    this.produtora = produtora;
    this.categoria = categoria;
    this.anoLancamento = anoLancamento;
    this.plataforma = plataforma;

    Jogo.atualizaIdentificador();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getPlataforma() {
    return plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  public String getProdutora() {
    return produtora;
  }

  public void setProdutora(String produtora) {
    this.produtora = produtora;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public int getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(int anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  // Atualiza identificador
  public static void atualizaIdentificador() {
    Jogo.identificador += 32;
  }

  public static void setIdentificador(int identificador) {
    Jogo.identificador = identificador;
  }

  public static int getIdentificador() {
    return identificador;
  }

  public String getDados() {
    return " Titulo: " + this.titulo + ", Produtora: " + this.produtora + ", Categoria: " + this.categoria
        + ", Ano de lancamento: " + this.getAnoLancamento() + ", Plataforma: " + this.plataforma;
  }

}