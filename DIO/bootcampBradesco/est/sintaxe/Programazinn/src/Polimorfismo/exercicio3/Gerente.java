package Polimorfismo.exercicio3;

public class Gerente extends Funcionario{
     public Gerente(){
        this.setAdmin(true);
    }
    public void reportFinancial(Vendedor vendedor, Atendente atendente){
        System.out.println("RELATORIO FINANCEIRO");
        System.out.println("Quantidade de vendas: " + vendedor.getName() + " vendeu R$" + vendedor.getVendas());
        System.out.println("Quantidade no caixa: " + atendente.getName() + " tem no caixa R$" + atendente.getCaixa());


    }
    public void consultSales(Vendedor vendedor) {
    	 System.out.println("RELATORIO DE VENDAS");
         System.out.println("Quantidade de vendas: " + vendedor.getName() + " vendeu R$" + vendedor.getVendas());
    }
}
