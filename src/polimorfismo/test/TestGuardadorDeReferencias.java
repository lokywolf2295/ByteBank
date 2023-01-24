package polimorfismo.test;

import polimorfismo.modelo.Cuenta;
import polimorfismo.modelo.CuentaCorriente;
import polimorfismo.modelo.GuardadorDeReferencias;

public class TestGuardadorDeReferencias {

    public static void main(String[] args) {

        GuardadorDeReferencias guardaReferencias = new GuardadorDeReferencias();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaReferencias.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaReferencias.adicionar(cc2);

        System.out.println(guardaReferencias.obtener(0));
        System.out.println(guardaReferencias.obtener(1));

    }
}
