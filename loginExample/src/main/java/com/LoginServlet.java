package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Good Morning Guys at Codemind Batch: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside doPost method of LoginServlet");
			
		LoginDAO ld = new LoginDAO();
		
		String userName = request.getParameter("useName");
		String pass = request.getParameter("pass");
		
		PrintWriter pw = response.getWriter();
		
		if(ld.authenticateUser(userName, pass)) {
		//if(userName.equals("admin") && pass.equals("admin")) {
			HttpSession session = request.getSession();
			session.setAttribute("user", userName);
			response.sendRedirect("welcome.jsp");
		} else {
			
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			pw.write("<font color=red> User Name OR Password Is Incorrect </font>");
			rd.include(request, response);
		}
		
		
		
	}

}
