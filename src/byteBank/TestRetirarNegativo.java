package byteBank;

public class TestRetirarNegativo {
     public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(2, 3216);
        //cuenta.deposita(100); //si depositamos 100 sin el metodo set esto no se puede
        System.out.println(cuenta.retirar(200)); //si intentamos retirar mas del saldo que tenemos no se permite
        System.out.println(cuenta.getSaldo());

        // prohibido (solucionado)
        // cuenta.saldo = cuenta.saldo - 101; //si las variables no son privadas, entonces podemos asicgarle saldos negativos cosa que no tienen que pasar.
    }
}
