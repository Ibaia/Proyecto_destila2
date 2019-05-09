<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- Compiled and minified CSS -->
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css'>
    <link rel='stylesheet' href='css/main.css'>
    <title>Admin</title>
</head>
<body>  
    <div class="container">
        <h1 class="col-12 center-align">Destila2</h1>
        <div class="row cuerpo">

                <div class="col s12 botones">
                    <a class="waves-effect waves-light btn-large modal-trigger col s12"  href="#modalAniadir" >Aniadir producto</a>
    
                    <div id="modalAniadir" class="modal">
                        <div class="modal-content">
                            <h4>Aniadir producto</h4>
                            <form>
       	 					<div class="row">
            					<div class="input-field col s12">
            					<input placeholder="Placeholder" id="first_name" type="text" class="validate">
            					<label for="first_name">Nombre </label>
            					</div>
        					</div>

        					<div class="row">
            					<div class="input-field col s12">
                    			<select>
                      				<option value="" disabled selected>Choose your option</option>
                      				<option value="1">Option 1</option>
                      				<option value="2">Option 2</option>
                      				<option value="3">Option 3</option>
                    			</select>
                    			<label>Materialize Select</label>
                  				</div>
        					</div>

        					<div class="row">
            					<div class="input-field col s12">
            						<input placeholder="Placeholder" id="first_name" type="text" class="validate">
            						<label for="first_name">Precio</label>
            					</div>
        					</div>

        					<div class="row">
            					<div class="input-field col s12">
            					<input placeholder="Placeholder" id="first_name" type="text" class="validate">
           	 					<label for="first_name">URL de la imagen</label>
            					</div>
        					</div>
        					<div class="row">
            					<div class="input-field col s12">
            					<input placeholder="Placeholder" id="first_name" type="text" class="validate">
            					<label for="first_name">Descripcion del producto</label>
            					</div>
        					</div>
        					<input type="submit" class="waves-effect waves-light btn-large modal-trigger col s12" value="Enviar"></input>
    						</form>

                        </div>
                        <div class="modal-footer">
                            <a href="#!" class="modal-close waves-effect waves-green btn-flat" >Cerrar</a>
                        </div>
                        </div>
                </div>


                <div class="col s12 botones">
                    <a class="waves-effect waves-light btn-large modal-trigger col s12" href="#modalEditar">Editar producto</a>

                    <div id="modalEditar" class="modal">
                            <div class="modal-content">
                                <h4>Editar producto</h4>


                            </div>
                            <div class="modal-footer">
                                <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
                            </div>
                    </div>
                </div>
                
                <div class="col s12 botones">
                    <a class="waves-effect waves-light btn-large modal-trigger col s12" href="#modalBorrar">Borrar producto</a>

                    <div id="modalBorrar" class="modal">
                            <div class="modal-content">
                                <h4>Borrar producto</h4>


                            </div>
                            <div class="modal-footer">
                                <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
                            </div>
                            </div>
                        </div>

                <div class="col s12 botones">
                    <a class="waves-effect waves-light btn-large modal-trigger col s12" href="#modalFactura">Facturas</a>

                    <div id="modalFactura" class="modal">
                            <div class="modal-content">
                                <h4>Facturas</h4>


                            </div>
                            <div class="modal-footer">
                                <a href="#!" class="modal-close waves-effect waves-green btn-flat">Agree</a>
                            </div>
                            </div>
                        </div>
            
                <div class="col-12 botones">


                        <a href="view/vIndex.html" class="waves-effect waves-light btn-large modal-trigger col s12">Cambiar de usuario</a>

                </div>
        
        </div>
    </div>
</body>
<!-- Compiled and minified JavaScript -->
<script src='https://code.jquery.com/jquery-3.3.1.slim.min.js' integrity='sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo' crossorigin='anonymous'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js'></script>  
<script src="js/javascript.js"></script>
<script>
    $(document).ready(function(){
        $('.modal').modal();
        $('select').formSelect();
    });
</script>
</html>