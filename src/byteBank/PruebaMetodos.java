package byteBank;


import byteBank.Cuenta;


public class PruebaMetodos {
    
    public static void main (String[] args) {
        //creamos una cuenta
        Cuenta miCuenta = new Cuenta();
        miCuenta.setSaldo(500);
        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());

        boolean puedeRetirar = miCuenta.retirar(500);
        if(puedeRetirar) { //verifica si se puede o no retirar dinero
            System.out.println("El retiro se realizó con exito su saldo es: " + miCuenta.getSaldo());
        } else {
            System.out.println("Su Saldo es Insuficiente para realizar esta operación");
        }
        
        //creamos una segunda cuenta
        Cuenta cuentaDeZoe = new Cuenta();
        cuentaDeZoe.depositar(1000);

        boolean puedeTransferir = cuentaDeZoe.transferir(300, miCuenta);
        if(puedeTransferir) { //verifica si se puede o no realizar transferencias
            System.out.println("La transferencia se realizó con exito su Saldo actual es: " + cuentaDeZoe.getSaldo());
        } else {
            System.out.println("Su Saldo es Insuficiente para realizar esta operación");
        }
    }
}
