package categoriaProductos.test;

import java.util.ArrayList;
import categoriaProductos.model.Categoria;
import categoriaProductos.model.Producto;
import categoriaProductos.model.Tienda;

public class Prueba {

	public static void main(String[] args) {
		
		ArrayList<Producto> listaPrecios = new ArrayList<Producto>();
		
		ArrayList<Producto> listaColores = new ArrayList<Producto>();
	
		
		ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
		
		Tienda tienda = new Tienda("Don pedro", listaCategorias);
		
		
		ArrayList<Categoria> listaCategorias1 = new ArrayList<Categoria>();

		ArrayList<Producto> listaProductos1 = new ArrayList<Producto>();
		
		Categoria hogar = new Categoria("Hogar", listaCategorias1, listaProductos1);
		
		
		ArrayList<Categoria> listaCategorias2 = new ArrayList<Categoria>();
		
		ArrayList<Producto> listaProductos2 = new ArrayList<Producto>();
		
		Categoria tecnologia = new Categoria("Tecnologia", listaCategorias2, listaProductos2);
		
		
		ArrayList<Categoria> listaCategorias3 = new ArrayList<Categoria>();
		
		ArrayList<Producto> listaProductos3 = new ArrayList<Producto>();
		
		Categoria celulares = new Categoria("Celulares", listaCategorias3, listaProductos3);
		
		
		ArrayList<Producto> listaProductos4 = new ArrayList<Producto>();
		
		Categoria antiguos = new Categoria("Antiguos", listaProductos4);
		
		
		Producto cama = new Producto("Cama", "Negro", 400000);
		Producto mueble = new Producto("Mueble", "Rojo", 300000);
		Producto laptop = new Producto("Laptop", "Gris", 1000000);
		Producto lampara = new Producto("Lampara", "Rojo", 8000);
		Producto motorola = new Producto("Motorola", "Azul", 1000);
		Producto samsung = new Producto("Samsung", "Rojo", 6000);
		Producto alcatel = new Producto("Alcatel", "Rojo", 100000);
		Producto blackberry = new Producto("Blackberry", "Negro", 200000);
		
		
		listaCategorias.add(hogar);
		
		listaProductos1.add(cama);
		listaProductos1.add(mueble);
		
		listaCategorias1.add(tecnologia);
		
		listaProductos2.add(laptop);
		listaProductos2.add(lampara);
		
		listaCategorias2.add(celulares);
		
		listaProductos3.add(motorola);
		listaProductos3.add(samsung);
		
		listaCategorias3.add(antiguos);
		
		listaProductos4.add(alcatel);
		listaProductos4.add(blackberry);
		
		
		tienda.buscarPrecio(0, listaPrecios);
		System.out.println("Primer punto: " + listaPrecios + "\n");
		
		tienda.buscarColor(0, listaColores);
		System.out.println("Segundo punto: " + listaColores);
		
		
	
	}

}
