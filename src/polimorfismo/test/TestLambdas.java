package polimorfismo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import polimorfismo.modelo.Cliente;
import polimorfismo.modelo.Cuenta;
import polimorfismo.modelo.CuentaAhorros;
import polimorfismo.modelo.CuentaCorriente;

public class TestLambdas {

    public static void main(String[] args) {

        Cuenta cc1 = new CuentaCorriente(62, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Diego");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Cuenta cc2 = new CuentaAhorros(32, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Renato");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Cuenta cc3 = new CuentaCorriente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Liam");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Cuenta cc4 = new CuentaAhorros(2, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Noel");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("\nAntes de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        //Función Lambda  versión corta: se suele utilizar cuando tenemos solo una linea de codigo
        lista.sort((c1, c2) //se quitan los tipo de referencia las llaves y hasta el return
            -> Integer.compare(c1.getNumero(), c2.getNumero())
        );//fin del método

        System.out.println("\nDespues de ordenar");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        //Función Lambda  versión larga: se suele utilizar cuando tenemos mas de una linea de codigo
        Comparator<Cuenta> comp = (Cuenta c1, Cuenta c2) -> {
            String nombreC1 = c1.getTitular().getNombre();
            String nombreC2 = c2.getTitular().getNombre();
            return nombreC1.compareTo(nombreC2);
        };

        System.out.println("\nDespues de ordenar por nombre titular");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }

        Collections.sort(lista);

        //Orden Natural (implementado desde la clase cuenta)
        System.out.println("\nDespues de ordenar por orden natural");
        for (Cuenta cuenta : lista) {
            System.out.println(cuenta);
        }
        
        //Impresion mediante metodo lambda 
        System.out.println("\nImpresión con Lambda");
        lista.forEach( (cuenta) -> System.out.println(cuenta ));
    }

}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        // Forma Wrapper
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }

}

class OrdenadorPorNombreTitular implements Comparator<Cuenta> {

    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return o1.getTitular().getNombre()
                .compareTo(o2.getTitular().getNombre());
    }

}
