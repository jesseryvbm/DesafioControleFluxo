import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.close();

        try {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = 1; i <= (parametroDois - parametroUm); i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
 
}
