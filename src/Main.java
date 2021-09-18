import java.time.LocalDate;
import java.time.LocalDateTime;
public class Main {
  public static void main(String[] args){
    Cliente cliente = new Cliente();
    Vendedor vendedor = new Vendedor();
    Produto produto = new Produto();
    Venda venda = new Venda();
    Transportadora transportadora = new Transportadora();
    Fornecedor fornecedor = new Fornecedor();
    Estoque estoque = new Estoque();

    cliente.setNomeCompleto("Thiago Nathan Carvalho");
    cliente.setEmail("thiagonathancarvalho-94@escolajardim.com.br");
    cliente.setTelefone("(84) 2533-3183");
    cliente.setEndereco("Travessa Santa Rita 775 Ponta Negra");
    cliente.setNascimento(LocalDate.of(1972, 8, 27));

    vendedor.setNomeCompleto("Joaquim Nicolas Gael Barbosa");
    vendedor.setEmail("joaquimnicolasgaelbarbosa_@djapan.com.br");
    vendedor.setSalario(2000);
    vendedor.setTelefone("(61) 2598-9754");
    vendedor.setNascimento(LocalDate.of(1992, 6, 2));

    produto.setNome("iPhone 11");
    produto.setPreco(3734.19);
    produto.setCategoria("Celulares");
    produto.setDescricao("iPhone 11 Apple 64GB Branco 6,1” 12MP iOS");
    produto.setFabricante("Apple");

    estoque.setProduto(produto);
    estoque.setQuantidade(28);
    estoque.setCategoria( "Celulares");

    venda.setCliente(cliente);
    venda.setProduto(produto);
    venda.setVendedor(vendedor);
    venda.setDataVenda(LocalDateTime.now());
    venda.setValorTotal(3500);

    fornecedor.setNomeContato("Tereza Cristiane Adriana");
    fornecedor.setNomeEmpresa("Líder Produtos");
    fornecedor.setEmail("ana.lucia@lider.com.br");
    fornecedor.setEndereco("Rua Ana Lúcia Torres, 473 BA");
    fornecedor.setTelefone("(71) 3706-3788");

    transportadora.setNome("Nexus Transportadora");
    transportadora.setCnpj("05.229.720/0001-47");
    transportadora.setEmail("contato@nexustransportadora.com");
    transportadora.setTelefone("(71) 99201-4094");


  }
}
