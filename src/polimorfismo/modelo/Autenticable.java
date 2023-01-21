
package polimorfismo.modelo;

public interface Autenticable {
    
    /**
     * una interface es abtracta y tiene todos sus metodos abstractos
     * no puede tener constructores  ni tampoco metodos comunes
     * no puede heredar de otra clase pero si implementar otras interfaces
     */
    
    public void setClave(String clave);

    public boolean iniciarSesion(String clave);
}
