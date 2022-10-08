package categoriaProductos.model;

import java.util.ArrayList;

public class Categoria {
	
	/**
	 * Attributes
	 */
	private String nombre;
	private ArrayList<Categoria> listaCategorias;
	private ArrayList<Producto> listaProductos;
	
	/**
	 * Constructors
	 * @param nombre
	 * @param listaCategorias
	 * @param listaProductos
	 */
	public Categoria(String nombre, ArrayList<Categoria> listaCategorias, ArrayList<Producto> listaProductos) {
		super();
		this.nombre = nombre;
		this.listaCategorias = listaCategorias;
		this.listaProductos = listaProductos;
	}
	
	public Categoria(String nombre, ArrayList<Producto> listaProductos) {
		super();
		this.nombre = nombre;
		this.listaProductos = listaProductos;
	}

	public Categoria() {
		super();
	}

	/**
	 * Method get and set
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	/**
	 * Method toString
	 */
	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", listaCategorias=" + listaCategorias + ", listaProductos="
				+ listaProductos + "]";
	}


	/**
	 * Metodo recursivo que encuentra los productos con un precio mayor a 10000
	 * @param i
	 * @param listaPrecios
	 * @return
	 */
	public ArrayList<Producto> buscarPrecio2(int i, ArrayList<Producto> listaPrecios){ 
		
		if (i == listaProductos.size()) {
			
			return listaPrecios;
		} else{
			
			listaProductos.get(i).buscarPrecio3(i, listaPrecios);
		}
		
		if (this.getListaCategorias() != null) {
			
			if (i == listaCategorias.size()) {
				
				return listaPrecios;
			}
			else{
				
			listaCategorias.get(i).buscarPrecio2(i, listaPrecios);
			}
		}
		
		buscarPrecio2(i+1, listaPrecios);
		
		return listaPrecios;
	}

	/**
	 * Metodo recursivo que encuentra los productos con color rojo
	 * @param i
	 * @param listaColores
	 * @return
	 */
	public ArrayList<Producto> buscarColor2(int i, ArrayList<Producto> listaColores){
		
		if (i == listaProductos.size()) {
			return listaColores;
			
		} else{
			
			listaProductos.get(i).buscarColor3(i+1, listaColores);
		}
		
		if (this.getListaCategorias() != null) {
		
			if (i == listaCategorias.size()) {
				
				return listaColores;
			}
			else{
				
			listaCategorias.get(i).buscarColor2(i, listaColores);
			}
		}
		
		buscarColor2(i+1, listaColores);
		
		return listaColores;
	}
	
}
