package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PackageBean;
import model.doctorAppointBean;
import service.PackageDAO;
import service.doctorAppointDAO;

/**
 * Servlet implementation class doctorAppointServlet
 */
@WebServlet("/doctorAppointServlet")
public class doctorAppointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doctorAppointServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doctorAppointBean doctor = new doctorAppointBean();
		PackageDAO PackageDAO = new PackageDAO();
		ArrayList<doctorAppointBean> Doctor = doctorAppointDAO.getALLDoctor();
		
		request.setAttribute("Doctor", Doctor); 
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/doctorAppoint.jsp");
		if (dispatcher != null) {

			dispatcher.forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
