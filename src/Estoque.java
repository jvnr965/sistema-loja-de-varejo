public class Estoque {
  private Produto produto;
  private int quantidade;
  private String categoria;

  public Estoque(Produto produto){
    this.produto = produto;
  }

  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
  }

  public void setCategoria(String categoria) {
      this.categoria = categoria;
  }

  public int getQuantidade() {
      return quantidade;
  }

  public String getCategoria() {
      return categoria;
  }


  public Produto getProduto(Produto produto){
    return produto;
  }
  
}
