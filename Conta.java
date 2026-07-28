import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = input.nextLine();

        ContaBancaria conta = new ContaBancaria(titular); //Instanciamos a conta passando o titular pelo construtor

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n--- CONTA BANCÁRIA ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDepositar = input.nextDouble();
                    conta.depositar(valorDepositar);

                    break;

                case 2:
                    System.out.print("Digite o valor que deseja sacar: ");
                    double valorSaque = input.nextDouble();
                    conta.sacar(valorSaque);

                    break;

                case 3:
                    System.out.println("\n Saldo do titular:");
                    conta.mostrarSaldo();
                    break;

                case 0:
                    System.out.println("Volte sempre :)");
                    break;

                default:
                    System.out.println("Essa opção não existe. Tente de novo!");
            }
        }

        input.close();
    }
}