import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        var leitura = new Scanner(System.in);

        System.out.println("Digite o primerio número?");
        int primeiroNumero = leitura.nextInt();

        System.out.println("Digite o segundo número?");
        int segundoNumero = leitura.nextInt();

        leitura.close();
        try {
            var contador = new Contador(primeiroNumero, segundoNumero);
            contador.imprimi();
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
