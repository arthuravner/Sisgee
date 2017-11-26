package view;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import view.commands.BuscarAlunoCommand;
import view.commands.Command;

@WebServlet("/FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
    
	private static Map<String, Command> comandos = new HashMap<String, Command>();
	
	static{
		comandos.put("BuscarAluno", new BuscarAlunoCommand());
	}	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try{
			String action = req.getParameter("action");
			System.out.println("Action: " + action);
			comandos.get(action).execute(req, resp);
		} catch(Exception e){			
			req.getRequestDispatcher("/erro.jsp").forward(req, resp);
		}
	}
}
