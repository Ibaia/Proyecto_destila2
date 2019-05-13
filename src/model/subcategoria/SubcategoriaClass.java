	/**

	 * Esta clase contiene los atributos de la base de datos, con getters, setters y 2 contructores uno vacio y el otro lleno 

	 * @author: Ibai Acha

	 * @version: 7/5/2019

	 */
package model.subcategoria;

import model.Connect;

public class SubcategoriaClass extends Connect{

	protected int id;
	protected String nombre;
	protected int id_categoria;

	//----------------------\\
		public SubcategoriaClass() {
		super();
	}
		//----------------------\\

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

		public int getId_categoria() {
			return id_categoria;
		}

		public void setId_categoria(int id_categoria) {
			this.id_categoria = id_categoria;
		}
		
}
