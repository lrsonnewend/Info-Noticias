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

@WebServlet(urlPatterns = { "/usuariosAdmin" })
public class UsuariosAdminController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        UsuarioDAO dao  = new UsuarioDAO(); 
        
        List<Usuario> usuarios = dao.getAllUsers();

        try{
            req.setAttribute("usuarios", usuarios);
            req.getRequestDispatcher("/jsp/usuariosAdmin.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao pegar usuários: "+e);
        }
    }

    @Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) {
		try {
			int id = Integer.parseInt(req.getParameter("id"));
            UsuarioDAO dao  = new UsuarioDAO(); 
            dao.remove(id);
			
		} catch (Exception e) {
			System.out.println("Erro em IO ou no Servlet");
		}	
	}
}
