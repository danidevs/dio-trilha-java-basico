import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência ");
            String agencia = scanner.next();

            System.out.println("Por favor digite o número da conta ");
            int numero = scanner.nextInt();

            System.out.println("Por favor digite seu nome ");
            String nome = scanner.next();

            System.out.println("Digite seu sobre nome");
            String sobreNome = scanner.next();

            System.out.println("Por favor digite seu Saldo");
            double saldo = scanner.nextDouble();

            System.out
                    .println("Olá ," + nome + " " + sobreNome
                            + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                            + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        }
    }

}
