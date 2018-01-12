package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GrayBreadBean;
import service.AddGrayBreadDao;

/**
 * Servlet implementation class AddGrayBreadServlet
 */
@WebServlet("/AddGrayBreadServlet")
public class AddGrayBreadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGrayBreadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String graybeardID = (String) request.getParameter("graybeardID");
		String userID = (String) request.getParameter("userID");
		String graybeardName = (String) request.getParameter("graybeardName");
		String graybeardLastName = (String) request.getParameter("graybeardLastName");
		String graybeardOld = (String) request.getParameter("graybeardOld");
		String cult = (String) request.getParameter("cult");
		String foodAllergy = (String) request.getParameter("foodAllergy");
		String drugAllergy = (String) request.getParameter("drugAllergy");
		String graybeardAdress = (String) request.getParameter("graybeardAdress");
		String doctorID = (String) request.getParameter("doctorID");

		
		GrayBreadBean grayBreadBean = new GrayBreadBean();
		grayBreadBean.setGraybeardID(graybeardID);
		grayBreadBean.setUserID(userID);
		grayBreadBean.setGraybeardName(graybeardName);
		grayBreadBean.setGraybeardLastName(graybeardLastName);
		grayBreadBean.setGraybeardOld(graybeardOld);
		grayBreadBean.setCult(cult);
		grayBreadBean.setFoodAllergy(foodAllergy);
		grayBreadBean.setDrugAllergy(drugAllergy);
		grayBreadBean.setGraybeardAdress(graybeardAdress);
		grayBreadBean.setDoctorID(doctorID);
		
		AddGrayBreadDao addGrayBreadDao = new AddGrayBreadDao();
		addGrayBreadDao.addGrayBeard(grayBreadBean);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/AddGrayBread.jsp");
		if (dispatcher != null) {
			dispatcher.forward(request, response);
		}
		
		
	}

}