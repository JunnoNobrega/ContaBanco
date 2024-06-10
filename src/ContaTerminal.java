import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

           
            
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta : ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite seu nome : ");
        String nomeCliente = scanner.next();
        System.out.println( "Digite seu saldo : ");
        double  saldo = 0;
        System.out.printf( "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é: %d, Conta: %d e seu saldo é: %.2f%n", 
                  nomeCliente, agencia, numeroConta, saldo);

    }
}
