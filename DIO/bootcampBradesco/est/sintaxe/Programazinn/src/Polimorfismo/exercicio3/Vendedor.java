public class Vendedor extends Funcionario{
     
       private double qtdVendas;
       
        public Vendedor(){
        this.setAdmin(false);
        }
    
    public void vendas(double valor){
        this.qtdVendas += valor;
    }
    
    public void getVendas(){
        return qtdVendas;
    }
    public double setVendas(double qtdVendas){
        this.qtdVendas = qtdVendas;
        
    }
     
}