class Pessoa {
  private String nome;
  private String cpf;
  private int idade;
  private String telefone;
  private Endereco endereco;

  public Pessoa(String nome, String cpf, int idade, String telefone, String cidade, String estado) {

    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    this.telefone = telefone;

    this.endereco = new Endereco(cidade, estado);
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCidade() {
    return endereco.getCidade();
  }

  public void setCidade(String cidade) {
    this.endereco.setCidade(cidade);
  }

  public String getEstado() {
    return this.endereco.getEstado();
  }

  public void setEstado(String estado) {
    this.endereco.setEstado(estado);
  }

}