import java.time.LocalDate;

public class Vendedor {
  private String nomeCompleto;
  private int salario;
  private LocalDate nascimento;
  private String email;
  private String telefone;

  public Vendedor(String nomeCompleto, String email, String telefone){
    this.nomeCompleto = nomeCompleto;
    this.email = email;
    this.telefone = telefone;
  }

  public void setSalario(int salario){
    this.salario = salario;
  }

  public void setNascimento(LocalDate nascimento){
    this.nascimento = nascimento;
  }

  public String getNomeCompleto(String nomeCompleto){
    return nomeCompleto;
  }

  public int getSalario(int salario){
    return salario;
  }

  public LocalDate getNascimento(LocalDate nascimento){
    return nascimento;
  }

  public String getEmail(String email){
    return email;
  }

  public String getTelefone(String telefone){
    return telefone;
  }
}
