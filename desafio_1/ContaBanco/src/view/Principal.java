package view;

import java.util.Scanner;

import model.ContaTerminal;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao sistema Conta Terminal!");
        ContaTerminal ct = new ContaTerminal();

        System.out.println("Por favor, informe o numero da conta: ");
        int num = sc.nextInt();
        ct.setNumero(num);

        System.out.println("Por favor, informe o codigo da agência: ");
        String codAgencia = sc.next();
        ct.setAgencia(codAgencia);
        sc.nextLine();

        System.out.println("Por favor, informe o nome do cliente: ");
        String nomeCliente = sc.next();
        ct.setNomeCliente(nomeCliente);
        sc.nextLine();

        System.out.println("Por favor, informe o saldo da conta: ");
        Double saldo = sc.nextDouble();
        ct.setSaldo(saldo);

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque ",
                ct.getNomeCliente(), ct.getAgencia(), ct.getNumero(), ct.getSaldo().toString());
    }
}
