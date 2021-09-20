public class Transportadora {
  private String nome;
  private String cnpj;
  private String telefone;
  private String email;

  public Transportadora(String nome, String cnpj, String email){
    this.nome = nome;
    this.cnpj = cnpj;
    this.email = email;
  }

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

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

}
