 $(document).ready(function(){
     
     $.getJSON("http://localhost:8080/Proyecto_destilado2/CProductos").done(function (response){
     	console.log(response);
     	
     	//var productos= response;
     	
     	var html = "";
     	
     	for (var index = 0; index < response.length; index++) {
				const producto= response[index];
				
				  html += '<p>'
				  html += '<label>'
				  html += '<input class="with-gap" name="selected" type="radio" value="'+producto.id+'"/>'
				  html += '<span>'+ producto.nombre +'</span>'
				  html += '</label>'
				  html += '</p>'
			}
     	html += '<button type="submit" class="modal-close waves-effect waves-green btn-flat">Submit</button>'
     		
     	$('#selectNombres').html(html);
     })
 });