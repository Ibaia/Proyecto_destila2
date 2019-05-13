package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.producto.ProductModel;

/**
 * Servlet implementation class CEjecutarAñadir
 */
@WebServlet("/CEjecutarAñadir")
public class CEjecutarAñadir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CEjecutarAñadir() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("nombre");
		int categoria=Integer.parseInt(request.getParameter("categoria"));
		Double precio=Double.parseDouble(request.getParameter("precio"));
		String img=request.getParameter("img");
		String descripcion=request.getParameter("descripcion");
		
		ProductModel myProduct=new ProductModel();
		myProduct.setNombre(nombre);
		myProduct.setId_categoria(categoria);
		myProduct.setPrecio(precio);
		myProduct.setImg(img);
		myProduct.setDescripcion(descripcion);
		
		String mensaje=myProduct.aniadirProducto();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
