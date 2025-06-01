import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(".(Numero da Conta)");
        int numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println(".(Numero da Agencia)");
        String numeroAgencia = scanner.nextLine();

        System.out.println(".(Nome do Titular)");
        String nomeCliente = scanner.nextLine();

        System.out.println(".(Saldo)");
        double saldo = 237.48;
        System.out.println(saldo);

        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + 
            numeroAgencia + ", conta " + numero + 
            " e seu saldo R$" + String.format("%.2f", saldo) + 
            " já está disponível para saque.");


        scanner.close();
    }

}
