import java.time.LocalDate;
import java.time.LocalDateTime;
public class Main {
  public static void main(String[] args){

    Cliente cliente = new Cliente("Thiago Nathan Carvalho", "thiagonathancarvalho-94@escolajardim.com.br", "(84) 2533-3183");
    cliente.setEndereco("Travessa Santa Rita 775 Ponta Negra");
    cliente.setNascimento(LocalDate.of(1972, 8, 27));

    Vendedor vendedor = new Vendedor("Joaquim Nicolas Gael Barbosa","joaquimnicolasgaelbarbosa_@djapan.com.br","(61) 2598-9754");
    vendedor.setSalario(2000);
    vendedor.setNascimento(LocalDate.of(1992, 6, 2));

    Produto produto = new Produto("iPhone 11", "Apple");
    produto.setPreco(3734.19);
    produto.setCategoria("Celulares");
    produto.setDescricao("iPhone 11 Apple 64GB Branco 6,1” 12MP iOS");

    Estoque estoque = new Estoque(produto);
    estoque.setQuantidade(28);
    estoque.setCategoria( "Celulares");

    Venda venda = new Venda(vendedor, cliente, produto, 3500);
    venda.setDataVenda(LocalDateTime.now());

    Fornecedor fornecedor = new Fornecedor("Líder Produtos", "ana.lucia@lider.com.br");
    fornecedor.setNomeContato("Tereza Cristiane Adriana");
    fornecedor.setEndereco("Rua Ana Lúcia Torres, 473 BA");
    fornecedor.setTelefone("(71) 3706-3788");

    Transportadora transportadora = new Transportadora("Nexus Transportadora", "05.229.720/0001-47", "contato@nexustransportadora.com");
    transportadora.setTelefone("(71) 99201-4094");

    System.out.println(cliente);
    System.out.println(vendedor);
    System.out.println(produto);
    System.out.println(estoque);
    System.out.println(venda);
    System.out.println(fornecedor);
    System.out.println(transportadora);
  }
}
