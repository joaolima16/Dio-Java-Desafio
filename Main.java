public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João");
        ContaCorrente cc = new ContaCorrente(joao);
        ContaPoupanca cp = new ContaPoupanca(joao);
        cc.depositar(1500);
        cp.depositar(3000);
        cc.transferir(400, cp);
        cc.imprimirInfos();
    }
}
