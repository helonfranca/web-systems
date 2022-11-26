package Cadastroalunos;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ServletAlunos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Aluno> Dados = new ArrayList<Aluno>();
  
    public ServletAlunos() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		
		Aluno aluno = new Aluno();
		System.out.println(Dados);
		System.out.println(aluno);
		aluno.setNome(request.getParameter("nome"));
		System.out.println(aluno.getNome());
		aluno.setMatricula(request.getParameter("matricula"));
		System.out.println(aluno);
		Dados.add(aluno);
		System.out.println(Dados);
		
		
		PrintWriter out = response.getWriter();
		out.println("<p>Nome: "+aluno.getNome()+"</p>" + "<p>Matricula: "+aluno.getMatricula()+"</p>");
		
	}

}
