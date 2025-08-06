package Polimorfismo.exercicio3;


public class MyClass {
  public static void main(String args[]) {
	  Gerente gerente = new Gerente();
      gerente.setName("Carla");
      gerente.setEmail("carla@empresa.com");
      gerente.setPassword("senha123");

      Vendedor vendedor = new Vendedor();
      vendedor.setName("João");
      vendedor.setEmail("joao@empresa.com");
      vendedor.setPassword("venda456");

      Atendente atendente = new Atendente();
      atendente.setName("Ana");
      atendente.setEmail("ana@empresa.com");
      atendente.setPassword("caixa789");

      // Simulando login
      gerente.fazerLogin(gerente.getPassword(), gerente.getEmail());
      vendedor.fazerLogin(vendedor.getPassword(), vendedor.getEmail());
      atendente.fazerLogin(atendente.getPassword(), atendente.getEmail());

      // Simulando operações
      vendedor.vendas(300.0); // João vendeu 300
      vendedor.vendas(150.0); // João vendeu mais 150
      atendente.receberPagamento(200.0); // Ana recebeu 200
      atendente.receberPagamento(180.0); // Ana recebeu mais 180

      // Relatório do gerente
      gerente.reportFinancial(vendedor, atendente);

      // Relatório individual do vendedor
      vendedor.consultSales();

      // Fechar o caixa
      atendente.closeBox();

      // Simulando logoff
      vendedor.fazerLogoff();
      atendente.fazerLogoff();
      gerente.fazerLogoff();
  }


  }
