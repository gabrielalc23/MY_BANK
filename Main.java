package sp.senai.br.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Conta contaBancaria = new Conta();

            System.out.println("+-------------------------------------------------------------------------------------------------------+");
            System.out.println("|-------------------------------------------------------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------------------------------------------------------|");
            System.out.println("|-----------------------------------      BALÃO SUSPEITO BANK   ----------------------------------------|");
            System.out.println("|-------------------------------------------------------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------------------------------------------------------|");
            System.out.println("+-------------------------------------------------------------------------------------------------------+");
            System.out.println("Digite o número da conta: ");
        
            int numeroConta = teclado.nextInt();
            contaBancaria.setNumero(numeroConta);

        System.out.println("Digite a agência: ");
        int agencia = teclado.nextInt();
        contaBancaria.setAgencia(agencia);

        // Define o saldo e limite fixos
        double saldo = 2500.0;
        double limite = 1500.0;
        contaBancaria.setSaldo(saldo);
        contaBancaria.setLimite(limite);

        System.out.println("Digite a senha: ");
        int senha = teclado.nextInt();
        contaBancaria.setSenha(senha);

        System.out.println("Digite o valor que deseja sacar: ");
        double valorSaque = teclado.nextDouble();

        boolean saqueRealizado = realizarSaque(contaBancaria, valorSaque);

        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }

        System.out.printf("Saldo atual: %.2f\n", contaBancaria.getSaldo());
        System.out.printf("Limite disponível: %.2f\n", contaBancaria.getLimiteDisponivel());
        System.out.printf("Valor sacado: %.2f\n", valorSaque);
    }

    public static boolean realizarSaque(Conta conta, double valorSaque) {
        double saldoAtual = conta.getSaldo();
        double limiteDisponivel = conta.getLimiteDisponivel();

        if (valorSaque <= saldoAtual) {
            conta.setSaldo(saldoAtual - valorSaque);
            return true;
        } else if (valorSaque <= saldoAtual + limiteDisponivel) {
            conta.setSaldo(0);
            conta.setLimite(limiteDisponivel - (valorSaque - saldoAtual));
            return true;
        } else {
            return false;
        }
    }
}
