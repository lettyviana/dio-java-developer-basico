import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.of("pt", "BR"));

        System.out.println("Por favor, informe seu nome sem acento.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o número da agência.");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, informe o número da conta.");
        String conta = scanner.next();

        System.out.println("Por favor, informe o saldo.");
        float saldo = scanner.nextFloat();

        NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        String saldoFormatado = formatador.format(saldo);

        System.out.println("Olá, " + nomeCliente + ". Agradecemos por criar uma conta em nosso banco. Sua agência é: "
                + agencia + ", conta " + conta + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        scanner.close();
    }
}
