package polimorfismo;

public class Gerente extends Funcionario implements Autenticable { //extiende de la clase funcionario
    //es decir que gerente ES UN funcionario //en java no existe la herencia multiple es decir que solo se hereda de un padre
    //se pueden implementar muchas interfaces pero solo extender de una sola clase

    //los metodos y objetos creados en las clases hijas no afectan a las clases padres
    // Sobre-escritura de metodo
    public double getBonificacion() { //sobreescribimos el metodo utilizando la palabra super
        //super permite la utilización de metodos de la clase padre aunque sean privadas.
        System.out.println("Llamando metodo del Gerente"); //mensaje solo para verificar la ejecucion desde gerente
        return 2000;
    }

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

}
