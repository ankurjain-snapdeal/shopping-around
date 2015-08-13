package com.snap.web;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.snap.dao.DaoI;
import com.snap.dao.DaoImpl;
import com.snap.vo.User;

/**
 * Servlet implementation class LoginController
 */
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sess = request.getSession(false);
		if(sess!=null) {
			sess.invalidate();
		}
		response.sendRedirect("Index.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String phoneno = request.getParameter("contact");
		ServletContext ctx = getServletContext();
		String view;
		
		
		DaoI dao = new DaoImpl();
		dao.ge
		
		
		
		
		User user = umap.get(username);
		if(user!=null) {
			if(user.getPwd().equals(password))  {
				HttpSession sess = request.getSession();
				sess.setAttribute("login", user);
				view = "Home.jsp";
			}else {
				request.setAttribute("msg", "You are not authenticated");
				view = "Index.jsp";
			}
		}else {
			request.setAttribute("msg", "You are not authenticated");
			view = "Index.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

}
