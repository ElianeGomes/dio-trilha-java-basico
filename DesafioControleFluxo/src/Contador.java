import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

            System.out.println(exception.getMessage()); //chama a msg criada para a excessão

        }finally {
            terminal.close();
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm>parametroDois){
           //Elabora mensagem que será exibida na excessão
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            int num =1;
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for(contagem = parametroUm;contagem < parametroDois; contagem++){
                System.out.println("Imprimindo o número "+num+" numero contagem "+contagem);
                num++;
            }

        }


    }
}