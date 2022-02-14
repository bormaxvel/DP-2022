package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Crud.Lab2CrudInterface;
import Gamepads.GamepadsClass;

/**
 * Servlet implementation class GamepadsServlet
 */
public class GamepadsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	ServletConfigInterface servletConfig;
	Lab2CrudInterface lab2Crud;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GamepadsServlet() {
        super();
        this.servletConfig = new ServletConfig();
        this.lab2Crud = servletConfig.GetCrud();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.println("["+lab2Crud.readGamepads()+"]");
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		int price = Integer.parseInt(request.getParameter("price"));
		float weight = Float.parseFloat(request.getParameter("weight"));
		lab2Crud.updateGamepads(new GamepadsClass(title, price, weight));
	}

}
