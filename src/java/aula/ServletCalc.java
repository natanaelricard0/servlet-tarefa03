/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package aula;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCalc extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  private int initialValue = 100; // Valor de inicialização do servlet
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String input = request.getParameter("input"); // Obtém o valor de entrada do formulário
    
    int sum = Integer.parseInt(input) + initialValue; // Realiza a soma
    
    // Cria a página de resultado
    response.setContentType("text/html");
    response.getWriter().write("<html><head><title>Resultado da Soma</title></head><body>");
    response.getWriter().write("<h1>Resultado da Soma</h1>");
    response.getWriter().write("<p>Resultado da soma: " + sum + "</p>");
    response.getWriter().write("</body></html>");
  }
}

