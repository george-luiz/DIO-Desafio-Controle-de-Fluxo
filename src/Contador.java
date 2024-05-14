public class Contador {
    private int primeiroNumero;
    private int segundoNumero;

    Contador(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public void imprimi() throws ParametrosInvalidosException{

        int soma = segundoNumero - primeiroNumero;

        if(primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 1; i <= soma; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
