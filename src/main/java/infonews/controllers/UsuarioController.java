package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/usuario"})
public class UsuarioController extends HttpServlet {
    @Override
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try{
			req.getRequestDispatcher("/jsp/indexLogin.jsp").forward(req, res);
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}   
}