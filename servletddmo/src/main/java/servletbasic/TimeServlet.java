package servletbasic;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * һ��  Servlet ����ȡ�����ʱ��
 * tomcat ���� http �����
 * @author Administrator
 *
 */

public class TimeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// ������������ص���һ�� html �ļ�
		rep.setContentType("text/html");
		
		PrintWriter out = rep.getWriter();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		
		// �˴�ʡ������ҳ�Ļ����ṹ
		out.println("<p>" + now + "</p>");
		out.close();
	
	}	

}
