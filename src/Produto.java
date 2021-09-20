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

  public String getNome() {
      return nome;
  }

  public Double getPreco() {
      return preco;
  }

  public String getCategoria() {
      return categoria;
  }

  public String getDescricao() {
      return descricao;
  }

  public String getFabricante() {
      return fabricante;
  }

  public void setPreco(Double preco) {
      this.preco = preco;
  }

  public void setCategoria(String categoria) {
      this.categoria = categoria;
  }

  public void setDescricao(String descricao) {
      this.descricao = descricao;
  }

}
