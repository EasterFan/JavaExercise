package servletbasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Administrator
 *
 */
public class HttpsServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		rep.setContentType("text/html");
		rep.setCharacterEncoding("utf-8");
		
		PrintWriter out = rep.getWriter();
		
		// request : 1. ����������
		String reqMethod = req.getMethod();
		String reqServletPath = req.getServletPath();
		String reqProtocol = req.getProtocol();
		
		out.println("���������ݣ�" + "</br>");
		out.println("����ʽ" + reqMethod + "</br>" +
				"����·��" + reqServletPath + "</br>"+
				"����ʽ" + reqProtocol);
		
		// request : 2. ��Ϣͷ����ֵ�ԣ�
		// Enumeration �ϰ汾������ ���÷�ͬ iterator
		out.println("���������Ϣͷ" + "</br>");
		Enumeration<String> e = req.getHeaderNames();
		while(e.hasMoreElements()){
			String key = e.nextElement();
			String value = req.getHeader(key);
			out.println(
					key + ":" +  value);
		}
		
		
		
		
		
		
		
		
		out.close();
		
	}
}
