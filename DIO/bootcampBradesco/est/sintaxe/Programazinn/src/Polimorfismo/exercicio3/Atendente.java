package Polimorfismo.exercicio3;


public class Atendente extends Funcionario{
  
  private double caixa;
  
     public void receberPagamento(double valor){
        this.caixa += valor;
    }
    public double getCaixa(){
        return caixa;
    }
    public Atendente(){
        this.setAdmin(false);
    }
   public void closeBox() {
	   System.out.println("CAIXA FECHADO");
   }
}