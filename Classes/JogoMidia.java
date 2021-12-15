package Classes;

public class JogoMidia extends Jogo {

  private String estadoMidia;

  public JogoMidia(String titulo, String plataforma, String produtora, String categoria, int anoLancamento,
      String estadoMidia) {
    super(titulo, plataforma, produtora, categoria, anoLancamento);
    this.estadoMidia = estadoMidia;
  }

  public String getEstadoMidia() {
    return estadoMidia;
  }

  public void setEstadoMidia(String estadoMidia) {
    this.estadoMidia = estadoMidia;
  }

  @Override
  public String getDados() {
    return super.getDados() + ", Estado da mídia: " + this.estadoMidia;
  }
}