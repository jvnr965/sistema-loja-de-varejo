public class Estoque {
  private Produto produto;
  private int quantidade;
  private String categoria;

  public void setProduto(Produto produto) {
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

  public Produto getProduto() {
      return produto;
  }

  public String getCategoria() {
      return categoria;
  }

}
