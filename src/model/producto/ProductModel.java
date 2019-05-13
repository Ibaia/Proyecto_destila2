	/**

	 * Esta clase contiene una arrayList de un clase para almacenar los datos y metodos

	 * @author: Ibai Acha

	 * @version: 7/5/2019

	 */
package model.producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

import model.subcategoria.SubcategoriaModel;



public class ProductModel extends ProductClass{

	ArrayList<ProductClass> producto =new ArrayList<ProductClass>();
	
	public ProductModel() {
		super();
	}

	public ProductModel(int id, String nombre, String descripcion, String img, double precio, int id_categoria,
			ArrayList<ProductClass> producto) {
		super(id, nombre, descripcion, img, precio, id_categoria);
		this.producto = producto;
	}

	public ArrayList<ProductClass> getProducto() {
		return producto;
	}

	public void setProducto(ArrayList<ProductClass> producto) {
		this.producto = producto;
	}

	/**
	 * Carga los datos de los productos
	 */
	public void loadData()
	{
		this.createConnection();
		
		Statement st;
		try {
			
			st = this.con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM productos");

			while (rs.next()) // reads the table line by line
			{
				ProductClass newD = new ProductClass();
				
				newD.id=Integer.parseInt(rs.getString("id"));
				newD.nombre=rs.getString("nombre");
				newD.descripcion=rs.getString("descripcion");
				newD.img=rs.getString("img");
				newD.precio=Double.parseDouble(rs.getString("precio"));
				newD.id_categoria=Integer.parseInt(rs.getString("id_categoria"));
				
				
				this.producto.add(newD);
			
			} 
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.disconnect();
	}

	/**
	 * Pasando el id del producto te permite modificar el producto
	 */
	public void editarProducto(int id) 
		{
			this.createConnection();
			
			String mensaje="";
			PreparedStatement pst;
			try {
				pst = this.con.prepareStatement("UPDATE productos " 
												+ " SET nombre=?,  "
												+" descripcion=? ,  "
												+" img=?  "
												+" precio=? , " 
												+" WHERE productos.id=?");

				pst.setInt(1, this.id);
				pst.setString(3, this.nombre);
				pst.setString(3, this.descripcion);
				pst.setString(4, this.img);
				pst.setDouble(5, this.precio);
				pst.setInt(6, this.id_categoria);
					
				pst.execute();
				
				 
			}catch (SQLException e) {
				
				e.printStackTrace();
			}
			this.disconnect();
		}

	/**
	 * Selecciona un producto por id
	 */
	public Object selectedProduct(int id) {
		
		Statement st;
		try {
			st = this.con.createStatement();	
			ResultSet rs = st.executeQuery("SELECT * FROM productos"
											+ " WHERE  id = "+"'"+id+"'");
			
			while (rs.next()){
				
				ProductClass producto = new ProductClass();
				
				producto.setId(rs.getInt("id"));
				producto.setNombre(rs.getString("nombre"));
				producto.setDescripcion("descripcion");
				producto.setImg(rs.getString("img"));
				producto.setPrecio(rs.getDouble("precio"));
				producto.setId_categoria(rs.getInt("id_categoria"));
				
				this.producto.add(producto);
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * Añade un producto a la base de datos
	 */
	public String aniadirProducto() {
		String mensaje="";
		PreparedStatement pst;
		try {
			pst = this.con.prepareStatement("INSERT INTO productos (nombre, id_categoria, precio, img, descripcion)"
					+ " VALUES (?,?,?,?,?)");
			
			pst.setString(1, this.nombre);
			pst.setInt(2, this.id_categoria);
			pst.setDouble(3, this.precio);
			pst.setString(4, this.img);
			pst.setString(5, this.descripcion);
			
			
			pst.execute();
			mensaje="Bebida alcoholica insertada en la BD";
			
		} catch (SQLException e) {
			
			mensaje="No se ha insertado la bebida alcoholica en la Base de datos";
		}
		return mensaje;
	}
}
