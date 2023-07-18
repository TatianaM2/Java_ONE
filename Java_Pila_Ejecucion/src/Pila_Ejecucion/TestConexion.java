package Pila_Ejecucion;

public class TestConexion {
	
	public static void main(String[] args) throws Exception  {
		Conexion con = null;
		try (Conexion conexion = new Conexion()){
			conexion.leerDatos();
		} catch(IllegalStateException ex){
		        System.out.println("Surgió un error en la conexión ");
		}
		
//		Conexion con = null;
//		try {
//			con = new Conexion();
//			con.leerDatos();
//		} 
//		catch (IllegalStateException ex) {
//			ex.printStackTrace();
//		}
//		finally {
//			System.out.println("Ejecutando finally");
//			if (con != null) {
//				con.cerrar();
//			}
//		} 
		

		
	}

}
