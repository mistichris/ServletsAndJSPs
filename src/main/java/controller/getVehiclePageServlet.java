package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CostCalculator;

/**
 * Servlet implementation class getVehiclePageServlet
 */
@WebServlet("/getVehiclePageServlet")
public class getVehiclePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getVehiclePageServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String startPoint = request.getParameter("startPoint");
		String endPoint = request.getParameter("endPoint");
		String totalMiles = request.getParameter("totalMiles");
		
		CostCalculator userTripEntries = new CostCalculator(startPoint, endPoint, Double.parseDouble(totalMiles));
		
		request.setAttribute("userTripEntries", userTripEntries);
		
		getServletContext().getRequestDispatcher("/vehicle.jsp").forward(request, response);
	}

}
