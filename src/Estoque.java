public class Estoque {
  private Produto produto;
  private int quantidade;
  private String categoria;

  public Estoque(Produto produto){
    this.produto = produto;
  }

  public int getQuantidade(){
    return quantidade;
  }

  public String getCategoria(){
    return categoria;
  }

  public Produto getProduto(){
    return produto;
  }

  public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
  }

  public void setCategoria(String categoria){
    this.categoria = categoria;
  }
  
  @Override
  public String toString(){
    return String.format("-Estoque-\nProduto: %s\nQuantidade: %s\nCategoria: %s\n-----" ,this.produto, this.quantidade, this.categoria);
  }
}
