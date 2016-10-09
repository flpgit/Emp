package cn.mldn.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.coyote.http11.filters.SavedRequestInputFilter;

import com.sun.javafx.scene.control.skin.TableHeaderRow;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.message.SuppressAutomaticWSARequestHeadersFeature;

public class DatabaseConnection {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String DBUSER = "scott";
	private static final String PASSWORD = "tiger";
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	private static Connection rebuildConnection() {
		try {
			Class.forName(DBDRIVER);
			return DriverManager.getConnection(DBURL, DBUSER, PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Connection get() {
		Connection conn = threadLocal.get();
		if (conn == null) {
			conn = DatabaseConnection.rebuildConnection();
			threadLocal.set(conn);

		}
		return conn;
	}

	public static void close() {
		Connection conn = threadLocal.get();
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadLocal.remove();
	}

}
