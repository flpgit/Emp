package cn.mldn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Set;

import org.omg.PortableServer.THREAD_POLICY_ID;

import com.sun.jmx.snmp.tasks.ThreadService;

import cn.mldn.dao.IMemDAO;
import cn.mldn.dbc.DatabaseConnection;
import cn.mldn.vo.Mem;
import oracle.net.aso.b;
import oracle.net.aso.l;
import sun.awt.image.BufImgVolatileSurfaceManager;

public class MemDAOImpl implements IMemDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	public MemDAOImpl() {
		this.conn = DatabaseConnection.get();
	}

	@Override
	public boolean doCreate(Mem vo) throws Exception {
		String sql = "INSERT INTO mem(mid,name,sex,edu,birthday,salary,note) " + " VALUES(?,?,?,?,?,?)";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, vo.getMid());
		this.pstmt.setString(2, vo.getName());
		this.pstmt.setString(3, vo.getSex());
		this.pstmt.setString(4, vo.getEdu());
		this.pstmt.setDate(5, new java.sql.Date(vo.getBirthday().getTime()));
		this.pstmt.setString(6, vo.getNote());
		return this.pstmt.executeUpdate() > 0;
	}

	@Override
	public boolean doUpdate(Mem vo) throws Exception {
		String sql = "UPDATE mem SET name = ?,sex = ?,edu = ?,birthday = ?,note = ? "
				+ " WHERE mid = ?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setString(1, vo.getName());
		this.pstmt.setString(2, vo.getSex());
		this.pstmt.setString(3, vo.getEdu());
		this.pstmt.setDate(4, new java.sql.Date(vo.getBirthday().getTime()));
		this.pstmt.setString(5, vo.getNote());
		this.pstmt.setString(6, vo.getMid());
		return this.pstmt.executeUpdate() > 0;
		
	} 
	@Override
	public boolean doRemoveBatch(Set<String> ids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Mem findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mem> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mem> findAllSplit(int currentPate, int lineSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mem> findAllSplit(String column, String keyWord, int currentPate, int lineSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getAllCount() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getAllCount(int currentPage, int lineSize) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
