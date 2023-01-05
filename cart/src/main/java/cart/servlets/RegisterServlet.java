package cart.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cart.entity.User;
import cart.helper.FactoryProvider;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name="RegisterServlet", urlPatterns = {"/RegisterServet"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpS ervletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			try {
				String userName = request.getParameter("user_name");
				String userEmail = request.getParameter("user_email");
				String userPassword = request.getParameter("user_password");
				String userPhone = request.getParameter("user_phone");
				String userAddress = request.getParameter("user_address");
				
				//Validation
				
				if(userName.isEmpty()) {
					out.println("Name is blank");
					return;
				}
				
				//creating user object to store data 
				
				User user = new User(userName, userEmail, userPassword, userPhone,"default.jpg", userAddress,"normal");
				
				Session hiernateSession = FactoryProvider.getFactory().openSession();
				 
				 Transaction tx =hiernateSession.beginTransaction();
				 
				 int uId = (int) hiernateSession.save(user);
				
				 tx.commit();
				hiernateSession.close();
				
				out.println("Transaction is completed");
				out.println("The user id is "+ uId);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
	}

}
