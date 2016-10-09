package cn.mldn.util.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public abstract class AbstractDAO {
	public Connection conn;
	public PreparedStatement pstmt;

}
