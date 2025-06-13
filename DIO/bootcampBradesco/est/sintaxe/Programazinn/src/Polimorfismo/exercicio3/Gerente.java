public class Gerente extends Funcionario{
     public Gerente(){
        this.setAdmin(true);
    }
    public void reportFinancial(){
        System.out.println("RELATORIO FINANCEIRO");
        System.out.println("Quantidade de vendas: " + Vendedor.getName + " vendeu R$" + Vendedor.getVendas);
        System.out.println("Quantidade no caixa: " + Atendente.getName + " tem no caixa R$" + Atendente.getCaixa);


    }
}
