package jp.co.sunselcospace.data;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author 山下 諒
 */
public class ConnectionManager {
	private static final String JNDI_NAME = "java:comp/env/jdbc/sun_selco_space";

	/**
	 * データベースとの接続を行う際のConnectionを返す。
	 * @author 山下 諒
	 *
	 * @return Connection
	 *
	 * @throws NamingException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws NamingException, SQLException {
		Context ctx = null;
		try {
			ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup(JNDI_NAME);
			return dataSource.getConnection();

		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}
	}
}
