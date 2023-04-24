package co.edu.unbosque.model;

import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String article = request.getParameter("article");
		String quantity = request.getParameter("quantity");
		String value = request.getParameter("value");
		String names = request.getParameter("names");
		String last_names = request.getParameter("last_names");
		String type = request.getParameter("type");
		String number = request.getParameter("number");
		number = number.substring(14);
		Date dt = new Date();
		String date = new SimpleDateFormat("dd-MM-yyyy").format(dt);
		String ip = InetAddress.getLocalHost().toString();
		
		request.setAttribute("article", article);
		request.setAttribute("quantity", quantity);
		request.setAttribute("value", value);
		request.setAttribute("names", names);
		request.setAttribute("last_names", last_names);
		request.setAttribute("type", type);
		request.setAttribute("number", number);
		request.setAttribute("date", date);
		request.setAttribute("ip", ip);
		
		request.getRequestDispatcher("/receipt.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
