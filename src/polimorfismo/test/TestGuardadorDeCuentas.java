package polimorfismo.test;

import polimorfismo.modelo.Cuenta;
import polimorfismo.modelo.CuentaCorriente;
import polimorfismo.modelo.GuardadorDeCuentas;

public class TestGuardadorDeCuentas {

    public static void main(String[] args) {

        GuardadorDeCuentas guardaCuentas = new GuardadorDeCuentas();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaCuentas.adicionar(cc2);

        System.out.println(guardaCuentas.obtener(0));
        System.out.println(guardaCuentas.obtener(1));

    }
}
