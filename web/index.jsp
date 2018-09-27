<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="EstiloIndex.css"/>
        <title>Gym</title>
    </head>
    <body>
        <form id="frmTest" name="frmTest" action="MostrarRutina" method="get">
        <table id="tabla" border="2">
            
          <tr>
		<td colspan ="3">
		<h1 id="h0">Consulta tu rutina recomendada de ejercicios</h1>
		</td>
          </tr>  
            
          <tr>
				<td id=>
				
				<h1 id="h1">Sexo</h1>
				
				</td>
				<td id=>
				
				<select tabindex="3" id="Tipo_c" name="Tipo_c">
                			<option value="">Seleccione una opcion</option>
                			<option value="cliente">Hombre</option>
                			<option value="proveedor">Mujer</option>

                			</select>
				</td>
				
			
				<td rowspan="3">
				<img src="https://static.vecteezy.com/system/resources/previews/000/087/319/non_2x/gym-logo-template-vector.jpg"></img>
				</td>
			</tr>
			

			<tr>
				<td id="col12">
				
				<h1 id="h2">Estatura</h1>
				
				</td>
				<td id="col22">
				
                                    <h1><input type="text" id="Estatura" name="Estatura"></input>  m</h1>
				
				</td>
			</tr>

			<tr>
				<td id="col13">
				
				<h1 id="h3">peso</h1>
				
				</td>
				<td id="col23">
				<h1><input type="text" id="Cll" name="Cll"></input>  Kg</h1>
				
				</td>
			</tr>
                        
                        <tr>
                            
                            <td colspan ="3">  
                        <input type="submit" value="Consultar">
                            </td>
                            
                        </tr>
        </table>
        </form>
    </body>
</html>
