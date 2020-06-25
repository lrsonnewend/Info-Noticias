package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/indexLogin" })
public class IndexLoginController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("/jsp/indexLogin.jsp").forward(req, res);
        }catch (Exception e){
			System.out.println("Erro ao acessar pagina de login: "+e);
		} 
    }
}




    
    
    /* @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("index.html").forward(req, res);
        }catch (Exception e){
			System.out.println("Erro ao ir para home: "+e);
		}
       /*  UsuarioDAO dao = new UsuarioDAO();

        String email = req.setAttribute("email");
        
        String senha = req.setAttribute("senha"); */