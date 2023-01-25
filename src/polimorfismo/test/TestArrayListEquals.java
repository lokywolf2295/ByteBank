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
        //List<Cliente> listaCLientes = new LinkedList<>();
        
        // Obligatorio especificar        No es obligatorio
        List<Cuenta> lista = new Vector<>();
        // referencia    Objeto -> HEAP
        Cuenta cc = new CuentaCorriente(11, 22);
        Cuenta cc2 = new CuentaCorriente(13, 42);
        Cuenta cc3 = new CuentaCorriente(11, 22);

        lista.add(cc);
        lista.add(cc2);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // Por cada cuenta : lista
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        boolean contiene = lista.contains(cc3);
        // Por referencia
        if (contiene) {
            System.out.println("Si, es igual (equals)");
        }

    }
}

