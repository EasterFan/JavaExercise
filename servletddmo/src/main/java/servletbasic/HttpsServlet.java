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
		
		// request : 1. 请求行数据
		String reqMethod = req.getMethod();
		String reqServletPath = req.getServletPath();
		String reqProtocol = req.getProtocol();
		
		out.println("请求行数据：" + "</br>");
		out.println("请求方式" + reqMethod + "</br>" +
				"访问路径" + reqServletPath + "</br>"+
				"请求方式" + reqProtocol);
		
		// request : 2. 消息头（键值对）
		// Enumeration 老版本迭代器 ，用法同 iterator
		out.println("遍历输出消息头" + "</br>");
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
