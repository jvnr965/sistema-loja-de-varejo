public class Transportadora {
  private String nome;
  private String cnpj;
  private String telefone;
  private String email;

  public String getCnpj() {
      return cnpj;
  }

  public String getNome() {
      return nome;
  }

  public String getEmail() {
      return email;
  }

  public String getTelefone() {
      return telefone;
  }

  public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

}
