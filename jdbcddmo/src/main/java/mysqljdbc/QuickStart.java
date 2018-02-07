package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jdbc ����  mysql ������
 * @author easter
 *
 */

public class QuickStart {

	// ��ʾ��������һ���׳������쳣
	public static void main(String[] args) throws Exception {
		// 1. ��������
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("connction ok");
		
		// 2. ��������
		String url = "jdbc:mysql://localhost:3306/d_studentinfo";
		String username = "Administrator";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url,username,password);
		
		// 3. ����������
		Statement stmt = conn.createStatement();
		
		String ddl = "CREATE TABLE studentinfo"
				+"(id int(3)"
				+"name varchar(3))";
		
		String dml = "insert into studentinfo"
				+ "(id,name)"
				+ "values(001,'С��')";
		
		String dql = "select * from studentinfo";
		
		// 4. ִ�� sql
		boolean result = stmt.execute(ddl); 
		int num = stmt.executeUpdate(dml);
		ResultSet rs = stmt.executeQuery(dql);
		while(rs.next()){
			int id = rs.getInt("id");
			String name = rs.getString(id);
			System.out.println(id + name + "/n");
		}
		
		// true ��ʾ�н������ false ��ʾ�޽������ ����ʧ�����쳣
		System.out.println(result + "/n" + num + "/n");	
		
		
		// 5. �ر�����
		conn.close();
		
	}

}
