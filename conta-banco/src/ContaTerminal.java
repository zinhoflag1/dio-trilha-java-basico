import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o numero da sua Conta :");
        int conta = scanner.nextInt();

        System.out.println("Por favor digite o numero da sua Agencia :");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu Nome :");
        String nome = scanner.next();

        double saldo = 237.48;



        System.out.println("Olá ["+ nome + "] obrigado por criar uma conta em nosso banco, sua agência é : ["+ agencia + "], conta ["+ conta +"] e seu saldo ["+ saldo +"] já está disponível para saque");

    }
}
