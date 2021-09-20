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
    this.valorTotal = valorTotal;
  } 

  public void setDataVenda(LocalDateTime dataVenda){
    this.dataVenda = dataVenda;
  }

  public Vendedor getVendedor(Vendedor vendedor){
    return vendedor;
  }

  public Cliente getCliente(Cliente cliente){
    return cliente;
  }

  public Produto getProduto(Produto produto){
    return produto;
  }

  public float getValorTotal(float valorTotal){
    return valorTotal;
  }

  public LocalDateTime getDataVenda(LocalDateTime dataVenda){
    return dataVenda;
  }
}
