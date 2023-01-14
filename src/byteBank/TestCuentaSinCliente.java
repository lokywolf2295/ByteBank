package byteBank;

public class TestCuentaSinCliente {
    
    public static void main(String[] args) {
        Cuenta cuentaDeJimena = new Cuenta();
        System.out.println(cuentaDeJimena.saldo);

        cuentaDeJimena.titular = new Cliente();//si no creamos un objeto cliente de la clase cuenta no dará un NullPointerException

        System.out.println(cuentaDeJimena.titular);

        cuentaDeJimena.titular.nombre = "Jimena";
        System.out.println(cuentaDeJimena.titular.nombre);
    }
}
