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

    cliente.nomeCompleto = "Thiago Nathan Carvalho";
    cliente.email = "thiagonathancarvalho-94@escolajardim.com.br";
    cliente.telefone = "(84) 2533-3183";
    cliente.endereco = "Travessa Santa Rita 775 Ponta Negra";
    cliente.nascimento = LocalDate.of(1972, 8, 27);

    vendedor.nomeCompleto = "Joaquim Nicolas Gael Barbosa";
    vendedor.email = "joaquimnicolasgaelbarbosa_@djapan.com.br";
    vendedor.salario = 2000;
    vendedor.telefone = "(61) 2598-9754";
    vendedor.nascimento = LocalDate.of(1992, 6, 2);

    produto.nome = "iPhone 11";
    produto.preco = 3734.19;
    produto.categoria = "Celulares";
    produto.descricao = "iPhone 11 Apple 64GB Branco 6,1” 12MP iOS";
    produto.fabricante = "Apple";

    estoque.produto = produto;
    estoque.quantidade = 28;
    estoque.categoria =  "Celulares";

    venda.cliente = cliente;
    venda.produto = produto;
    venda.vendedor = vendedor;
    venda.dataVenda = LocalDateTime.now();
    venda.valorTotal = 3500;

    fornecedor.nomeContato = "Tereza Cristiane Adriana";
    fornecedor.nomeEmpresa = "Líder Produtos";
    fornecedor.email = "ana.lucia@lider.com.br";
    fornecedor.endereco = "Rua Ana Lúcia Torres, 473 BA";
    fornecedor.telefone = "(71) 3706-3788";

    transportadora.nome = "Nexus Transportadora";
    transportadora.cnpj = "05.229.720/0001-47";
    transportadora.email = "contato@nexustransportadora.com";
    transportadora.telefone = "(71) 99201-4094";


  }
}
