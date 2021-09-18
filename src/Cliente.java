import java.time.LocalDate;

public class Cliente{
  private String nomeCompleto;
  private String telefone;
  private String endereco;
  private String email;
  private LocalDate nascimento;

  public String getEmail() {
      return email;
  }

  public String getEndereco() {
      return endereco;
  }

  public String getTelefone() {
      return telefone;
  }
  public String getNomeCompleto() {
      return nomeCompleto;
  }

  public LocalDate getNascimento() {
      return nascimento;
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

  public void setNascimento(LocalDate nascimento) {
      this.nascimento = nascimento;
  }

  public void setNomeCompleto(String nomeCompleto) {
      this.nomeCompleto = nomeCompleto;
  }
}
