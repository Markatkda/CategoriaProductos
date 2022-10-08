package categoriaProductos.model;

import java.util.ArrayList;

public class Producto {
	
	/**
	 * Attributes
	 */
	private String nombre;
	private String color;
	private double precio;
	
	/**
	 * Constructors
	 * @param nombre
	 * @param color
	 * @param precio
	 */
	public Producto(String nombre, String color, double precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}
	
	public Producto() {
		super();
	}

	/**
	 * Methods get and set
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public String getColor() {
		return color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Method toString
	 */
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", color=" + color + ", precio=" + precio + "]";
	}

	/**
	 * Metodo que compara el precio con el valor necesitado y en caso de ser cierto lo agrega a la listaPrecios
	 * que guarda los articulos que cumplan la condicion
	 * @param i
	 * @param listaPrecios
	 */
	public void buscarPrecio3(int i, ArrayList<Producto> listaPrecios) {
		
		double valor = 10000;
		
		if (precio > valor) {
			listaPrecios.add(this);
			
		}
	}
	
	/**
	 * Metodo que compara el color con el color necesitado y en caso de ser cierto lo agrega a la listaColores
	 * que guarda los articulos que cumplan la condicion
	 * @param i
	 * @param listaColor
	 */
	public void buscarColor3(int i, ArrayList<Producto> listaColor){
		
		String valor = "rojo";
		
		if (color.equalsIgnoreCase(valor)) {
			
			listaColor.add(this);
			
		}
	}

}
