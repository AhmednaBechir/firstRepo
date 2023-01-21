package servletFib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exemple4 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse rep) throws IOException {
		PrintWriter out;
		String [] titreDuLivre =new String[2];
		// positionne le type MIME pour la réponse
		rep.setContentType("text/html");
		// récupère une référence vers le flux d'écriture
		out = rep.getWriter();
		// récupère le contenu du champ "TitreLivre" saisi par le client
		titreDuLivre[0] = req.getParameter("TitreLivre");
		titreDuLivre[1] = req.getParameter("titreLivre");
		out.println("Titre des livres choisis : " + titreDuLivre[0]+", et : "+titreDuLivre[1]);
		// toujours fermer le flux d'écriture
		out.close();
		
	}
	
}	