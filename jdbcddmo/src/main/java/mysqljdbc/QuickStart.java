package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jdbc 连接  mysql 完整版
 * @author easter
 *
 */

public class QuickStart {

	// 演示，不建议一次抛出所有异常
	public static void main(String[] args) throws Exception {
		// 1. 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connction ok");
		
		// 2. 建立连接
		String url = "jdbc:mysql://localhost:3306/d_studentinfo";
		String username = "Administrator";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url,username,password);
		
		// 3. 创建语句对象
		Statement stmt = conn.createStatement();
		
		String ddl = "CREATE TABLE studentinfo"
				+"(id int(3)"
				+"name varchar(3))";
		
		String dml = "insert into studentinfo"
				+ "(id,name)"
				+ "values(001,'小明')";
		
		String dql = "select * from studentinfo";
		
		// 4. 执行 sql
		boolean result = stmt.execute(ddl); 
		int num = stmt.executeUpdate(dml);
		ResultSet rs = stmt.executeQuery(dql);
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString(id);
			System.out.println(id + name + "/n");
		}
		
		// true 表示有结果集， false 表示无结果集， 创建失败抛异常
		System.out.println(result + "/n" + num + "/n");	
		
		
		// 5. 关闭连接
		conn.close();
		
	}

}
