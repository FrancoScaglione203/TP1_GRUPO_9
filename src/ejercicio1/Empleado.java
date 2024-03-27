package ejercicio1;

public class Empleado
{
	 private int id;
	 private String nombre;
	 private int edad;
	 private boolean estado;

	 public Empleado()
	 {
		 this.nombre = "sin nombre";
		 this.edad = 99;
		 this.estado = true;
	 }
	 
	 public Empleado(String nombre, int edad)
	 {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.estado = true;
	 }
}
