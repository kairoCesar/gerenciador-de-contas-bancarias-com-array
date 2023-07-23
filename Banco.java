import java.util.ArrayList;
import java.util.Arrays;

public class Banco {

    // Tem que inicializar o array
    ContaBancaria[] contasBancarias = new ContaBancaria[0];

    void adicionarContaBancaria(ContaBancaria contaBancaria) {
        contasBancarias = Arrays.copyOf(contasBancarias, contasBancarias.length + 1);
        contasBancarias[contasBancarias.length - 1] = contaBancaria;
    }

    void removerContaBancaria(int numeroDaConta) {
        Integer indiceParaRemocao = null;
        for (int i = 0; i < contasBancarias.length; i++) {
            if (contasBancarias[i].numero == numeroDaConta) {
                indiceParaRemocao = i;
            }
        }

        ContaBancaria[] newContasBancarias = new ContaBancaria[contasBancarias.length - 1];

        System.arraycopy(contasBancarias, 0, newContasBancarias, 0, indiceParaRemocao);
        System.arraycopy(contasBancarias, indiceParaRemocao + 1, newContasBancarias, indiceParaRemocao, newContasBancarias.length - indiceParaRemocao);
        contasBancarias = Arrays.copyOf(newContasBancarias, newContasBancarias.length);
    }

    void pesquisarContaBancaria(int numeroDaConta) {
        for (ContaBancaria contasBancaria : contasBancarias) {
            if (contasBancaria.numero == numeroDaConta) {
                System.out.printf("Número da conta: %d%nTitular: %s%nSaldo: %.2f%n",
                        contasBancaria.numero, contasBancaria.nomeDoTitular, contasBancaria.saldo);
            }


        }
    }

    void exibirTodasAsContas() {
        for (ContaBancaria contasBancaria : contasBancarias) {
            System.out.printf("A conta número %d, do titular %s, está cadastrada neste banco e possuí " +
                    "saldo de R$%.2f%n", contasBancaria.numero, contasBancaria.nomeDoTitular, contasBancaria.saldo);
        }
    }

    void exibirSaldoTotalDeTodasAsContas() {
        double saldoTotal = 0;
        for (ContaBancaria contasBancaria : contasBancarias) {
            saldoTotal += contasBancaria.saldo;
        }
        System.out.printf("Saldo total de todas as contas: R$ %.2f", saldoTotal);
    }


}
