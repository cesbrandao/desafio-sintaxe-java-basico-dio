import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //entrada de dados no padrão americano
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a sua Agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por fim, digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " reais já está disponível para saque.");
        
    }
}
