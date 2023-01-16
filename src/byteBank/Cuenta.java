package byteBank;

public class Cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente(); //ahora titular es un objeto de la clase Cliente

    private static int total; //esta variable depende unicamente de la clase y no de la instancia

    public Cuenta(int agencia, int numero) { //al momento de crear la instancia requerirá obligatoriamente la agencia y recibe el total como parametro
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    public static int getTotal() {
        return Cuenta.total;
    }

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
            this.retirar(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
