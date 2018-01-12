package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GrayBreadBean;
import service.AddGrayBreadDao;
/**
 * Servlet implementation class GrayBreadListServlet
 */
@WebServlet("/GrayBreadListServlet")
public class GrayBreadListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GrayBreadListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String graybeardID = request.getParameter("id");
		if (graybeardID != null) {
			try {
				AddGrayBreadDao addGrayBreadDao = new AddGrayBreadDao();
				ArrayList<GrayBreadBean> graybreadList = addGrayBreadDao.getGrayBread(String(graybeardID));
				request.setAttribute("graybreadList", graybreadList);

				String page =null ;
				HttpSession session = request.getSession();
				if (session.getAttribute("currentUser") != null) {
					page = "/NewFile.jsp";
				

				} else {
					session.removeAttribute("currentUser");
					page = "/AddGrayBread.jsp";

				}
				System.out.println(page);
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
				if (dispatcher != null) {
					dispatcher.forward(request, response);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

		
	private Object String(String graybeardID) {
		// TODO Auto-generated method stub
		return null;
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
