public class Atendente extends Funcionario{
  
  private double caixa;
  
     public void caixa(double valor){
        this.caixa += valor;
    }
    public void getCaixa(){
        return caixa;
    }
    public Atendente(){
        this.setAdmin(false);
    }
  
}