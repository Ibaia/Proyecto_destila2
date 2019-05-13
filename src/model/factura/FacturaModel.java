	/**

	 * Esta clase contiene una arrayList de un clase para almacenar los datos  y metodos

	 * @author: Ibai Acha

	 * @version: 7/5/2019

	 */
package model.factura;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.subcategoria.SubcategoriaModel;

public class FacturaModel extends FacturaClass{

	ArrayList<FacturaClass> Factura =new ArrayList<FacturaClass>();
	

	public FacturaModel() {
		super();
	}

	public FacturaModel(ArrayList<FacturaClass> factura) {
		super();
		Factura = factura;
	}

	public ArrayList<FacturaClass> getFactura() {
		return Factura;
	}


	public void setFactura(ArrayList<FacturaClass> factura) {
		Factura = factura;
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
			ResultSet rs = st.executeQuery("SELECT * FROM factura");

			while (rs.next()) // reads the table line by line
			{
				FacturaModel newD = new FacturaModel();
				newD.id=Integer.parseInt(rs.getString("id"));
				newD.cantidadTot=Integer.parseInt(rs.getString(2));
				newD.precioTot=Integer.parseInt(rs.getString(3));
				
				//newD.productos=rs.getString(4);
				newD.fecha_compra=rs.getDate("fecha_compra");
				newD.comprador=rs.getString(6);
				
				
				this.Factura.add(newD);
			
			} 
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.disconnect();
	}
	
}
