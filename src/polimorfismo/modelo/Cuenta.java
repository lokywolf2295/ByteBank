package polimorfismo.modelo;

/**
 * Clase que representa a una cuenta en ByteBank
 *
 * @autor Matias
 * @version 0.1
 */
public abstract class Cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente(); //ahora titular es un objeto de la clase Cliente

    private static int total; //esta variable depende unicamente de la clase y no de la instancia

    /**
     * Constructor para inicializar el objeto Cuenta a partir da agencia y
     * numero
     *
     * @param agencia
     * @param numero
     */
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

    /**
     * el metodo abstracto depositar resive un valor
     *
     * @param valor
     */
    public abstract void depositar(double valor);

    /**
     * el metodo retirar pemite restar valor a la cuenta seleccionada valor
     * necesita ser menor o igual al saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void retirar(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteExeption("No tienes Saldo Insuficiente");
        }
        this.saldo -= valor;
    }

    /**
     * este metodo permite seleccionar una cuenta y el monto que se desea enviar
     *
     * @param valor
     * @param destino
     * @return un booleano
     */
    public boolean transferir(double valor, Cuenta destino) {
        if (this.saldo >= valor) {
            this.retirar(valor);
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    /**
     * modificamos el metodo toString para poder imprimir la agencia y no su
     * espacio en memora
     *
     * @return cuenta
     */
    @Override
    public String toString() {
        String cuenta = "Numero: " + this.numero + ", Agencia:" + this.agencia;
        return cuenta;
    }

    @Override
    public boolean equals(Object obj) {
        // Basada en valores
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia() && 
    			this.numero == cuenta.getNumero();
    }

}
