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
 * 一个  Servlet ，获取服务端时间
 * tomcat 接收 http 请求后
 * @author Administrator
 *
 */

public class TimeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// 告诉浏览器返回的是一个 html 文件
		rep.setContentType("text/html");
		
		PrintWriter out = rep.getWriter();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String now = sdf.format(date);
		
		// 此处省略了网页的基本结构
		out.println("<p>" + now + "</p>");
		out.close();
	
	}	

}
