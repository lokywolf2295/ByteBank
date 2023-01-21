package polimorfismo.modelo;

public class AutenticacionUtil {
    //esta clase permite evitar el acoplamiento, es decir crea metodos que son
    //utilizados por varias clases sin ser propias de la clase y evitar repetir codigo
    
    private String clave;

	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
}
