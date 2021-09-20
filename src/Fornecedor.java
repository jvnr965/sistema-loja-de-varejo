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
  
  public String getNomeEmpresa(){
    return nomeEmpresa;
  }

  public String getNomeContato(){
    return nomeContato;
  }

  public String getEndereco(){
    return endereco;
  }

  public String getTelefone(){
    return telefone;
  }

  public String getEmail(){
    return email;
  }

  public void setNomeContato(String nomeContato){
    this.nomeContato = nomeContato;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }


  @Override
  public String toString(){
    return String.format("-Fornecedor-\nNome da Empresa: %s\nNome do Contato: %s\nEndereco: %s\nTelefone: %s\nEmail: %s\n-----",
        this.nomeEmpresa, this.nomeContato, this.endereco, this.telefone, this.email);
  }
}
