import java.time.LocalDate;

public class Cliente{
  private String nomeCompleto;
  private String telefone;
  private String endereco;
  private String email;
  private LocalDate nascimento;

  public Cliente(String nomeCompleto, String telefone, String email){
    this.nomeCompleto = nomeCompleto;
    this.telefone = telefone;
    this.email = email;
  }

  public String getNomeCompleto(){
    return nomeCompleto;
  }

  public String getTelefone(){
    return telefone;
  }

  public String getEndereco(){
    return endereco;
  }

  public String getEmail(){
    return email;
  }

  public LocalDate getNascimento(){
    return nascimento;
  }

  public void setNomeCompleto(String nomeCompleto) {
      this.nomeCompleto = nomeCompleto;
  }

  public void setNascimento(LocalDate nascimento) {
      this.nascimento = nascimento;
  }

  public void setTelefone(String telefone) {
      this.telefone = telefone;
  }

  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  @Override
  public String toString(){
    return String.format("-Cliente-\nNome completo: %s\nTelefone: %s\nEndereco: %s\nEmail: %s\nNascimento: %s\n-----", this.nomeCompleto, this.telefone,
        this.endereco, this.email, this.nascimento);
  }
}
