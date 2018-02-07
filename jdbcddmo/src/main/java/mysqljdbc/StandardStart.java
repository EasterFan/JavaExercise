package mysqljdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * jdbc ���ӵı�׼д��
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
			
			// �ر�
			rs.close();  // �ͷŲ�ѯ���
			st.close();  // �ͷ�������
			
		} catch (SQLException e) {
			System.out.println("");
			e.printStackTrace();
		} finally{
			
			DbUtils.close(conn);
		}
		
	}

}
