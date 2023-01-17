/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

import byteBank.Cuenta;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean retirar(double valor) { //modificamos el metodo retirar de la clase padre mediante la notacion Override
		double comision = 0.2;
		return super.retirar(valor + comision);
                
	}
        
        @Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
}
