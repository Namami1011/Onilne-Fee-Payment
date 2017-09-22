package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.db.StudDb;

/**
 * Servlet implementation class DelStud
 */
@WebServlet("/DelStud")
public class DelStud extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String srollno=request.getParameter("rollno");
		int rollno=Integer.parseInt(srollno);
		StudDb.delete(rollno);
		response.sendRedirect("Viewstud");
	}
}
