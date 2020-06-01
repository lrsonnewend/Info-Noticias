package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import infonews.dao.UsuarioDAO;
import infonews.models.Usuario;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/login" })
public class LoginController extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
        }catch (Exception e){
			System.out.println("Erro ao acessar pagina de login: "+e);
		}
    }   
}