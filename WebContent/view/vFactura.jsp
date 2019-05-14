<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.factura.*" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Factura</title>
</head>
<body>
<% ArrayList<FacturaClass> factura = (ArrayList<FacturaClass>)request.getAttribute("factura"); %>

<div class="container">

<% for(int i=0;i< factura.size();i++){%>
	<div><%=factura.get(i).getComprador() %></div>
	<div><%=factura.get(i).getProductos() %></div>
	<div><%=factura.get(i).getCantidadTot() %></div>
	<div><%=factura.get(i).getPrecioTot() %></div>
	<div><%=factura.get(i).getFecha_compra() %></div>
	<div><%=factura.get(i).getId() %></div>

<%} %>
</div>
</body>
</html>