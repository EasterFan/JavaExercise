package mysqljdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库工具类
 * 
 * @author easter
 *
 */
public class DbUtils {

	// 定义成静态，避免每次调用重复生成变量，造成垃圾冗余
	// 消除参数在软件中的硬编码 -- 将参数写到文件中，用户不需要改程序，只需要改文件
	static String driver;
	static String url;
	static String username;
	static String password;

	// 读取文件中的连接参数

	static {
		try {
			// 1. 创建 Properties 对象
			Properties cfg = new Properties();

			// 2. 创建 流文件 -- java 反射读取 resource 中的文件
			InputStream in = DbUtils.class.getClassLoader().getResourceAsStream("db.properties");

			// 3. 利用 load() 方法，将文件内容读取到散列表中
			// 读文件就会有 IO 异常
			cfg.load(in);

			// 4. 给连接参数赋值
			driver = cfg.getProperty("jdbc.driver");
			url = cfg.getProperty("jdbc.url");
			username = cfg.getProperty("jdbc.username");
			password = cfg.getProperty("jdbc.password");

			in.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("cfg数据库配置文件读取失败。");
			// 抛出，否则编译错误
			throw new RuntimeException(e);
		}
	}

	/**
	 * 加载驱动， 建立连接
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
			// return 和 throw 都可作为返回结果
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 关闭数据库连接
	 */
	public static void close(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("数据库关闭失败");
				e.printStackTrace();
			}
		}
	}

}
