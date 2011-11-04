package ufpb.dsc.alomundo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AloMundoServlet
 */
@WebServlet("/login")
public class AutenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String destino = "";
		if(login.equals("rodrigor") && senha.equals("123")){;
			request.getSession().setAttribute("nome","Rodrigo");
			destino = "/AloMundo/ctrl?open=/restrito/index.jsp";
		}else{
			destino="/AloMundo/login.jsp?msg=Login+Invalido!";
		}
		response.sendRedirect(destino);
	}

}
