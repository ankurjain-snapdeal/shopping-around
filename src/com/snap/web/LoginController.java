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

import com.snap.vo.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		String uname = request.getParameter("txtname");
		String pwd = request.getParameter("txtpwd");
		ServletContext ctx = getServletContext();
		String view;
		Map<String, User> umap = (Map)ctx.getAttribute("lmap");
		User user = umap.get(uname);
		if(user!=null) {
			if(user.getPwd().equals(pwd))  {
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
