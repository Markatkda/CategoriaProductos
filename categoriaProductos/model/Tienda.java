package categoriaProductos.model;

import java.util.ArrayList;

public class Tienda {
	
	/**
	 * Attributes
	 */
	private String nombre;
	private ArrayList<Categoria> listaCategorias;
	
	/**
	 * Constructors
	 * @param nombre
	 * @param listaCategorias
	 */
	public Tienda(String nombre, ArrayList<Categoria> listaCategorias) {
		super();
		this.nombre = nombre;
		this.listaCategorias = listaCategorias;
	}

	public Tienda() {
		super();
	}

	/**
	 * Methods get and set
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	/**
	 * Method toString
	 */
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", listaCategorias=" + listaCategorias + "]";
	}
	
	/**
	 * Metodo que retorna los productos con un precio mayor a 10000
	 * @param i
	 * @param listaPrecios
	 * @return lista de productos que cumplen la condicion
	 */
	
	//se envia i que es el iterador, se envia por parametro para llevar la cuenta en todos los demas metodos
	//se envia la lista vacia que va a contener los productos que cumplan la condicion
	public ArrayList<Producto> buscarPrecio(int i, ArrayList<Producto> listaPrecios){
		
		//caso base: condicion donde el metodo termina 
		if (i == listaCategorias.size()) { //i = 6, size = 6, outofbounds y se sale :D
			//en ese caso retorna la lista
			return listaPrecios;
		} 
		
		//caso recursivo
		else{
			
			listaCategorias.get(i).buscarPrecio2(i, listaPrecios);
			buscarPrecio(i+1, listaPrecios);
		}
		
		return listaPrecios;
	}
	
	/**
	 * Metodo que retorna los productos de color rojo
	 * @param i
	 * @param listaColores
	 * @return
	 */
	public ArrayList<Producto> buscarColor(int i, ArrayList<Producto> listaColores){
		
		if (i == listaCategorias.size()) {
			return listaColores;
			
		} else{
			
			listaCategorias.get(i).buscarColor2(i, listaColores);
			buscarColor(i+1, listaColores);
		}
		
		return listaColores;
	}
 	
}
