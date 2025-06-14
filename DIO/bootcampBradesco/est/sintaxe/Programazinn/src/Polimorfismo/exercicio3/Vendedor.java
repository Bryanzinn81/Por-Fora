package Polimorfismo.exercicio3;
public class Vendedor extends Funcionario{
     
       private double qtdVendas;
       
        public Vendedor(){
        this.setAdmin(false);
        }
    
    public void vendas(double valor){
        this.qtdVendas += valor;
    }
    
    public double getVendas(){
        return qtdVendas;
    }
    public void setVendas(double qtdVendas){
        this.qtdVendas = qtdVendas;
        
    }
    public void consultSales() {
   	 System.out.println("RELATORIO DE VENDAS");
        System.out.println("Quantidade de vendas: " + getName() + " vendeu R$" + getVendas());
   }
     
}