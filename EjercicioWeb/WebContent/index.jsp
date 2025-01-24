<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Ejercicio Alumnos</title>
</head>
<body>
	<div id="bloque" align='center'>
		<h2>Operaciones con alumnos y cursos</h2>
	
		<br>
		<form action="/EjercicioWeb/Controlador" method="post">
 		Teclea Nombre del curso: <input type="text" name="nombrecurso">&nbsp;&nbsp;&nbsp;&nbsp; 
 		<input	type="submit" name="media" value="Obtener Alumnos del curso" />
        <br><br>
        Pulsa para visualizar los alumnos y su nota media <input type="submit"
				name="listar" value="Listar alumnos y nota" />
		<br>
		</form>


	</div>

</body>
</html>