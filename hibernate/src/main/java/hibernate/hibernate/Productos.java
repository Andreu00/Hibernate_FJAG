package hibernate.hibernate;
// Generated 24 feb 2024 19:35:03 by Hibernate Tools 6.3.1.Final

/**
 * Productos generated by hbm2java
 */
public class Productos implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private double precio;

	public Productos() {
	}

	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
