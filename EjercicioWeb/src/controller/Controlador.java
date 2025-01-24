package controller;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String usuario;
	private String clave;
	private String url;
	Connection conexion = null;

	public Controlador() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		usuario = config.getInitParameter("user");
		clave = config.getInitParameter("passw");
		url = config.getInitParameter("URLbasedatos")+ "?allowPublicKeyRetrieval=true&useSSL=false";
		
		System.out.println("USUARIOOOOOOO:"+usuario);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Cargar el driver
			System.out.println("driver cargado:"+url);
			conexion = DriverManager.getConnection(url,usuario,clave);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("driver conectado:"+usuario);
	}

	public void destroy() {
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String dato = request.getParameter("nombrecurso");
		String botonmedia = request.getParameter("media");
		String botonlistar = request.getParameter("listar");

		String consulta = "";

		try {		
			if (botonmedia != null) {
				consulta = "SELECT NUM_ALUMNO, NOMBRE, DIRECCION, NOTA1,NOTA2,NOTA3 FROM alumnos join cursos using (cod_curso) WHERE denominacion =upper(?)";
				PreparedStatement sentencia = conexion.prepareStatement(consulta);
				sentencia.setString(1, dato);
				ResultSet res = sentencia.executeQuery();
				out.println("<div id='bloque' align='center'>");
				out.println("<h2>Alumnos del curso " + dato + "</h2>");	
				out.println(
						"<table align='center' border=1><tr><th>NUM_ALUMNO</th><th>NOMBRE</th><th> DIRECCION</th><th> NOTA1</th><th>NOTA2</th><th>NOTA3</th></tr>");
				while (res.next()) {
					out.println("<tr><td> " + res.getInt(1) + "</td><td> " + res.getString(2) + "</td><td>"
							+ res.getString(3) + "</td><td>" + res.getFloat(4) + "</td><td>" + res.getFloat(5)
							+ "</td><td>" + res.getFloat(6) + "</td></tr>");
				}
				out.println("</table>");
				out.println("<p> <a href='index.jsp'>Ir al inicio</a><p>");
				sentencia.close();
			}

			if (botonlistar != null) {
				Statement st = conexion.createStatement();
				consulta = "SELECT NUM_ALUMNO, NOMBRE, DIRECCION, NOTA1,NOTA2,NOTA3, (nota1+nota2+nota3)/3, cod_curso, denominacion  FROM alumnos join cursos using (cod_curso) ";
				ResultSet res = st.executeQuery(consulta);
				out.println("<div id='bloque' align='center'>");
				out.println("<h2>Listado de todos los alumnos</h2><br>");
				out.println(
						"<table align='center' border=1><tr><th>NUM_ALUMNO</th><th>NOMBRE</th><th> DIRECCION</th><th> NOTA1</th><th>NOTA2</th><th>NOTA3</th><th>NOTA MEDIA</th><th>COD CURSO</th><th>NOMBRE CURSO</th></tr>");
				while (res.next()) {
					out.println("<tr><td>" + res.getInt(1) + "</td><td> " + res.getString(2) + "</td><td>"
							+ res.getString(3) + "</td><td>" + res.getFloat(4) + "</td><td>" + res.getFloat(5)
							+ "</td><td>" + res.getFloat(6) + "</td><td>" + res.getFloat(7) + "</td><td>"
							+ res.getInt(8) + "</td><td>" + res.getString(9) + "</td></tr>");
				}
				out.println("</table>");
				out.println("<p> <a href='index.jsp'>Ir al inicio</a><p>");
				st.close();
			}
			
		} catch (SQLException e) {
			out.println("<h2>ERROR SQL: " + e.getMessage() + "</h2>");
			e.printStackTrace();
		}
	}

}
