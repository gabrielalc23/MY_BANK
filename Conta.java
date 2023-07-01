package sp.senai.br.banco;

import java.util.Scanner;

public class Conta extends BaseConta {

    public void realizarDeposito(double valor) {
        Saldo += valor;
    }

    public void realizarSaque(double valor) {
        if (validarSaque(valor)) {
            Saldo -= valor;
        } else {
            System.out.println("Valor do saque excede o saldo disponível");
        }
    }

    private boolean validarSaque(double valor) {
        double totalSaldo = Saldo - valor;

        return totalSaldo > -1000;
    }
        public double getSaldoTotal(){
        return this.Saldo + this.Limite;

        }
        public double getLimiteDisponivel(){
         
            if (this.Saldo < 0){
                return this.Limite - this.Saldo;
        }
            return this.Limite;
    }
}
    

