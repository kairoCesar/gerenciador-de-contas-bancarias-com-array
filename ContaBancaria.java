public class ContaBancaria {

    int numero;
    String nomeDoTitular;
    double saldo;

    void depositarValor(double valorDeposito) {
        saldo += valorDeposito;
    }

    void sacarValor (double valorSaque) {
        saldo -= valorSaque;
    }

    void consultarSaldo() {
        System.out.printf("Saldo da conta %d: R$%.2f (%s)%n", numero, saldo, nomeDoTitular);
    }
}
