public class Main {
    public static void main(String[] args) {
        Banco bancoBCC = new Banco();

        ContaBancaria contaDoKairo = new ContaBancaria();
        contaDoKairo.numero = 45856;
        contaDoKairo.nomeDoTitular = "Kairo César";
        contaDoKairo.depositarValor(8000.00);
        bancoBCC.adicionarContaBancaria(contaDoKairo);


        ContaBancaria contaDaMaria = new ContaBancaria();
        contaDaMaria.nomeDoTitular = "Jonh Wick";
        contaDaMaria.numero = 47856;
        contaDaMaria.depositarValor(7500.45);
        bancoBCC.adicionarContaBancaria(contaDaMaria);

        ContaBancaria contaDaLaura = new ContaBancaria();
        contaDaLaura.nomeDoTitular = "Laura Silva";
        contaDaLaura.numero = 44857;
        contaDaLaura.depositarValor(1500.56);
        bancoBCC.adicionarContaBancaria(contaDaLaura);

        bancoBCC.removerContaBancaria(45856);



        bancoBCC.exibirTodasAsContas();



    }
}