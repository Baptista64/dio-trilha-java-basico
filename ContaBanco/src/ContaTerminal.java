import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
   
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da agência: ");
        numero = scanner.nextInt();
        
        System.out.print("Por favor, digite o nome da agência: ");
        agencia =  scanner.next();
        
        System.out.print("Por favor, digite o saldo do cliente: ");
        saldo = scanner.nextDouble();
        
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

    }
}
