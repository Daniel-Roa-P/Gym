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
		<h1>Consulta tu rutina recomendada de ejercicios</h1>
		</td>
          </tr>  
            
          <tr>
				<td>
				
				<h1>Sexo</h1>
				
				</td>
				<td>
				
				<select tabindex="3" id="Sexo" name="Sexo">
                			<option value="">Seleccione una opcion</option>
                			<option value="Hombre">Hombre</option>
                			<option value="Mujer">Mujer</option>

                			</select>
				</td>
				
			
				<td rowspan="3">
				<img src="https://static.vecteezy.com/system/resources/previews/000/087/319/non_2x/gym-logo-template-vector.jpg"></img>
				</td>
			</tr>
			

			<tr>
				<td>
				
				<h1>Estatura</h1>
				
				</td>
                                
				<td>
				
                                    <h1><input type="text" id="Estatura" name="Estatura"></input>  m</h1>
				
				</td>
			</tr>

			<tr>
				<td>
				
				<h1>peso</h1>
				
				</td>
				<td>
				<h1><input type="text" id="Peso" name="Peso"></input>  Kg</h1>
				
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
