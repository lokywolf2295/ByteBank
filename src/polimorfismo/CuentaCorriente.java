package polimorfismo;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void retirar(double valor) { //modificamos el metodo retirar de la clase padre mediante la notacion Override
		double comision = 0.2;
		super.retirar(valor + comision);
                
	}
        
        @Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

  
}
