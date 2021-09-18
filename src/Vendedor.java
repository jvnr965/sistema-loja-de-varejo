import java.time.LocalDate;

public class Vendedor {
  private String nomeCompleto;
  private int salario;
  private LocalDate nascimento;
  private String email;
  private String telefone;


  public void setNomeCompleto(String nomeCompleto){
    this.nomeCompleto = nomeCompleto;
  }

  public void setSalario(int salario){
    this.salario = salario;
  }

  public void setNascimento(LocalDate nascimento){
    this.nascimento = nascimento;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setTelefone(String telefone){
    this.telefone = telefone;
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
