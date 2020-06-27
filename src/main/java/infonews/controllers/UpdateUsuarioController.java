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

@WebServlet(urlPatterns = { "/updateUsuario" })
public class UpdateUsuarioController extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        UsuarioDAO dao  = new UsuarioDAO();

        String id = req.getParameter("id");
        
        int idUsuario = Integer.parseInt(id);

        List<Usuario> usuario = dao.findById(idUsuario);

        try{
            req.setAttribute("usuario", usuario);
            req.getRequestDispatcher("/jsp/updateUsuario.jsp").forward(req, res);
        }catch(Exception e){
            System.err.println("Erro ao listar usuários: "+e);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        UsuarioDAO dao = new UsuarioDAO();
        
        Usuario usuario = new Usuario();        
        String id = req.getParameter("id").toString();

        usuario.setId(Integer.parseInt(id));
        usuario.setIsAdmin(Boolean.parseBoolean(req.getParameter("isAdmin")));
        usuario.setEmail(req.getParameter("email").toString());
        usuario.setSenha(req.getParameter("senha").toString());
        
        dao.updateUsers(usuario);
        try{
            res.sendRedirect(req.getContextPath() + "/usuariosAdmin");
        }catch (Exception e){
            System.out.println("Erro ao ir para home: "+e);
        }
    }
}