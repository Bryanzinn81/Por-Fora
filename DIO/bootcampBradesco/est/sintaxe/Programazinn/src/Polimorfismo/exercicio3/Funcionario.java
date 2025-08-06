package Polimorfismo.exercicio3;


public class Funcionario{
      private String name;
    private String email;
    private String password;
    private boolean admin;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){    
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
   
    public boolean isAdmin (){
        return admin;
    }
    public void setAdmin( boolean admin){
        this.admin = admin;
    }
    
    public void fazerLogin(String password, String email) {
    	System.out.println("LOGIN");
    	System.out.println("Login realizado");
    }
    public void fazerLogoff() {
    	System.out.println("Logoff realizado");
    }
    public String changePassword(String newPassword) {
    	this.password = newPassword;
    	return password;
    }
    }
