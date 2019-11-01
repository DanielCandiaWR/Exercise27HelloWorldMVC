package com.exercise27helloworld.controller;
import com.exercise27helloworld.model.UserModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid = "";
		String sname = "";
		String sage = "";
		
		sid = request.getParameter("userId");
		sname = request.getParameter("userName");
		sage = request.getParameter("userAge");
		
		UserModel myUser = new UserModel();
		myUser.setId(Integer.parseInt(sid.trim()));
		myUser.setName(sname);
		myUser.setAge(Byte.parseByte(sage.trim()));
		
		response.getWriter().append("The user id is: "+myUser.getId()+"\n");
		response.getWriter().append("The user name is: "+myUser.getName()+"\n");
		response.getWriter().append("The user age is: "+myUser.getAge()+"\n");
		
		/*response.getWriter().append(Long.toString(myUser.getId())+" ");
		response.getWriter().append(myUser.getName()+" ");
		response.getWriter().append(Byte.toString(myUser.getAge()));*/
		
		//this is for front
		/*response.getWriter().append("The id input is: "+sid);
		response.getWriter().append("The input name is: "+sname);
		response.getWriter().append("The input age is: "+sage);*/
	}

}
