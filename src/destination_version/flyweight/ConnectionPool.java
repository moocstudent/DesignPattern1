package destination_version.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 */
public class ConnectionPool {
	
	private Vector<Connection> pool;
	
	/*��������*/
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	/*���췽������һЩ��ʼ������*/
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* �������ӵ����ӳ� */
	public synchronized void release() {
		pool.add(conn);
	}

	/* �������ӳ��е�һ�����ݿ����� */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}
}
