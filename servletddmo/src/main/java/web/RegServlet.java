package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ע��ҳ��
 * @author easter
 *
 */
public class RegServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		
		/**
		 * ע��ҳ�洫�Ĳ���
		 */
		
		// 1. ���ܲ���
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		String[] interests = req.getParameterValues("interest");
		
		//  2. ����ҵ��
		System.out.println(username);
		System.out.println(password);
		System.out.println(sex);
		
		if(interests != null){
			for(String i : interests){
				System.out.println(i);
			}
		}
		
		// 3. ������Ӧ
		// http ��Ϣͷ
		rep.setContentType("text/html");
		rep.setCharacterEncoding("utf-8");
		PrintWriter out = rep.getWriter();
		// http ʵ������
		out.println("<p>ע��ɹ�</p>");
		out.close();
		
	}
}
