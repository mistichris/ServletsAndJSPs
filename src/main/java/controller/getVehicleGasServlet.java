package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CostCalculator;

/**
 * Servlet implementation class getVehicleGasServlet
 */
@WebServlet("/getVehicleGasServlet")
public class getVehicleGasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getVehicleGasServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String startPoint = request.getParameter("startPoint");
		String endPoint = request.getParameter("endPoint");
		String totalMiles = request.getParameter("totalMiles");
		String tankCapacity = request.getParameter("tankCapacity");
		String milesPerGallon = request.getParameter("milesPerGallon");
		String gasPrice = request.getParameter("gasPrice");
		
		CostCalculator userStats = new CostCalculator(Double.parseDouble(gasPrice), Double.parseDouble(tankCapacity), Double.parseDouble(totalMiles), Double.parseDouble(milesPerGallon), startPoint, endPoint);
		
		request.setAttribute("userStats", userStats);
		
		getServletContext().getRequestDispatcher("/tripcostresponse.jsp").forward(request, response);
	}

}
