package exercicio01;

public class Conta {
    // atributos ou propriedades ou variáveis de instância
    String correntista;
    int numero;
    double saldo;

    // metodo para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // metodo para sacar um valor da conto
    public void sacar(double valor) {
        saldo -= valor;
    }
}