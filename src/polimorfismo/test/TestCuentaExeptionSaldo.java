package polimorfismo.test;

import polimorfismo.modelo.Cuenta;
import polimorfismo.modelo.CuentaAhorros;

public class TestCuentaExeptionSaldo {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros (123, 456) ;
        cuenta.depositar (200) ;
        cuenta.retirar (210);
    }
}
