
package polimorfismo;

public class Contador extends Funcionario{
    
    @Override
	public double getBonificacion() {
		System.out.println("Llamando metodo del Contador");
		return super.getBonificacion();
	}
}
