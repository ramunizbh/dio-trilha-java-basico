import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o número da conta! ");
        //Obter pelo scanner os valores digitados no terminal
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência! ");
        String numeroAgencia = scanner.next();

        System.out.print("Por favor, digite o nome do cliente! ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo! ");
        Double saldoCliente = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoCliente+" já está disponível para saque");

    }
}