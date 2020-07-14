package infonews.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import infonews.dao.UsuarioDAO;
import infonews.models.Usuario;

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
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        UsuarioDAO dao  = new UsuarioDAO();
        Usuario usuario = new Usuario();

        usuario.setEmail(req.getParameter("email"));
		usuario.setSenha(req.getParameter("senha"));
		usuario.setIsAdmin(false);

        if(dao.createUser(usuario)){
            try{
                res.sendRedirect(req.getContextPath() + "/login");
            }catch(Exception e){
                System.err.println("Erro ao cadastrar usuário: "+e);
            }
        }
    }
}