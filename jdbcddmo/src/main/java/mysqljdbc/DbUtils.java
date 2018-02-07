package mysqljdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * ���ݿ⹤����
 * 
 * @author easter
 *
 */
public class DbUtils {

	// ����ɾ�̬������ÿ�ε����ظ����ɱ����������������
	// ��������������е�Ӳ���� -- ������д���ļ��У��û�����Ҫ�ĳ���ֻ��Ҫ���ļ�
	static String driver;
	static String url;
	static String username;
	static String password;

	// ��ȡ�ļ��е����Ӳ���

	static {
		try {
			// 1. ���� Properties ����
			Properties cfg = new Properties();

			// 2. ���� ���ļ� -- java �����ȡ resource �е��ļ�
			InputStream in = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");

			// 3. ���� load() ���������ļ����ݶ�ȡ��ɢ�б���
			// ���ļ��ͻ��� IO �쳣
			cfg.load(in);

			// 4. �����Ӳ�����ֵ
			driver = cfg.getProperty("jdbc.driver");
			url = cfg.getProperty("jdbc.url");
			username = cfg.getProperty("jdbc.username");
			password = cfg.getProperty("jdbc.password");

			in.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("cfg���ݿ������ļ���ȡʧ�ܡ�");
			// �׳�������������
			throw new RuntimeException(e);
		}
	}

	/**
	 * ���������� ��������
	 * 
	 * @return object
	 */
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);

			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			// return �� throw ������Ϊ���ؽ��
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * �ر����ݿ�����
	 */
	public static void close(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("���ݿ�ر�ʧ��");
				e.printStackTrace();
			}
		}
	}

}
