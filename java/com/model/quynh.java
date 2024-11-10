package com.model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class quynh
 */
@WebServlet("/quynh")
public class quynh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public quynh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = (User) request.getAttribute("user");
		if (user != null) {
            request.setAttribute("user", user); 
            getServletContext().getRequestDispatcher("/Form.jsp").forward(request, response);
        } else {
            response.sendRedirect("Form.jsp");
        }
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String diachi = request.getParameter("Diachi");
		String Date = request.getParameter("Ngay");
		String sex = request.getParameter("gt");
		String[] loaiship = request.getParameterValues("Giaohang");
		

	User user = new User();
	
	user.setEmail(email);
	user.setName(name);
	user.setLoaiship(loaiship);
	user.setDiachi(diachi);
	user.setSex(sex);
	
	System.out.println("Email: "+user.getEmail());
	System.out.println("Ho va ten:" +user.getName());
	System.out.println("Dia chi: " +user.getDiachi());
	System.out.println("Gioi tinh: " +user.getSex());
	if (loaiship != null) {
        for (String loaishipOption : loaiship) {
            System.out.println("Giao Hàng: " + loaishipOption);
        }
    } else {
        System.out.println("Không có tùy chọn giao hàng nào được chọn.");
    }
	
	request.setAttribute("user", user);
	String url = "/Confirm.jsp";
	getServletContext().getRequestDispatcher(url).forward(request, response);
	System.out.println("-----------------------------------------");
	}
		

}