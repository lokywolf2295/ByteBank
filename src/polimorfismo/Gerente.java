package polimorfismo;

public class Gerente extends Funcionario { //extiende de la clase funcionario
    //es decir que gerente ES UN funcionario
    
    //los metodos y objetos creados en las clases hijas no afectan a las clases padres

    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

//    public double getBonificacion() {
//        return this.salario;
//    }

    public boolean iniciarSesion(String clave) {
        if(this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}
