import java.time.LocalDateTime;

public class Venda{
  private Vendedor vendedor;
  private Cliente cliente;
  private Produto produto;
  private float valorTotal;
  private LocalDateTime dataVenda;

  public Venda(Vendedor vendedor, Cliente cliente, Produto produto, float valorTotal){
    this.vendedor = vendedor;
    this.cliente = cliente;
    this.produto = produto;
    this.valorTotal = valorTotal;
  }

  public Vendedor getVendedor(){
    return vendedor;
  }

  public Cliente getCliente(){
    return cliente;
  }

  public Produto getProduto(){
    return produto;
  }

  public float getValorTotal(){
    return valorTotal;
  }

  public LocalDateTime getDataVenda(){
    return dataVenda;
  }

  public void setProduto(Produto produto){
    this.produto = produto;
  }

  public void setDataVenda(LocalDateTime dataVenda){
    this.dataVenda = dataVenda;
  }


  @Override
  public String toString(){
    return String.format("-Venda-\nVendedor: %s\nCliente: %s\nProduto: %s\nValorTotal: %s\nDataVenda: %s\n-----" ,this.vendedor, this.cliente, this.produto, this.valorTotal, this.dataVenda);
  }
}
