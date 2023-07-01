
package sp.senai.br.banco;


public class BaseConta {
     private int Numero;
    private int Agencia;
    double Saldo;
    double Limite;        
    private String[] chavePix;
    private int senha;
    
    public int getNumero() {
        return Numero;
    }

    public int getAgencia() {
        return Agencia;
    }

    public double getSaldo() {
        return Saldo;
    }

    public double getLimite() {
        return Limite;
    }

    public String[] getChavePix() {
        return chavePix;
    }

    public int getSenha() {
        return senha;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setLimite(double limite) {
        this.Limite = limite;
    }

    public void setChavePix(String[] chavePix) {
        this.chavePix = chavePix;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
