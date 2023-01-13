
public class Cuenta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    //no retorna un valor
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    //retorna un valor booleano
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
