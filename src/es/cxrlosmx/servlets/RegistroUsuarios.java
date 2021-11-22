package es.cxrlosmx.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //Dependiendo del mètodo que estemos utilizando para enviar
    //el formulario, sera el que utilicemos, GET o POST
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//Especificamos el formato de respuesta
				PrintWriter salida=response.getWriter();
				
				//Generar Respuesta de la opeticiòn
				salida.println("<html><body>");
				salida.println("<h1 style='text-align:center'>Usuario Informacion</h1>");	
				salida.println("");
				//Se obtiene el valor que fue introducido en el input del name="nombre"
				salida.println("Nombre Introducido: "+request.getParameter("nombre"));
				salida.println("<br>");
				salida.println("Apellido Introducido: "+request.getParameter("apellido"));
				salida.println("<br>");
				salida.println("Fecha y hora actual:"+new Date());
				salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Cuando se utiliza el metodo post para enviar los datos
		//debemos especificar en que tipo de datos mostraremos
		//la respuesta de la peticion
		
		response.setContentType("text/html");
		//Especificamos el formato de respuesta
		PrintWriter salida=response.getWriter();
		
		//Generar Respuesta de la opeticiòn
		salida.println("<html><body>");
		salida.println("<h1 style='text-align:center'>Usuario Informacion</h1>");	
		salida.println("");
		//Se obtiene el valor que fue introducido en el input del name="nombre"
		salida.println("Nombre Introducido: "+request.getParameter("nombre"));
		salida.println("<br>");
		salida.println("Apellido Introducido: "+request.getParameter("apellido"));
		salida.println("<br>");
		salida.println("Fecha y hora actual:"+new Date());
		salida.println("</body></html>");
	}

}
