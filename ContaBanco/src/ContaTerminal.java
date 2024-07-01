import java.util.Scanner;

public class ContaTerminal 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o dígito da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo bancário: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
