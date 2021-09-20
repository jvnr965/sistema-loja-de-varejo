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

  public String getNome(){
    return nome;
  }

  public String getCnpj(){
    return cnpj;
  }

  public String getTelefone(){
    return telefone;
  }

  public String getEmail(){
    return email;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
  }


  @Override
  public String toString(){
    return String.format("-Transportadora-\nNome: %s\nCnpj: %s\nTelefone: %s\nEmail: %s\n-----" ,this.nome, this.cnpj, this.telefone, this.email);
  }
}
