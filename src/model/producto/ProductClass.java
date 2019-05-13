	/**

	 * Esta clase contiene los atributos de la base de datos, con getters, setters y 2 contructores uno vacio y el otro lleno 

	 * @author: Ibai Acha

	 * @version: 7/5/2019

	 */
package model.producto;

import model.Connect;

public class ProductClass extends Connect{


	protected int id;
	protected String nombre;
	protected String descripcion;
	protected String img;
	protected double precio;
	protected int id_categoria;
	
	public ProductClass() {
		super();
	}
	
	public ProductClass(int id, String nombre, String descripcion, String img, double precio, int id_categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.img = img;
		this.precio = precio;
		this.id_categoria = id_categoria;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	
}
