package polimorfismo.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import polimorfismo.modelo.Cuenta;
import polimorfismo.modelo.CuentaCorriente;

public class TestArrayListEquals {

    public static void main(String[] args) {

        // <> Forzando a que acepte solo un tipo de objeto
// Obligatorio especificar        No es obligatorio
        List<Cuenta> lista = new Vector<Cuenta>();
        // referencia    Objeto -> HEAP
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(13, 42);
        Cuenta cc3 = new CuentaCorriente(11, 22);

        lista.add(cc);
        lista.add(cc2);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        boolean contiene = lista.contains(cc3);
        // Por referencia
        if (contiene) {
            System.out.println("Si, es igual (equals)");
        }

    }
}

