package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.factura.FacturaModel;

import java.io.PrintWriter;

/**
 * Servlet implementation class CverFacturas
 */
@WebServlet("/CVerFacturas")
public class CVerFacturas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CVerFacturas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id"));
		//String carrito='[{nombre":"Cerveza Duff","cantidad":"1","precio":2.7},{"nombre":"Buitral Fresa","cantidad":"1","precio":14.5}]';
		String carrito=request.getParameter("carrito");
		
		
		FacturaModel factura =new FacturaModel();
		factura.selectedFactura(id);
		
		
		request.setAttribute("factura", factura.getFactura());
		request.getRequestDispatcher("view/vFactura.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
