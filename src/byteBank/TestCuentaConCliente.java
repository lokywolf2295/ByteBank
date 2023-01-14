package byteBank;

public class TestCuentaConCliente {
    public static void main(String[] args) {
        Cliente diego = new Cliente(); //creamos un objeto de la clase cliente y cargamos sus datos
        diego.nombre = "Diego Rojas";
        diego.documento = "33442211";
        diego.telefono = "987654321";

        Cuenta cuentaDeDiego = new Cuenta();//creamos un objeto de la clase cuenta y le depositamos dinero
        cuentaDeDiego.depositar(100);

        cuentaDeDiego.titular = diego; //a la cuenta le pasamos los datos del titular y luego accedemos a ellos
        System.out.println(cuentaDeDiego.titular.nombre);
    }
}
