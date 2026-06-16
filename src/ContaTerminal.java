import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Insira seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Insira a agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Saldo da conta: ");
        int saldo = scanner.nextInt();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é" + agencia + ", o número da sua conta é " + numero + ", e seu saldo de " + saldo + " já está deisponível para saque.");
    }
}
