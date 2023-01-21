package polimorfismo;

public class TestConexion {

    public static void main(String[] args) throws Exception{

        try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
//        Conexion con = null; //creo una conexion nulla
//        try {
//            con = new Conexion(); //creamos la conexion
//            con.leerDatos();
//        } catch (IllegalStateException ex) {
//            System.out.println("Recibiendo Conexion");
//            ex.printStackTrace();
//        } finally { //haya o no haya error se ejecuta igual para evitar problemas
//            System.out.println("Ejecutando finally");
//            if (con != null) {
//                con.cerrar();//cerramos la conexion
//            }
//        }

    }
}
