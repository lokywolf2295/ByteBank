
package polimorfismo.test;

import java.util.ArrayList;
import polimorfismo.modelo.Cuenta;
import polimorfismo.modelo.CuentaCorriente;

public class TestArrayList {

    public static void main(String[] args) {

		// <> Forzando a que acepte solo un tipo de objeto
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);

		lista.add(cc);
		lista.add(cc2);

//		Cliente cliente = new Cliente(); //al castear ya no pueden ingresarse objetos de otras clases
//		lista.add(cliente);

		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Por cada cuenta en la lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		boolean contiene = lista.contains(cc3);
		if (contiene) {
			System.out.println("Si");
		}

	}
}
