class Endereco {
  private String cidade;
  private String estado;

  public Endereco(String cidade, String estado) {
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getCidade() {
    return this.cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return this.estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}