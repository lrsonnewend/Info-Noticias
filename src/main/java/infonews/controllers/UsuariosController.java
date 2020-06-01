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

@WebServlet(urlPatterns = { "/usuarios" })
public class UsuariosController extends HttpServlet {
    UsuarioDAO dao = new UsuarioDAO();
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        List<Usuario> users = dao.getAllUsers();
        
        try{
            req.setAttribute("users", users);
            req.getRequestDispatcher("/WEB-INF/usuarios.jsp").forward(req, res);
        }catch(Exception e){ 
            System.err.println("Erro ao listar usuarios: "+e);
        }
   }

   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res){
       

   }
}