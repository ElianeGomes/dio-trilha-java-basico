import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        final int numero;
        final String agencia;
        final String nomeCliente;
        float saldo = 0.00f;      


        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o numero da agência:");
        agencia = sc.next();
        System.out.println("************************************");
        
        System.out.println("Por favor, informe o numero da conta:");
        numero = sc.nextInt();
        System.out.println("************************************");

        System.out.println("Por favor, informe o saldo da conta:");
        saldo = sc.nextFloat();
        System.out.println("************************************");

        System.out.println("Por favor, informe o nome do cliente:");
        String nome = sc.next();
        System.out.println("Por favor, informe o sobre nome do cliente:");
        String sobreNome= sc.next();
        nomeCliente= nome+" "+sobreNome;
        System.out.println("************************************");

        sc.close();

        System.out.println("************************************");
        System.out.println("Olá "+nomeCliente+", \nobrigado por criar uma conta em nosso banco, \nsua agência é "+agencia+", \nconta "+numero+" \ne seu saldo "+saldo+" já está disponível para saque.");
        System.out.println("************************************");
    }
}
