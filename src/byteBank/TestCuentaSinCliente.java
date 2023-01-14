package byteBank;

public class TestCuentaSinCliente {
    
    public static void main(String[] args) {
        Cuenta cuentaDeJimena = new Cuenta();
        System.out.println(cuentaDeJimena.getSaldo());

        cuentaDeJimena.setTitular(new Cliente());//si no creamos un objeto cliente de la clase cuenta no dará un NullPointerException

        System.out.println(cuentaDeJimena.getTitular());

        cuentaDeJimena.getTitular().setNombre("Jimena");
        System.out.println(cuentaDeJimena.getTitular().getNombre());
    }
}
