package com.rodrigor.exemplos.ecommerce;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListarProdutosServlet
 */
@WebServlet("/listar")
public class ListarProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProdutosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Contexto de SESSÃO
		CestaCompras cesta = (CestaCompras)request.getSession().getAttribute("cesta");
		
		
		// Contexto de Aplicação
		EcommerceFacade facade = (EcommerceFacade) request.getServletContext().getAttribute("facade");
		
		List<Produto> lista = facade.listarProdutos();
		
		// Contexto de Requisição
		request.setAttribute("listaProdutos", lista);
		
		request.getRequestDispatcher("listarProdutos.jsp").forward(request,response);
	}



}
