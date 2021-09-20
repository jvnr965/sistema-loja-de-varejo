public class Produto{
  private String nome;
  private String descricao;
  private Double preco;
  private String categoria;
  private String fabricante;

  public Produto(String nome, String fabricante){
    this.nome = nome;
    this.fabricante = fabricante;
  }

  public String getNome(){
    return nome;
  }

  public String getDescricao(){
    return descricao;
  }

  public Double getPreco(){
    return preco;
  }

  public String getCategoria(){
    return categoria;
  }

  public String getFabricante(){
    return fabricante;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public void setPreco(Double preco){
    this.preco = preco;
  }

  public void setCategoria(String categoria){
    this.categoria = categoria;
  }


  @Override
  public String toString(){
    return String.format("-Produto-\nNome: %s\nDescricao: %s\nPreco: %s\nCategoria: %s\nFabricante: %s\n-----",
        this.nome, this.descricao, this.preco, this.categoria, this.fabricante);
  }
}
