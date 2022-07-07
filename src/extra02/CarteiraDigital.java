
package extra02;

public class CarteiraDigital {
    private String titular;
    private float saldo;
    private float saque;
    private float deposito;
    
    
    public CarteiraDigital(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
        System.out.println(this.titular +"");
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
        System.out.println(this.saldo+"");
    }

    public float getSaque() {
        return this.saque;
    }

    public void setSaque(float s) {
        //this.saque = s;
        this.setSaldo ( this.getSaldo() -s);
        System.out.println("Saldo "+ this.saldo);
        
    }

    public float getDeposito() {
        return this.deposito;
    }

    public void setDeposito(float d) {
        //this.deposito = d;
        this.setSaldo (this.getSaldo()+d);
        System.out.println("Depósito "+ d);
    }
    
    public void status(){
        System.out.println("Nome "+this.getTitular());
        System.out.println("Saque "+this.getSaldo());
    }
    private void titular(){
        
    }
    
    private void saldo (){
        
    }
    
    private void sacar(){
        
    }
    
    private void depositar(){
        
    }

    
}
