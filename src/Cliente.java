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

  public String getEndereco() {
      return endereco;
  }


  public LocalDate getNascimento() {
      return nascimento;
  }


  public void setEndereco(String endereco) {
      this.endereco = endereco;
  }


  public void setNascimento(LocalDate nascimento) {
      this.nascimento = nascimento;
  }



  public String getNomeCompleto(String nomeCompleto){
    return nomeCompleto;
  }

  public String getTelefone(String telefone){
    return telefone;
  }

  public String getEmail(String email){
    return email;
  }
}
