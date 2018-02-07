package mysqljdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc 连接的标准写法
 * @author easter
 *
 */
public class StandardStart {

	public static void main(String[] args) {
		
		Connection conn = null;

		try {
			conn = DbUtils.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from myuser";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id + "," + name);
			}
			
			// 关闭
			rs.close();  // 释放查询结果
			st.close();  // 释放语句对象
			
		} catch (SQLException e) {
			System.out.println("");
			e.printStackTrace();
		} finally{
			
			DbUtils.close(conn);
		}
		
	}

}
