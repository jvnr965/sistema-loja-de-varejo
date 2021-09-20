public class Fornecedor{
  private String nomeEmpresa;
  private String nomeContato;
  private String endereco;
  private String telefone;
  private String email;

  public Fornecedor(String nomeEmpresa, String email){
    this.nomeEmpresa = nomeEmpresa;
    this.email = email;
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

  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

  public void setNomeContato(String nomeContato) {
      this.nomeContato = nomeContato;
  }


  public String getNomeEmpresa(String nomeEmpresa){
    return nomeEmpresa;
  }

  public String getEmail(String email){
    return email;
  }
}
