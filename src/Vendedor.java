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

  public String getNomeCompleto(){
    return nomeCompleto;
  }

  public int getSalario(){
    return salario;
  }

  public LocalDate getNascimento(){
    return nascimento;
  }

  public String getEmail(){
    return email;
  }

  public String getTelefone(){
    return telefone;
  }

  public void setSalario(int salario){
    this.salario = salario;
  }

  public void setNascimento(LocalDate nascimento){
    this.nascimento = nascimento;
  }

  
  @Override
  public String toString(){
    return String.format("-Vendedor-\nNomeCompleto: %s\nSalario: %s\nNascimento: %s\nEmail: %s\nTelefone: %s\n-----" ,this.nomeCompleto, this.salario, this.nascimento, this.email, this.telefone);
  }
}
