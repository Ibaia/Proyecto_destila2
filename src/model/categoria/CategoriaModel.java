	/**

	 * Esta clase contiene una arrayList de un clase para almacenar los datos y metodos  

	 * @author: Ibai Acha

	 * @version: 7/5/2019

	 */
package model.categoria;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.subcategoria.SubcategoriaModel;

public class CategoriaModel extends CategoriaClass{

	ArrayList<CategoriaClass> categoria =new ArrayList<CategoriaClass>();
	
	
	public ArrayList<CategoriaClass> getCategoria() {
		return categoria;
	}


	public void setCategoria(ArrayList<CategoriaClass> categoria) {
		this.categoria = categoria;
	}

 //-----Method------\\
	public CategoriaModel() {
		super();
	}


	public CategoriaModel(int id, String nombre, ArrayList<CategoriaClass> categoria) {
		super(id, nombre);
		this.categoria = categoria;
	}

	 /**
	  *  Carga los datos de categorias 
	  */
	public void loadData()
	{
		this.createConnection();
		
		Statement st;
		try {
			
			st = this.con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM categorias ");

			while (rs.next()) // reads the table line by line
			{
				CategoriaModel newC = new CategoriaModel();
				
				newC.id=Integer.parseInt(rs.getString("id"));
				newC.nombre=rs.getString("nombre");
				
				this.categoria.add(newC);
			
			} 
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.disconnect();
	}
}
