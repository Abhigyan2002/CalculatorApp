package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Backend
 */
@WebServlet("/runme")
public class Backend extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String[] jokes = {
		        "Why do Java developers wear glasses? Because they don't C#!",
		        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
		        "Why don't programmers like nature? It has too many bugs.",
		        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
		        // Add more jokes here
		    };
		
		String joke=jokes[(int)(Math.random()*jokes.length)];
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int op=Integer.parseInt(request.getParameter("btn1"));
		String result="";
		if(op==1)
			result=Integer.toString(num1+num2);
		else if(op==2)
			result=Integer.toString(num1-num2);
		else if(op==3)
			result=Integer.toString(num1*num2);
		else
			result=Double.toString(num1*1.0/num2);
		
//		PrintWriter writer=response.getWriter();
//		response.setContentType("text/html");
//		writer.println(("""
//				<h3>Result=%s</h3>
//				""").formatted(result));
		
		response.sendRedirect("result.jsp?ans="+result+"&joke="+joke);
	}

}
