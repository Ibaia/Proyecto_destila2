	/**

	 * Esta clase contiene los atributos de la base de datos, con getters, setters y 2 contructores uno vacio y el otro lleno 

	 * @author: Ibai Acha

	 * @version: 7/5/2019

	 */
package model.factura;

import java.util.ArrayList;
import java.util.Date;

import model.Connect;

public class FacturaClass extends Connect{

	protected int id;
	protected int cantidadTot;
	protected double precioTot;
	protected ArrayList productos;
	protected Date fecha_compra;
	protected String comprador;
	
	//----------------------\\
	public FacturaClass() {
		super();
	}

	public FacturaClass(int id, int cantidadTot, double precioTot, ArrayList productos, Date fecha_compra,
			String comprador) {
		super();
		this.id = id;
		this.cantidadTot = cantidadTot;
		this.precioTot = precioTot;
		this.productos = productos;
		this.fecha_compra = fecha_compra;
		this.comprador = comprador;
	}


	//----------------------\\
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadTot() {
		return cantidadTot;
	}

	public void setCantidadTot(int cantidadTot) {
		this.cantidadTot = cantidadTot;
	}

	public double getPrecioTot() {
		return precioTot;
	}

	public void setPrecioTot(double precioTot) {
		this.precioTot = precioTot;
	}

	public ArrayList getProductos() {
		return productos;
	}

	public void setProductos(ArrayList productos) {
		this.productos = productos;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public String getComprador() {
		return comprador;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}


	
}
