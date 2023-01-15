package byteBank;

public class TestCuentaConCliente {
    public static void main(String[] args) {
        Cliente diego = new Cliente(); //creamos un objeto de la clase cliente y cargamos sus datos
        diego.setNombre("Diego Rojas");
        diego.setDocumento("33442211");
        diego.setTelefono("987654321");

        Cuenta cuentaDeDiego = new Cuenta(12, 96532);//creamos un objeto de la clase cuenta y le depositamos dinero
        cuentaDeDiego.depositar(100);

        cuentaDeDiego.setTitular(diego); //a la cuenta le pasamos los datos del titular y luego accedemos a ellos
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
}
