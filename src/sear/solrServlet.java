package sear;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class solrServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			request.setCharacterEncoding("GBK");
			response.setContentType("text/html;charset=GBK");
			String textString = request.getParameter("txt");
			System.out.print(textString);

			
}
	
	
}
