package demoe13;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Car extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String carName=req.getParameter("nameofthecar");
		PrintWriter printWriter=res.getWriter();
		printWriter.print("YOU CAR NAME IS :::"+carName);
	}

}
