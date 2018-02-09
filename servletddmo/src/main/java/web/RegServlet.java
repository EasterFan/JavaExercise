package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 注册页面
 * @author easter
 *
 */
public class RegServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		
		/**
		 * 注册页面传的参数
		 */
		
		// 1. 接受参数
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		String[] interests = req.getParameterValues("interest");
		
		//  2. 处理业务
		System.out.println(username);
		System.out.println(password);
		System.out.println(sex);
		
		if(interests != null){
			for(String i : interests){
				System.out.println(i);
			}
		}
		
		// 3. 发送响应
		// http 消息头
		rep.setContentType("text/html");
		rep.setCharacterEncoding("utf-8");
		PrintWriter out = rep.getWriter();
		// http 实体内容
		out.println("<p>注册成功</p>");
		out.close();
		
	}
}
