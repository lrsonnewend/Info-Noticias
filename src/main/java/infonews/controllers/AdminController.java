package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/admin"})
public class AdminController extends HttpServlet {
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try{
			req.getRequestDispatcher("/jsp/indexAdmin.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}
}