public class Fornecedor{
  private String nomeEmpresa;
  private String nomeContato;
  private String endereco;
  private String telefone;
  private String email;

  public String getEmail() {
      return email;
  }

  public String getEndereco() {
      return endereco;
  }

  public String getTelefone() {
      return telefone;
  }

  public String getNomeContato() {
      return nomeContato;
  }

  public String getNomeEmpresa() {
      return nomeEmpresa;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

  public void setNomeContato(String nomeContato) {
      this.nomeContato = nomeContato;
  }

  public void setNomeEmpresa(String nomeEmpresa) {
      this.nomeEmpresa = nomeEmpresa;
  }

}
